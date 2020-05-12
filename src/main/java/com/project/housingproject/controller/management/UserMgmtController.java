package com.project.housingproject.controller.management;



import com.project.housingproject.entities.*;
import com.project.housingproject.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
public class UserMgmtController {
    @Autowired
    UserService userService;






//    //按名字查询某个客户信息
//    @CrossOrigin
//    @GetMapping("api/adminindex/searchbyuname/{uname}")
//    @ResponseBody
//    //PathVariable
//    public List<User> findByUNAME(@PathVariable String uname) throws  Exception{ //按照用户名查找某个客户 //加参数
//        User user;
//        user = userService.getByUNAME(uname);
//        System.out.println("uname:"+ uname);
//        return Collections.singletonList(user);
//    }


    //按照UID删除某个客户信息
    @CrossOrigin
    @GetMapping("api/adminindex/deleteuser/{uid}")
    @ResponseBody
    public void deleteByUID(@PathVariable int uid) throws Exception{
        userService.deleteByUID(uid);
    }

    //查询所有客户信息
    @CrossOrigin
    @GetMapping("api/adminindex/searchuser") //不加参数
    @ResponseBody
    public List<User> list() throws Exception{
        return userService.list();
    }


    //根据UID查询客户信息
    @CrossOrigin
    @GetMapping("api//adminindex/searchuser/{uid}")
    @ResponseBody
    public List<User> findByUID(@PathVariable int uid){

        User user;
        user = userService.findByUID(uid);
        System.out.println("UID is :"+ uid);
        return Collections.singletonList(user); //OBJECT转List
    }

    //新增客户 注册功能
    @CrossOrigin
    @PostMapping("api/userregister")
    @ResponseBody
    public User add(@RequestBody User user) throws Exception{
        System.out.println("the result is:"+user.getUID());
        System.out.println("the result is:"+user.getUNAME());
        userService.addOrUpdate(user);
        return user;
    }

    //修改客户信息
    @CrossOrigin
    @PostMapping("api/adminindex/updateuser")
    @ResponseBody
    public User update(@RequestBody User user) throws Exception{
        System.out.println("the result is:"+user.getUID());
        System.out.println("the result is:"+user.getUNAME());
        userService.addOrUpdate(user);
        return user;
    }












}
