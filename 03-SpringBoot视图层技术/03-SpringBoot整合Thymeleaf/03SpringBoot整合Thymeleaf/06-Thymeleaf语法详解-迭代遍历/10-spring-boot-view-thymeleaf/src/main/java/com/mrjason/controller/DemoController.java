package com.mrjason.controller;

import com.mrjason.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: MrJason
 * Date: 2019-03-25
 * Time: 22:42
 * Thymeleaf 入门案例
 */

@Controller
public class DemoController {
    @RequestMapping("/show")
    public  String showInfo(Model model){
        model.addAttribute("msg","Thymeleaf第一个案例");
        return "index";
    }


    @RequestMapping("/show2")
    public  String showInfo2(Model model){
        model.addAttribute("sex","男");
        model.addAttribute("id","2");
        return "index2";
    }

    @RequestMapping("/show3")
    public String showInfo3(Model model){
        List<Users> list = new ArrayList<>();
        list.add(new Users(1,"张三",20));
        list.add(new Users(2,"李四",22));
        list.add(new Users(3,"王五",24));
        model.addAttribute("list", list);
        return "index3";
    }
    @RequestMapping("/show4")
    public String showInfo4(Model model){
        Map<String,Users> map = new HashMap<>();
        map.put("u1",new Users(1,"张三",20));
        map.put("u2",new Users(2,"李四",20));
        map.put("u3",new Users(3,"王五",20));
        model.addAttribute("map", map);
        return "index4";
    }

    @RequestMapping("/show5")
    public String showInfo5(HttpServletRequest request, Model model){
       request.setAttribute("req","HttpServletRequest");
       request.getSession().setAttribute("sess","HttpSession");
       request.getSession().getServletContext().setAttribute("app","Application");

        return "index5";
    }
}
