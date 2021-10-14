package edu.sy.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import edu.sy.mapper.UserMapper;
import edu.sy.pojo.PageResult;
import edu.sy.pojo.Product;
import edu.sy.pojo.User;
import edu.sy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;
import java.util.List;

@Transactional
@Service
public class UserServiceImpl implements UserService {

    //声明mapper属性
    @Autowired
    private UserMapper userMapper;
    @Override
    public User userLoginService(String uname, String pwd) {
        return userMapper.userLoginMapper(uname,pwd);
    }

    @Override
    public PageResult<Product> selProductInfoService(Integer page, Integer rows) {
        Page<Product> products = PageHelper.startPage(page, rows);
        List<Product> list = userMapper.selProductInfoMapper();
        return new PageResult<Product>(products.getTotal(),list);
    }
}
