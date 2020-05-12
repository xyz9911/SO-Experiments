package com.project.housingproject.impl;

import com.project.housingproject.entities.FavouriteEntity;
import com.project.housingproject.entities.HouseEntity;
import com.project.housingproject.entities.UserEntity;
import com.project.housingproject.repositories.FavouriteRepository;
import com.project.housingproject.repositories.HouseRepository;
import com.project.housingproject.repositories.UserRepository;
import com.project.housingproject.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private FavouriteRepository favouriteRepository;

    @Autowired
    private HouseRepository houseRepository;

    @Override
    public UserEntity getUserById(int uId) {
        return userRepository.findByUid(uId);
    }

    @Override
    public Page<UserEntity> getUserByValidStatus(byte status, int pageNum) {
        PageRequest pageRequest = PageRequest.of(pageNum, 20);
        return userRepository.findByUvalidstatus(status,pageRequest);
    }

    @Override
    public FavouriteEntity setFavourite(int uId, int hId) {
        FavouriteEntity favouriteEntity=new FavouriteEntity();
        favouriteEntity.setHid(hId);
        favouriteEntity.setUid(uId);
        return favouriteRepository.save(favouriteEntity);
    }

    @Override
    public List<HouseEntity> getFavourite(int uId) {
        List<FavouriteEntity> favouriteEntities=favouriteRepository.findByUid(uId);
        List<HouseEntity> houseEntities=new ArrayList<>();
        for(FavouriteEntity favouriteEntity:favouriteEntities){
            houseEntities.add(houseRepository.findByHid(favouriteEntity.getHid()));
        }
        return houseEntities;
    }
}
