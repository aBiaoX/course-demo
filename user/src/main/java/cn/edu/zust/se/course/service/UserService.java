package cn.edu.zust.se.course.service;

import cn.edu.zust.se.course.Dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto getById(int id);
    List<UserDto> findAll();
    void addUser(UserDto userDto);
    void updateUser(UserDto userDto);
    void deleteUser(int id);
}
