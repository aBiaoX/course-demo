package cn.edu.zust.se.course.service.impl;

import cn.edu.zust.se.course.Dto.UserDto;
import cn.edu.zust.se.course.mapper.UserMapper;
import cn.edu.zust.se.course.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class UserServiceImpl implements UserService {

    final UserMapper userMapper;
    @Override
    public UserDto getById(int id) {
        return userMapper.getById(id);
    }

    @Override
    public List<UserDto> findAll() {
        return userMapper.findAll();
    }

    @Override
    public void addUser(UserDto userDto) {
        userMapper.addUser(userDto);
    }

    @Override
    public void updateUser(UserDto userDto) {
        userMapper.updateUser(userDto);
    }

    @Override
    public void deleteUser(int id) {
        userMapper.deleteUser(id);
    }
}
