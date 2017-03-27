package edu.imnu.controller;

import edu.imnu.mapper.user_t_model_mariadbMapper;
import edu.imnu.model.user_t_model_mariadb;
import edu.imnu.model.user_t_model_mariadbExample;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.mybatis.generator.codegen.ibatis2.model.ExampleGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by r958403448 on 2017/3/27.
 */

@Controller
@RequestMapping("userController")
public class usercontroller {
    @Autowired
    private user_t_model_mariadbMapper userMapper;

    public ModelAndView userLogin(HttpServletRequest request, HttpServletResponse response){

        String username=request.getParameter("username");
        String passwd=request.getParameter("passwd");
        user_t_model_mariadbExample example;
        example = new user_t_model_mariadbExample(user_t_model_mariadb.class);
        user_t_model_mariadbExample.Criteria cri=example.createCriteria();
        cri.andEqualTo();

        userMapper.selectByExample(example);

    }

}
