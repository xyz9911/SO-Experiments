package com.project.housingproject.impl;

import com.project.housingproject.entities.MediumEntity;
import com.project.housingproject.repositories.MediumRepository;
import com.project.housingproject.services.MediumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class MediumServiceImpl implements MediumService {
    @Autowired
    private MediumRepository mediumRepository;

    @Override
    public MediumEntity getMediumById(int mId) {
        return mediumRepository.findByMid(mId);
    }

    @Override
    public Page<MediumEntity> getMediumByName(String mName, int pageNum) {
        PageRequest pageRequest = PageRequest.of(pageNum, 20);
        return mediumRepository.findByMnameContains(mName,pageRequest);
    }

    @Override
    public Page<MediumEntity> getMediumByAddress(String mAddress, int pageNum) {
        PageRequest pageRequest = PageRequest.of(pageNum, 20);
        return mediumRepository.findByMaddressContains(mAddress,pageRequest);
    }

    @Override
    public Page<MediumEntity> getMediumByVerifyStatus(byte status, int pageNum) {
        PageRequest pageRequest = PageRequest.of(pageNum, 20);
        return mediumRepository.findByMverifystatus(status,pageRequest);
    }
}
