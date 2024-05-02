package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TongxingzhengEntity;
import java.util.Map;

/**
 * 通行证 服务类
 * @author 
 * @since 2021-04-21
 */
public interface TongxingzhengService extends IService<TongxingzhengEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}