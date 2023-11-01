package org.binaracademy.challenge6.service.impl;

import org.binaracademy.challenge6.dao.RoleDao;
import org.binaracademy.challenge6.entity.Role;
import org.binaracademy.challenge6.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;
    @Override
    public Role findByName(String name) {
        return roleDao.findRoleByName(name);
    }
}
