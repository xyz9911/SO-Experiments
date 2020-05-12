package com.project.housingproject.services;

import com.project.housingproject.entities.HouseEntity;
import com.project.housingproject.entities.QuestionEntity;
import com.project.housingproject.viewInfo.HouseBriefView;
import com.project.housingproject.viewInfo.HouseDetailView;
import com.project.housingproject.viewInfo.QuestionView;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface HouseService {
    HouseEntity getHouseById(int hId);
    //Page<HouseEntity> getHousesByEstate(int eId,int pageNum);
    //Page<HouseEntity> getHousesByName(String name,int pageNum);
    //Page<HouseEntity> getHousesByAddress(String address,int pageNum);
    //Page<HouseEntity> getHousesByPrice(int minimum,int maximum,int pageNum);
    //Page<HouseEntity> getHousesBySquare(int minimum,int maximum,int pageNum);
    //Page<HouseEntity> getHousesByAuditStatus(byte status,int pageNum);
    Page<HouseEntity> searchHouses(String name, String address, Number priceMin, Number priceMax, Number squareMin, Number squareMax, Pageable pageable);
    Page<HouseBriefView> homeGetHouseBriefInfo();
    Page<HouseBriefView> housepageGetHouseBreifInfo(int pageNum);
    HouseDetailView getHouseDetail(int hId);
    HouseEntity save(HouseEntity houseEntity);
    Page<QuestionView> getQuestions(int hId, Pageable pageable);
    QuestionEntity saveQuestion(QuestionEntity questionEntity);
    HouseEntity deleteHouse(int hId);
}
