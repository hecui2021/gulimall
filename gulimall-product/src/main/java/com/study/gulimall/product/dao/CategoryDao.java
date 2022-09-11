package com.study.gulimall.product.dao;

import com.study.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author hecui
 * @email hecui0709@163.com
 * @date 2022-09-11 20:39:15
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
