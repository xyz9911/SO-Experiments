package com.project.housingproject.services;

import com.project.housingproject.entities.FavouriteEntity;
import com.project.housingproject.entities.HouseEntity;
import com.project.housingproject.entities.UserEntity;
import com.project.housingproject.viewInfo.UserView;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {
    //UserEntity getUserById(int uId);
    Page<UserEntity> getUserByValidStatus(byte status, int pageNum);
    FavouriteEntity setFavourite(int uId,int hId);
    List<HouseEntity> getFavourite(int uId);
    UserView getUserByName(String uname);
}
