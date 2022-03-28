package com.energyfragment.mybatismultidatasource.framework.mapper.db2;

import com.energyfragment.mybatismultidatasource.framework.entity.db2.SysUserInfo;
import org.apache.ibatis.annotations.Param;

/**
 * @author  zhangnbr
 * @date    2022-03-27
 * @desc    2号数据源映射-系统用户表
 */
public interface SysUserInfoMapper {
    SysUserInfo findById(@Param(value = "uid") String uid);
}
