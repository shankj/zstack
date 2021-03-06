package org.zstack.core.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zstack.header.rest.RESTConstant;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value=RESTConstant.BASE_PATH)
public class AsyncRESTCallController {
    @Autowired
    private RESTFacadeImpl restf;
    
    @RequestMapping(value=RESTConstant.CALLBACK_PATH,  method={RequestMethod.POST, RequestMethod.PUT})
    public void callback(HttpServletRequest req, HttpServletResponse rsp) {
        restf.notifyCallback(req, rsp);
    }
}
