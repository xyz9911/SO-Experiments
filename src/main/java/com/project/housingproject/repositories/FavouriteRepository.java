package com.project.housingproject.repositories;

import com.project.housingproject.entities.FavouriteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FavouriteRepository extends JpaRepository<FavouriteEntity,Long> {
    List<FavouriteEntity> findByUid(int uId);
    List<FavouriteEntity> findByHid(int uId);
}
