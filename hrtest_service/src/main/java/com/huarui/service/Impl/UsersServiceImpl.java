package com.huarui.service.Impl;

import com.huarui.dao.UserDao;
import com.huarui.dao.impl.UserDaoImpl;
import com.huarui.entity.Users;
import com.huarui.service.UsersService;

import java.util.List;

/**
 * Created by Administrator on 2025/10/11 0011.
 */
public class UsersServiceImpl implements UsersService {

    @Override
    public List<Users> findall() {
        UserDao dao=new UserDaoImpl();
        return dao.findall();
    }
}
