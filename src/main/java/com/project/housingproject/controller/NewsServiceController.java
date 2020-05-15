package com.project.housingproject.controller;

import com.project.housingproject.entities.NewsEntity;
import com.project.housingproject.postitems.NewsPost;
import com.project.housingproject.services.ExternalAPI;
import com.project.housingproject.services.NewsService;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class NewsServiceController {
    @Autowired
    private NewsService newsService;

    @Autowired
    private ExternalAPI externalAPI;

    //已部署
    @RequestMapping(value = "news/home",method = RequestMethod.GET)
    public Page<NewsEntity> homeShowNewsController(){
        return newsService.homeGetNews();
    }

    //已部署
    @RequestMapping(value = "news/{page}",method = RequestMethod.GET)
    public Page<NewsEntity> showNewsController(@PathVariable("page")int page){
        return newsService.newspageGetNews(page);
    }

    //未部署
    @RequestMapping(value = "news",method = RequestMethod.GET)
    public NewsEntity showNewsDetail(@RequestParam("nId")int nId){
        return newsService.getNewsById(nId);
    }

    //未部署
    @RequestMapping(value = "news/post",method = RequestMethod.POST)
    public NewsEntity postNews(@RequestBody NewsPost newsPost){
        return newsService.save(newsPost.ntitle,newsPost.nsource,newsPost.ncontent,newsPost.nimage);
    }

    @RequestMapping(value = "news/external/{page}",method = RequestMethod.GET)
    public String showExternalNews(@PathVariable("page")int page) throws IOException, JSONException {
        return externalAPI.getResult(page);
    }
}
