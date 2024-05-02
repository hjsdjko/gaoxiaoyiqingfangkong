package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DakajiluEntity;
import java.util.Map;

/**
 * 打卡记录 服务类
 * @author 
 * @since 2021-04-21
 */
public interface DakajiluService extends IService<DakajiluEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}