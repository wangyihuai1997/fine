package cn.com.pism.fine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author wangyihuai
 * @version 1.0
 * @create 2019/03/20 上午 11:20
 */
@RestController
@RequestMapping("/test")
public class HelloWorldController {
    /**
     * 跳转测试页面
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/index")
    public ModelAndView indexTest(HttpServletRequest request, HttpServletResponse response){
        ModelAndView view = new ModelAndView("test");
        view.addObject("test","string test,indextets");
        return view;
    }

    @RequestMapping("/sss")
    public void ss(){
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");

    }
}
