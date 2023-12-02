package cn.edu.zust.se.course.controller;

import cn.edu.zust.se.course.Dto.UserDto;
import cn.edu.zust.se.course.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {
    final UserService userService;
    @GetMapping("/{id}")
    public UserDto getById(@PathVariable int id) {
        return userService.getById(id);
    }
    @GetMapping("/all")
    public List<UserDto> findAll() {
        return userService.findAll();
    }
    @GetMapping("/add")
    public void addUser(UserDto userDto) {
        userService.addUser(userDto);
    }
    @GetMapping("/update")
    public void updateUser(UserDto userDto) {
        userService.updateUser(userDto);
    }
    @GetMapping("/delete/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
    }
}
