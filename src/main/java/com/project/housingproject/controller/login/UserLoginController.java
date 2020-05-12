package com.project.housingproject.controller.login;

import com.project.housingproject.entities.*;
import com.project.housingproject.*;
import com.project.housingproject.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

@Controller
public class UserLoginController {

    @Autowired
    UserService userService;

    @CrossOrigin
    @PostMapping(value = "/api/userlogin") //前后端交互
    @ResponseBody
    public Result customerLogin(@RequestBody User requestUser){

        // 对 html 标签进行转义，防止 XSS 攻击 ？？
        String uname = requestUser.getUNAME();
        uname = HtmlUtils.htmlEscape(uname);
        User user = userService.get(uname, requestUser.getUPASSWORD());
        if (null == user || user.getUVALIDSTATUS()==0){ //客户不存在或被封禁
            return new Result(404);
        }else { //客户存在且未封禁
            return new Result(200);
        }
    }

}
