package com.lu.mydough.controller;

import com.lu.mydough.domain.User;
import com.lu.mydough.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Lu on 2016/7/28.
 */
@Controller
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Resource
    private UserService userService;

    @RequestMapping(value = "/getUser", method = {RequestMethod.GET, RequestMethod.POST})
    public String execute(Model model, HttpServletRequest request) throws Exception {

        List<User> list = userService.getUsers();
        logger.debug(list.get(0).toString());

        return "test";
    }

}
