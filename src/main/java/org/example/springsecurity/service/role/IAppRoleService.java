package org.example.springsecurity.service.role;

import org.example.springsecurity.model.AppRole;
import org.example.springsecurity.service.IGeneralService;

public interface IAppRoleService extends IGeneralService<AppRole> {
    AppRole findByName(String name);
}
