package com.energyfragment.mybatismultidatasource.framework.mapper.db1;

import com.energyfragment.mybatismultidatasource.framework.entity.db1.SysUser;
import org.apache.ibatis.annotations.Param;
/**
 * @author  zhangnbr
 * @date    2022-03-27
 * @desc    1号数据源映射-系统用户表
 */
public interface SysUserMapper {
    SysUser findById(@Param(value = "sysUserId") String sysUserId);
}
