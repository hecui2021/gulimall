package com.study.gulimall.order.dao;

import com.study.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author hecui
 * @email hecui0709@163.com
 * @date 2022-09-10 22:31:46
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
