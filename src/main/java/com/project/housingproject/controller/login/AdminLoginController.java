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
      Admin admin    = adminService.get(adminid, requestAdmin.getADMINPASSWORD());
        if (null == admin){ //管理员不存在
            System.out.println("登录失败");
            System.out.println(admin.getADMINPASSWORD());
            return new Result(404);
        }else { //管理员存在
            System.out.println("登录失败");
            System.out.println(admin.getADMINPASSWORD());
            return new Result(200);

        }
    }

}
