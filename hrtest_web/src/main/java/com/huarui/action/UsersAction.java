package com.huarui.action;

import com.huarui.entity.Users;
import com.huarui.service.Impl.UsersServiceImpl;
import com.huarui.service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2025/10/11 0011.
 */
@Controller
public class UsersAction {

    @RequestMapping("/testfindall")
    @ResponseBody
    public List<Users> findall(){
        UsersService service=new UsersServiceImpl();
        List<Users> list=service.findall();
        return list;
    }
}
