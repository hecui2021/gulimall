package com.study.gulimall.member.dao;

import com.study.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author hecui
 * @email hecui0709@163.com
 * @date 2022-09-10 22:21:06
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
