package com.huarui.dao.impl;

import com.huarui.dao.UserDao;
import com.huarui.entity.Users;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2025/10/11 0011.
 */
public class UserDaoImpl implements UserDao{


    @Override
    public List<Users> findall() {
        List<Users> list=new ArrayList<>();
        for (int i=0; i<=8; i++){
            Users Users=new Users();
            Users.setUid(i);
            Users.setUname("xsj"+i);
            list.add(Users);
        }
        return list;
    }
}
