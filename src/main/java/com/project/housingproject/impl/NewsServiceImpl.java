package com.project.housingproject.impl;

import com.project.housingproject.entities.NewsEntity;
import com.project.housingproject.repositories.NewsRepository;
import com.project.housingproject.services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsRepository newsRepository;

    @Override
    public NewsEntity getNewsById(int nId) {
        return newsRepository.findByNid(nId);
    }

    @Override
    public Page<NewsEntity> getNewsByTitle(String title, int pageNum) {
        PageRequest pageRequest = PageRequest.of(pageNum, 20);
        return newsRepository.findByNtitleContains(title,pageRequest);
    }

    @Override
    public Page<NewsEntity> getNewsBySource(String source, int pageNum) {
        PageRequest pageRequest = PageRequest.of(pageNum, 20);
        return newsRepository.findByNsourceContains(source,pageRequest);
    }

    @Override
    public Page<NewsEntity> homeGetNews() {
        PageRequest pageRequest = PageRequest.of(0, 5);
        return newsRepository.findByOrderByNdateDesc(pageRequest);
    }

    @Override
    public Page<NewsEntity> newspageGetNews(int pageNum) {
        PageRequest pageRequest = PageRequest.of(pageNum, 20);
        return newsRepository.findByOrderByNdateDesc(pageRequest);
    }

    @Override
    public NewsEntity save(String title, String source, String content, String image) {
        NewsEntity newsEntity=new NewsEntity();
        newsEntity.setNtitle(title);
        newsEntity.setNcontent(content);
        newsEntity.setNsource(source);
        newsEntity.setNimage(image);
        newsEntity.setNdate(new Timestamp(System.currentTimeMillis()));
        return newsRepository.save(newsEntity);
    }
}
