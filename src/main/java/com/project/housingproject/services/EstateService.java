package com.project.housingproject.services;

import com.project.housingproject.entities.CoordinateEntity;
import com.project.housingproject.entities.EstateEntity;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface EstateService {
    EstateEntity getEstateById(int eId);
    Page<EstateEntity> getEstateByName(String name, int pageNum);
    Page<EstateEntity> getEstateByAddress(String address,int pageNum);
    Page<EstateEntity> getEstateByNameAndAddress(String name,String address, int pageNum);
    Page<EstateEntity> getEstateByPrice(int minimum,int maximum,int pageNum);
    CoordinateEntity getCoordinate(int eid);
}
