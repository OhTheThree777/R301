package edu.imnu.controller;

import edu.imnu.mapper.user_t_model_mariadbMapper;
import edu.imnu.model.user_t_model_mariadb;
import edu.imnu.model.user_t_model_mariadbExample;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;


import javax.servlet.http.HttpServletResponse;

/**
 * Created by r958403448 on 2017/3/27.
 */

@Controller
@RequestMapping("userController")
public class usercontroller {
    @Autowired
    private user_t_model_mariadbMapper userMapper;


    @RequestMapping("userlogin.json")
    @ResponseBody
    public ModelAndView userLogin(HttpServletRequest request, HttpServletResponse response,user_t_model_mariadb usert) {
        ModelAndView mav=new ModelAndView();


        String username = request.getParameter("username");
        String passwd = request.getParameter("passwd");
        Example

         example = new Example(user_t_model_mariadbMapper.class);
        Criteria cri= example.createCriteria();
        cri.andEqualTo("username", usert.getUserName());
        userMapper.selectByExample(cri).toString();


        System.out.println(userMapper.selectByExample(cri).toString());
        return mav;

    }
}

