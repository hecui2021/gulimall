package com.study.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.study.common.utils.PageUtils;
import com.study.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author hecui
 * @email hecui0709@163.com
 * @date 2022-09-10 22:21:06
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

