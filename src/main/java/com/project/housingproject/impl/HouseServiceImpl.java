package com.project.housingproject.impl;

import com.project.housingproject.entities.HouseEntity;
import com.project.housingproject.entities.QuestionEntity;
import com.project.housingproject.repositories.AgentRepository;
import com.project.housingproject.repositories.HouseRepository;
import com.project.housingproject.repositories.QuestionRepository;
import com.project.housingproject.services.HouseService;
import com.project.housingproject.viewInfo.HouseBriefView;
import com.project.housingproject.viewInfo.HouseDetailView;
import com.project.housingproject.viewInfo.QuestionView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseServiceImpl implements HouseService {
    @Autowired
    private HouseRepository houseRepository;

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public HouseEntity getHouseById(int hId) {
        return houseRepository.findByHid(hId);
    }

    //@Override
    //public Page<HouseEntity> getHousesByEstate(int eId, int pageNum) {
    //    PageRequest pageRequest=PageRequest.of(pageNum,20);
    //    return houseRepository.findByEid(eId,pageRequest);
    //}
    //
    //@Override
    //public Page<HouseEntity> getHousesByName(String name, int pageNum) {
    //    PageRequest pageRequest=PageRequest.of(pageNum,20);
    //    return houseRepository.findByHnameContains(name,pageRequest);
    //}
    //
    //@Override
    //public Page<HouseEntity> getHousesByAddress(String address, int pageNum) {
    //    PageRequest pageRequest=PageRequest.of(pageNum,20);
    //    return houseRepository.findByHaddressContains(address,pageRequest);
    //}
    //
    //@Override
    //public Page<HouseEntity> getHousesByPrice(int minimum, int maximum, int pageNum) {
    //    PageRequest pageRequest=PageRequest.of(pageNum,20);
    //    return houseRepository.findByHpriceBetween(minimum,maximum,pageRequest);
    //}
    //
    //@Override
    //public Page<HouseEntity> getHousesBySquare(int minimum, int maximum, int pageNum) {
    //    PageRequest pageRequest=PageRequest.of(pageNum,20);
    //    return houseRepository.findByHsquareBetween(minimum,maximum,pageRequest);
    //}
    //
    //@Override
    //public Page<HouseEntity> getHousesByAuditStatus(byte status, int pageNum) {
    //    PageRequest pageRequest=PageRequest.of(pageNum,20);
    //    return houseRepository.findByHverifystatus(status,pageRequest);
    //}

    @Override
    public Page<HouseBriefView> homeGetHouseBriefInfo() {
        PageRequest pageRequest=PageRequest.of(0,5);
        return houseRepository.homepageFind(pageRequest);
    }

    @Override
    public Page<HouseBriefView> housepageGetHouseBreifInfo(int pageNum) {
        PageRequest pageRequest=PageRequest.of(pageNum,20);
        return houseRepository.housepageFind(pageRequest);
    }

    @Override
    public HouseDetailView getHouseDetail(int hId) {
        return houseRepository.houseDetailFind(hId);
    }

    @Override
    public Page<HouseEntity> searchHouses(String name, String address, Number priceMin, Number priceMax, Number squareMin, Number squareMax, Pageable pageable) {
        Byte v1=1,v2=1;
        return houseRepository.findByHnameContainsAndHaddressContainsAndHpriceBetweenAndHsquareBetweenAndHvalidstatusAndHverifystatus(name,address,priceMin,priceMax,squareMin,squareMax,v1,v2,pageable);
    }

    @Override
    public HouseEntity save(HouseEntity houseEntity) {
        return houseRepository.save(houseEntity);
    }

    @Override
    public Page<QuestionView> getQuestions(int hId, Pageable pageable) {
        return questionRepository.findByHid(hId,pageable);
    }

    @Override
    public QuestionEntity saveQuestion(QuestionEntity questionEntity) {
        return questionRepository.save(questionEntity);
    }

    @Override
    public HouseEntity deleteHouse(int hId) {
        Byte valid=0;
        HouseEntity houseEntity=houseRepository.findByHid(hId);
        houseEntity.setHvalidstatus(valid);
        return houseRepository.save(houseEntity);
    }
}
