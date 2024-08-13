package ru.springboot.springboot.service;

import ru.springboot.springboot.entities.Role;

import java.util.List;

public interface RoleService {
    List<Role> allRole();
    Role findRoleById(Long id);
    void addRole(Role role);
}
