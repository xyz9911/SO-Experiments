package com.project.housingproject.controller;


import com.project.housingproject.entities.CoordinateEntity;
import com.project.housingproject.entities.EstateEntity;
import com.project.housingproject.services.EstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
public class EstateServiceController {
    @Autowired
    private EstateService estateService;

    //已部署
    @RequestMapping(value = "estate/{eId}",method = RequestMethod.GET)
    public EstateEntity showEstateController(@PathVariable("eId")int eId){
        return estateService.getEstateById(eId);
    }

    //已部署
    @RequestMapping(value = "estate/search/{page}",method = RequestMethod.GET)
    public Page<EstateEntity> searchEstates(@RequestParam(value = "name",defaultValue = "")String name,@RequestParam(value = "address",defaultValue = "")String address, @PathVariable("page")int page){
        System.out.println(estateService.getEstateByNameAndAddress(name,address,page));
        return estateService.getEstateByNameAndAddress(name,address,page);
    }

    @RequestMapping(value = "estate/coordinate/{eid}",method = RequestMethod.GET)
    public CoordinateEntity getLocation(@PathVariable(value = "eid")int eid){
        return estateService.getCoordinate(eid);
    }
}
