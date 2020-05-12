package com.project.housingproject.repositories;

import com.project.housingproject.entities.NewsEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface NewsRepository extends JpaRepository<NewsEntity,Long> {
    NewsEntity findByNid(int nId);
    Page<NewsEntity> findByNtitleContains(String title, Pageable pageable);
    Page<NewsEntity> findByNsourceContains(String source,Pageable pageable);
    Page<NewsEntity> findByOrderByNdateDesc(Pageable pageable);
}
