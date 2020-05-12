package com.project.housingproject.controller;

import com.project.housingproject.entities.MediumEntity;
import com.project.housingproject.services.MediumService;
import com.project.housingproject.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MediumServiceController {

    @Autowired
    private MediumService mediumService;

    //已部署
    @RequestMapping(value = "medium/{mId}",method = RequestMethod.GET)
    public MediumEntity showMediumById(@PathVariable("mId")int mId){
        return mediumService.getMediumById(mId);
    }
}
