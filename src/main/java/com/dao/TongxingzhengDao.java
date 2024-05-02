package com.dao;

import com.entity.TongxingzhengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.TongxingzhengView;

/**
 * 通行证 Dao 接口
 *
 * @author 
 * @since 2021-04-21
 */
public interface TongxingzhengDao extends BaseMapper<TongxingzhengEntity> {

   List<TongxingzhengView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
