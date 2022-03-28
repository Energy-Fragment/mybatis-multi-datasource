package com.energyfragment.mybatismultidatasource.business.user.service;

import com.energyfragment.mybatismultidatasource.framework.entity.db1.SysUser;
import com.energyfragment.mybatismultidatasource.framework.entity.db2.SysUserInfo;
import com.energyfragment.mybatismultidatasource.framework.mapper.db1.SysUserMapper;
import com.energyfragment.mybatismultidatasource.framework.mapper.db2.SysUserInfoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
/**
 * @author  zhangnbr
 * @date    2022-03-27
 * @desc    测试web方法-service
 */
@Service
@RequiredArgsConstructor
public class UserService {
    private final SysUserMapper sysUserMapper;
    private final SysUserInfoMapper sysUserInfoMapper;

    public String getUserName(String db1Id,String db2Id){
        // 查询1号数据源
        SysUser sysUser = sysUserMapper.findById(db1Id);
        // 查询2号数据源
        SysUserInfo sysUserInfo = sysUserInfoMapper.findById(db2Id);
        String userName1 = "";
        String userName2 = "";
        if(sysUser != null){
            userName1 = sysUser.getUserName();
        }
        if(sysUserInfo != null){
            userName2 = sysUserInfo.getName();
        }
        return "【" + userName1 + "】和" + "【" + userName2 + "】";
    }
}
