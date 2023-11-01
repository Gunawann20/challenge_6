package org.binaracademy.challenge6.service;

import org.binaracademy.challenge6.entity.Role;

public interface RoleService {
    Role findByName(String name);
}
