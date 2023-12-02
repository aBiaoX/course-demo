package cn.edu.zust.se.course.mapper;

import cn.edu.zust.se.course.Dto.UserDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from t_user where id = #{id}")
    UserDto getById(int id);
    @Select("select * from t_user")
    List<UserDto> findAll();
    @Insert("insert into t_user(login_name, password, real_name,type) values(#{loginName}, #{password}, #{realName},#{type})")
    void addUser(UserDto userDto);
    @Insert("update t_user set login_name = #{loginName}, password = #{password}, real_name = #{realName},type = #{type} where id = #{id}")
    void updateUser(UserDto userDto);
    @Insert("delete from t_user where id = #{id}")
    void deleteUser(int id);
}
