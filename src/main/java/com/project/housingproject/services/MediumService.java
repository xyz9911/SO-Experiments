package com.project.housingproject.services;

import com.project.housingproject.entities.MediumEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface MediumService {
    MediumEntity getMediumById(int mId);
    Page<MediumEntity> getMediumByName(String mName, int pageNum);
    Page<MediumEntity> getMediumByAddress(String mAddress,int pageNum);
    Page<MediumEntity> getMediumByVerifyStatus(byte status,int pageNum);
}
