package com.project.housingproject.controller;

import com.project.housingproject.entities.FavouriteEntity;
import com.project.housingproject.entities.HouseEntity;
import com.project.housingproject.services.UserService;
import com.project.housingproject.viewInfo.UserView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserServiceController {

    @Autowired
    private UserService userService;

    //未部署
    @RequestMapping(value = "user/favourite/{uid}",method = RequestMethod.GET)
    public List<HouseEntity> showFavourite(@PathVariable("uid")int uid){
        return userService.getFavourite(uid);
    }

    //未部署
    @RequestMapping(value = "user/favourite",method = RequestMethod.POST)
    public FavouriteEntity setFavourite(@RequestParam("uid")int uid, @RequestParam("hid")int hid){
        return userService.setFavourite(uid,hid);
    }

    @RequestMapping(value = "user/name",method = RequestMethod.GET)
    public UserView showUser(@RequestParam("uname")String uname){
        return userService.getUserByName(uname);
    }
}
