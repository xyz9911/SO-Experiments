package com.project.housingproject.controller.login;

import com.project.housingproject.entities.*;
import com.project.housingproject.*;
import com.project.housingproject.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

@Controller
public class AgentLoginController {

    @Autowired
    AgentService agentService;

    @CrossOrigin
    @PostMapping(value = "/api/agentlogin") //前后端交互
    @ResponseBody
    public Result agentLogin(@RequestBody Agent requestAgent){

        // 对 html 标签进行转义，防止 XSS 攻击 ？？
        String aname = requestAgent.getANAME();
        aname = HtmlUtils.htmlEscape(aname);
        Agent agent    = agentService.get(aname, requestAgent.getAPASSWORD());
        if (null == agent || agent.getAVALIDSTATUS()==0){ //中介人不存在或被封禁
            System.out.println(agent.getAVALIDSTATUS());
            return new Result(404);

        }else { //中介人存在且未封禁
            System.out.println(agent.getAVALIDSTATUS());
            return new Result(200);

        }
    }

}
