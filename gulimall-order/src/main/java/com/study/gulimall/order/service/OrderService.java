package com.study.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.study.common.utils.PageUtils;
import com.study.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author hecui
 * @email hecui0709@163.com
 * @date 2022-09-10 22:31:46
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

