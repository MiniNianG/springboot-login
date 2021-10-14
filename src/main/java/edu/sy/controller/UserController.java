package edu.sy.controller;

import edu.sy.pojo.PageResult;
import edu.sy.pojo.Product;
import edu.sy.pojo.User;
import edu.sy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("userLogin")
    public String userLogin(String uname, String pwd, HttpSession session){
        User user = userService.userLoginService(uname, pwd);
        if(user!=null){
            return "redirect:/main";
        }else {
            session.setAttribute("flag","loginFail");
            return "redirect:/login";
        }

    }

    /**
     * 分页加载商品信息
     */
    @ResponseBody
    @RequestMapping("productInfo")
    public PageResult<Product> productInfo(Integer page,Integer rows){
        PageResult<Product> result = userService.selProductInfoService(page,rows);
        return result;
    }
}
