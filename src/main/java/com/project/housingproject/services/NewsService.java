package com.project.housingproject.services;

import com.project.housingproject.entities.NewsEntity;
import org.springframework.data.domain.Page;

public interface NewsService {
    NewsEntity getNewsById(int nId);
    Page<NewsEntity> getNewsByTitle(String title,int pageNum);
    Page<NewsEntity> getNewsBySource(String source,int pageNum);
    Page<NewsEntity> homeGetNews();
    Page<NewsEntity> newspageGetNews(int pageNum);
    NewsEntity save(String title,String source,String content,String image);
}
