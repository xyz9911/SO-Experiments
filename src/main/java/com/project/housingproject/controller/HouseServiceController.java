package com.project.housingproject.controller;

import com.project.housingproject.entities.HouseEntity;
import com.project.housingproject.entities.QuestionEntity;
import com.project.housingproject.postitems.QuestionPost;
import com.project.housingproject.repositories.QuestionRepository;
import com.project.housingproject.services.HouseService;
import com.project.housingproject.services.PersonalNoticeService;
import com.project.housingproject.viewInfo.HouseBriefView;
import com.project.housingproject.viewInfo.HouseDetailView;
import com.project.housingproject.viewInfo.QuestionView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.List;

@RestController
public class HouseServiceController {
    @Autowired
    private HouseService houseService;

    @Autowired
    private PersonalNoticeService personalNoticeService;

    //未部署
    @RequestMapping(value="house/post",method = RequestMethod.PUT)
    public HouseEntity create(@RequestParam(value = "eid")String eid, @RequestParam(value = "aid")String aid, @RequestParam(value = "hname")String hname, @RequestParam(value = "hprice")String hprice, @RequestParam(value = "haddress")String haddress, @RequestParam(value = "hsquare")String hsquare, @RequestParam(value = "himage")String himage, @RequestParam(value = "hinfo")String hinfo, @RequestParam(value = "hbriefinfo")String hbriefinfo){
        Byte tmp1=1,tmp2=1;
        int eId=Integer.parseInt(eid);
        int aId=Integer.parseInt(aid);
        HouseEntity houseEntity=new HouseEntity();
        houseEntity.setEid(eId);
        houseEntity.setAid(aId);
        houseEntity.setHname(hname);
        houseEntity.setHprice(new BigDecimal(hprice));
        houseEntity.setHaddress(haddress);
        houseEntity.setHsquare(new BigDecimal(hsquare));
        houseEntity.setHvalidstatus(tmp1);
        houseEntity.setHverifystatus(tmp2);
        houseEntity.setHimage(himage);
        houseEntity.setHinfo(hinfo);
        houseEntity.setHbreifinfo(hbriefinfo);
        return houseService.save(houseEntity);
    }

    //未部署
    @RequestMapping(value="house/update",method = RequestMethod.PUT)
    public HouseEntity update(@RequestParam(value = "hid")String hid, @RequestParam(value = "hname")String hname, @RequestParam(value = "hprice")String hprice, @RequestParam(value = "haddress")String haddress, @RequestParam(value = "hsquare")String hsquare, @RequestParam(value = "himage")String himage, @RequestParam(value = "hinfo")String hinfo, @RequestParam(value = "hbriefinfo")String hbriefinfo){
        HouseEntity houseEntity=houseService.getHouseById(Integer.parseInt(hid));
        houseEntity.setHbreifinfo(hbriefinfo);
        houseEntity.setHinfo(hinfo);
        houseEntity.setHimage(himage);
        houseEntity.setHprice(new BigDecimal(hprice));
        houseEntity.setHsquare(new BigDecimal(hsquare));
        houseEntity.setHname(hname);
        houseEntity.setHaddress(haddress);
        personalNoticeService.favouriteHouseNotice(Integer.parseInt(hid));
        return houseService.save(houseEntity);
    }

    //已部署
    @RequestMapping(value = "house/home",method = RequestMethod.GET)
    public Page<HouseBriefView> homeShowHouseBriefInfo(){
        return houseService.homeGetHouseBriefInfo();
    }

    //已部署
    @RequestMapping(value = "house/{page}",method = RequestMethod.GET)
    public Page<HouseBriefView> housepageShowHouseBriefInfo(@PathVariable("page")int pageNum){
        return houseService.housepageGetHouseBreifInfo(pageNum);
    }

    //已部署
    @RequestMapping(value = "house",method = RequestMethod.GET)
    public HouseDetailView showHouseDetail(@RequestParam(value = "hId",required = true)int hId){
        return houseService.getHouseDetail(hId);
    }

    //已部署
    @RequestMapping(value = "house/search",method = RequestMethod.GET)
    public Page<HouseEntity> searchHouses(@RequestParam(value = "name",defaultValue="")String name,@RequestParam(value = "address",defaultValue="")String address,@RequestParam(value = "minprice",defaultValue="0")Number minPrice,@RequestParam(value = "maxprice",defaultValue="99999")Number maxPrice,@RequestParam(value = "minsquare",defaultValue="0")Number minSquare,@RequestParam(value = "maxsquare",defaultValue="9999")Number maxSquare,@RequestParam(value = "page")int page){
        PageRequest pageRequest=PageRequest.of(page,20);
        return houseService.searchHouses(name,address,minPrice,maxPrice,minSquare,maxSquare,pageRequest);
    }

    //已部署
    @RequestMapping(value = "house/question/{page}",method = RequestMethod.GET)
    public Page<QuestionView> showQuestions(@RequestParam(value = "hId")int hId, @PathVariable(value = "page")int page){
        PageRequest pageRequest=PageRequest.of(page,5);
        return houseService.getQuestions(hId,pageRequest);
    }

    //已部署
    @RequestMapping(value = "house/question",method = RequestMethod.POST)
    public QuestionEntity postQuestion(@RequestBody QuestionPost questionPost){
        QuestionEntity questionEntity=new QuestionEntity();
        questionEntity.setHid(questionPost.hid);
        questionEntity.setQcontent(questionPost.qcontent);
        questionEntity.setUid(questionPost.uid);
        return houseService.saveQuestion(questionEntity);
    }

    //未部署
    @RequestMapping(value = "house/delete/{hId}",method = RequestMethod.PUT)
    public HouseEntity deleteHouse(@PathVariable("hId")int hId){
        return houseService.deleteHouse(hId);
    }
}
