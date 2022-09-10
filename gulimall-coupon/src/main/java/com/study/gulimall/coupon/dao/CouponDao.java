package com.study.gulimall.coupon.dao;

import com.study.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author hecui
 * @email hecui0709@163.com
 * @date 2022-09-10 18:46:58
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
