package com.eussi.shiro._05_realmandothers.service;


import com.eussi.shiro._05_realmandothers.entity.Permission;

/**
 * Created by wangxueming on 2019/3/20.
 */
public interface PermissionService {
    public Permission createPermission(Permission permission);
    public void deletePermission(Long permissionId);
}
