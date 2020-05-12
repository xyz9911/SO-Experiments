package com.project.housingproject.impl;

import com.project.housingproject.entities.CoordinateEntity;
import com.project.housingproject.entities.EstateEntity;
import com.project.housingproject.repositories.CoordinateRepository;
import com.project.housingproject.repositories.EstateRepository;
import com.project.housingproject.services.EstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class EstateServiceImpl implements EstateService {
    @Autowired
    private EstateRepository estateRepository;

    @Autowired
    private CoordinateRepository coordinateRepository;

    @Override
    public EstateEntity getEstateById(int eId) {
        return estateRepository.findByEid(eId);
    }

    @Override
    public Page<EstateEntity> getEstateByName(String name, int pageNum) {
        PageRequest pageRequest=PageRequest.of(pageNum,20);
        return estateRepository.findByEnameContains(name,pageRequest);
    }

    @Override
    public Page<EstateEntity> getEstateByAddress(String address, int pageNum) {
        PageRequest pageRequest=PageRequest.of(pageNum,20);
        return estateRepository.findByEaddressContains(address,pageRequest);
    }

    @Override
    public Page<EstateEntity> getEstateByPrice(int minimum,int maximum, int pageNum) {
        PageRequest pageRequest=PageRequest.of(pageNum,20);
        return estateRepository.findByEavgpriceBetween(minimum,maximum,pageRequest);
    }

    @Override
    public Page<EstateEntity> getEstateByNameAndAddress(String name, String address, int pageNum) {
        PageRequest pageRequest=PageRequest.of(pageNum,20);
        return estateRepository.findByEnameContainsAndEaddressContains(name,address,pageRequest);
    }

    @Override
    public CoordinateEntity getCoordinate(int eid) {
        return coordinateRepository.findByEid(eid);
    }
}
