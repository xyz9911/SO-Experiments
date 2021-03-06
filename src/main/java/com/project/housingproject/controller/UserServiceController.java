package com.project.housingproject.controller;

import com.project.housingproject.entities.FavouriteEntity;
import com.project.housingproject.entities.HouseEntity;
import com.project.housingproject.services.ExternalAPI;
import com.project.housingproject.services.UserService;
import com.project.housingproject.viewInfo.UserView;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class UserServiceController {

    @Autowired
    private UserService userService;
    @Autowired
    private ExternalAPI externalAPI;

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

    @RequestMapping(value = "user/getLocation",method = RequestMethod.GET)
    public String showCurrentLocation() throws IOException, JSONException {
        return externalAPI.getCurrentLocation();
    }
}
