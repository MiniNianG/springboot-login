package edu.sy.service;

import edu.sy.pojo.PageResult;
import edu.sy.pojo.Product;
import edu.sy.pojo.User;

public interface UserService {

    User userLoginService(String uname,String pwd);

    PageResult<Product> selProductInfoService(Integer page, Integer rows);
}
