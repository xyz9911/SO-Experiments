package com.project.housingproject.controller.login;

import com.project.housingproject.impl.AdminService;
import com.project.housingproject.entities.*;
import com.project.housingproject.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

@Controller
public class AdminLoginController {

    @Autowired
    AdminService adminService;

    @CrossOrigin
    @PostMapping(value = "/api/adminlogin") //前后端交互
    @ResponseBody
    public Result adminLogin(@RequestBody Admin requestAdmin){

        int adminid = requestAdmin.getADMINID();
        adminid =Integer.parseInt(HtmlUtils.htmlEscape(String.valueOf(adminid)));

//        if (!Objects.equals("admin", username) || !Objects.equals("1234", requestUser.getPassword())) {
//            System.out.println("账号密码错误！");
//            return new Result(400);
//        } else {
//            System.out.println("账号密码正确！");
//            return new Result(200);
//        }


      Admin admin    = adminService.get(adminid, requestAdmin.getADMINPASSWORD());
        if (null == admin){ //管理员不存在
            return new Result(404);
        }else { //管理员存在
            return new Result(200);

        }
    }

}
