package com.dao;

import com.entity.DakajiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.DakajiluView;

/**
 * 打卡记录 Dao 接口
 *
 * @author 
 * @since 2021-04-21
 */
public interface DakajiluDao extends BaseMapper<DakajiluEntity> {

   List<DakajiluView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
