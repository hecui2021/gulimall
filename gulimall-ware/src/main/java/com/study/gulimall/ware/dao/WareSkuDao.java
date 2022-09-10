package com.study.gulimall.ware.dao;

import com.study.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author hecui
 * @email hecui0709@163.com
 * @date 2022-09-10 22:37:21
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
