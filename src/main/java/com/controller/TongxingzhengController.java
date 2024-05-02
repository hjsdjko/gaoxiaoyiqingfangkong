package com.controller;


import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.StringUtil;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.TongxingzhengEntity;

import com.service.TongxingzhengService;
import com.entity.view.TongxingzhengView;
import com.service.YonghuService;
import com.entity.YonghuEntity;

import com.utils.PageUtils;
import com.utils.R;

/**
 * 通行证
 * 后端接口
 * @author
 * @email
 * @date 2021-04-21
*/
@RestController
@Controller
@RequestMapping("/tongxingzheng")
public class TongxingzhengController {
    private static final Logger logger = LoggerFactory.getLogger(TongxingzhengController.class);

    @Autowired
    private TongxingzhengService tongxingzhengService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;



    //级联表service
    @Autowired
    private YonghuService yonghuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
     
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "用户".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }else if(StringUtil.isNotEmpty(role) && "教师".equals(role)){
            params.put("jiaoshiId",request.getSession().getAttribute("userId"));
        }
        params.put("orderBy","id");

        List<TongxingzhengEntity> t = tongxingzhengService.selectList(null);
        for (TongxingzhengEntity txz : t){

            if(txz.getTongxingzhengTime().getTime()+(3*24*60*60*1000)>=new Date().getTime()){
                txz.setZhuangtai(1);//未过期
            }else{
                txz.setZhuangtai(2);//已过期
            }
            tongxingzhengService.updateById(txz);
        }

        PageUtils page = tongxingzhengService.queryPage(params);

        //字典表数据转换
        List<TongxingzhengView> list =(List<TongxingzhengView>)page.getList();
        for(TongxingzhengView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        TongxingzhengEntity tongxingzheng = tongxingzhengService.selectById(id);
        if(tongxingzheng !=null){
            //entity转view
            TongxingzhengView view = new TongxingzhengView();
            BeanUtils.copyProperties( tongxingzheng , view );//把实体数据重构到view中

            //级联表
            YonghuEntity yonghu = yonghuService.selectById(tongxingzheng.getYonghuId());
            if(yonghu != null){
                BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setYonghuId(yonghu.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody TongxingzhengEntity tongxingzheng, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,tongxingzheng:{}",this.getClass().getName(),tongxingzheng.toString());
        Wrapper<TongxingzhengEntity> queryWrapper = new EntityWrapper<TongxingzhengEntity>()
            .eq("yonghu_id", tongxingzheng.getYonghuId())
            .eq("tongxingzheng_quyu", tongxingzheng.getTongxingzhengQuyu())
            .eq("tongxingzheng_types", tongxingzheng.getTongxingzhengTypes())
            .eq("shenhe_types", tongxingzheng.getShenheTypes())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        TongxingzhengEntity tongxingzhengEntity = tongxingzhengService.selectOne(queryWrapper);
        if(tongxingzhengEntity==null){
            tongxingzheng.setCreateTime(new Date());
            tongxingzheng.setTongxingzhengTime(new Date());
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      tongxingzheng.set
        //  }
            tongxingzheng.setShenheTypes(0);
            tongxingzhengService.insert(tongxingzheng);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody TongxingzhengEntity tongxingzheng, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,tongxingzheng:{}",this.getClass().getName(),tongxingzheng.toString());
        //根据字段查询是否有相同数据
        Wrapper<TongxingzhengEntity> queryWrapper = new EntityWrapper<TongxingzhengEntity>()
            .notIn("id",tongxingzheng.getId())
            .andNew()
            .eq("yonghu_id", tongxingzheng.getYonghuId())
            .eq("tongxingzheng_quyu", tongxingzheng.getTongxingzhengQuyu())
            .eq("tongxingzheng_types", tongxingzheng.getTongxingzhengTypes())
            .eq("shenhe_types", tongxingzheng.getShenheTypes())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        TongxingzhengEntity tongxingzhengEntity = tongxingzhengService.selectOne(queryWrapper);
        if(tongxingzhengEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      tongxingzheng.set
            //  }
            tongxingzhengService.updateById(tongxingzheng);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        tongxingzhengService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }

    /**
    * 审核
    */
    @RequestMapping("/shenhe")
    public R shenhe(Integer ids,Integer dakajiluTypes){
        TongxingzhengEntity tongxingzheng = tongxingzhengService.selectById(ids);
        if(tongxingzheng == null){
            return R.error();
        }
        tongxingzheng.setShenheTypes(dakajiluTypes);
        tongxingzhengService.updateById(tongxingzheng);
        return R.ok();
    }



    /**
    * 前端列表
    */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "用户".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }else if(StringUtil.isNotEmpty(role) && "教师".equals(role)){
            params.put("jiaoshiId",request.getSession().getAttribute("userId"));
        }
        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = tongxingzhengService.queryPage(params);

        //字典表数据转换
        List<TongxingzhengView> list =(List<TongxingzhengView>)page.getList();
        for(TongxingzhengView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        TongxingzhengEntity tongxingzheng = tongxingzhengService.selectById(id);
            if(tongxingzheng !=null){
                //entity转view
        TongxingzhengView view = new TongxingzhengView();
                BeanUtils.copyProperties( tongxingzheng , view );//把实体数据重构到view中

                //级联表
                    YonghuEntity yonghu = yonghuService.selectById(tongxingzheng.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody TongxingzhengEntity tongxingzheng, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,tongxingzheng:{}",this.getClass().getName(),tongxingzheng.toString());
        Wrapper<TongxingzhengEntity> queryWrapper = new EntityWrapper<TongxingzhengEntity>()
            .eq("yonghu_id", tongxingzheng.getYonghuId())
            .eq("tongxingzheng_quyu", tongxingzheng.getTongxingzhengQuyu())
            .eq("tongxingzheng_types", tongxingzheng.getTongxingzhengTypes())
            .eq("shenhe_types", tongxingzheng.getShenheTypes())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
    TongxingzhengEntity tongxingzhengEntity = tongxingzhengService.selectOne(queryWrapper);
        if(tongxingzhengEntity==null){
            tongxingzheng.setCreateTime(new Date());
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      tongxingzheng.set
        //  }
        tongxingzhengService.insert(tongxingzheng);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }





}

