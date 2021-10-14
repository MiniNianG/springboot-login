package edu.sy.mapper;

import edu.sy.pojo.Product;
import edu.sy.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from t_user where uname=#{uname} and pwd=#{pwd} ")
    User userLoginMapper(@Param("uname") String uname, @Param("pwd") String pwd);

    @Select("select * from t_product")
    List<Product> selProductInfoMapper();
}
