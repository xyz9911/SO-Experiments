package com.project.housingproject.controller;
import com.project.housingproject.entities.GroupnoticeEntity;
import com.project.housingproject.entities.NoticeobjectEntity;
import com.project.housingproject.entities.PersonalnoticeEntity;
import com.project.housingproject.postitems.GroupNoticePost;
import com.project.housingproject.postitems.PersonalNoticePost;
import com.project.housingproject.services.GroupNoticeService;
import com.project.housingproject.services.PersonalNoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NoticeServiceController {
    @Autowired
    private GroupNoticeService groupNoticeService;

    @Autowired
    private PersonalNoticeService personalNoticeService;

    @RequestMapping(value = "group/{nid}",method = RequestMethod.GET)
    public GroupnoticeEntity showGroupNoticeById(@PathVariable("nid")int nid){
        return groupNoticeService.getNoticeById(nid);
    }

    //已部署
    @RequestMapping(value = "group/user/read/{uid}",method = RequestMethod.GET)
    public List<GroupnoticeEntity> showReadUserGroupNotice(@PathVariable("uid")int uid){
        return groupNoticeService.getReadUserNotice(uid);
    }

    //已部署
    @RequestMapping(value = "group/user/unread/{uid}",method = RequestMethod.GET)
    public List<GroupnoticeEntity> showUnreadUserGroupNotice(@PathVariable("uid")int uid){
        return groupNoticeService.getUnreadUserNotice(uid);
    }

    //已部署
    @RequestMapping(value = "group/agent/read/{aid}",method = RequestMethod.GET)
    public List<GroupnoticeEntity> showReadAgentGroupNotice(@PathVariable("aid")int aid){
        return groupNoticeService.getReadAgentNotice(aid);
    }

    //已部署
    @RequestMapping(value = "group/agent/unread/{aid}",method = RequestMethod.GET)
    public List<GroupnoticeEntity> showUnreadAgentGroupNotice(@PathVariable("aid")int aid){
        return groupNoticeService.getUnreadAgentNotice(aid);
    }

    //已部署
    @RequestMapping(value = "group/agent/num/{aid}",method = RequestMethod.GET)
    public int groupUnreadAgentNum(@PathVariable("aid")int aid){
        return groupNoticeService.getAgentUnreadNum(aid);
    }

    //已部署
    @RequestMapping(value = "group/user/num/{uid}",method = RequestMethod.GET)
    public int groupUnreadUserNum(@PathVariable("uid")int uid){
        return groupNoticeService.getUserUnreadNum(uid);
    }

    //未部署
    @RequestMapping(value = "group/post",method = RequestMethod.POST)
    public GroupnoticeEntity postNotice(@RequestBody GroupNoticePost groupNoticePost){
        return groupNoticeService.postNotice(groupNoticePost.userType, groupNoticePost.title,groupNoticePost.content);
    }

    //未部署
    @RequestMapping(value = "group/user/read",method = RequestMethod.PUT)
    public List<NoticeobjectEntity> userReadNotice(@RequestParam("uId")int uid){
        Byte type=0;
        return groupNoticeService.readNotice(uid,type);
    }

    //未部署
    @RequestMapping(value = "group/agent/read",method = RequestMethod.PUT)
    public List<NoticeobjectEntity> agentReadNotice(@RequestParam("aId")int aid){
        Byte type=1;
        return groupNoticeService.readNotice(aid,type);
    }

    //未部署
    @RequestMapping(value = "personal/user/read/{uid}",method = RequestMethod.GET)
    public List<PersonalnoticeEntity> showReadUserPersonalNotice(@PathVariable("uid")int uId){
        return personalNoticeService.getReadUserNotice(uId);
    }

    //未部署
    @RequestMapping(value = "personal/user/unread/{uid}",method = RequestMethod.GET)
    public List<PersonalnoticeEntity> showUnreadUserPersonalNotice(@PathVariable("uid")int uId){
        return personalNoticeService.getUnreadUserNotice(uId);
    }

    //未部署
    @RequestMapping(value = "personal/agent/read/{aid}",method = RequestMethod.GET)
    public List<PersonalnoticeEntity> showReadAgentPersonalNotice(@PathVariable("aid")int aId){
        return personalNoticeService.getReadAgentNotice(aId);
    }

    //未部署
    @RequestMapping(value = "personal/agent/unread/{aid}",method = RequestMethod.GET)
    public List<PersonalnoticeEntity> showUnreadAgentPersonalNotice(@PathVariable("aid")int aId){
        return personalNoticeService.getUnreadAgentNotice(aId);
    }

    //未部署
    @RequestMapping(value = "personal/user/post",method = RequestMethod.POST)
    public PersonalnoticeEntity postUserNotice(@RequestBody PersonalNoticePost personalNoticePost){
        return personalNoticeService.saveUserNotice(personalNoticePost.id,personalNoticePost.title,personalNoticePost.content);
    }

    //未部署
    @RequestMapping(value = "personal/agent/post",method = RequestMethod.POST)
    public PersonalnoticeEntity postAgentNotice(@RequestBody PersonalNoticePost personalNoticePost){
        return personalNoticeService.saveAgentNotice(personalNoticePost.id,personalNoticePost.title,personalNoticePost.content);
    }

    //未部署
    @RequestMapping(value = "personal/read",method = RequestMethod.PUT)
    public PersonalnoticeEntity readNotice(@RequestParam("nid")int nid){
        return personalNoticeService.readNotice(nid);
    }

    //已部署
    @RequestMapping(value = "personal/agent/num/{aid}",method = RequestMethod.GET)
    public int showUnreadAgentNum(@PathVariable("aid")int aId){
        return personalNoticeService.getAgentUnreadNum(aId);
    }

    //已部署
    @RequestMapping(value = "personal/user/num/{uid}",method = RequestMethod.GET)
    public int showUnreadUserNum(@PathVariable("uid")int uId){
        return personalNoticeService.getUserUnreadNum(uId);
    }
}
