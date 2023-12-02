package cn.edu.zust.se.course.Dto;

import lombok.Data;

@Data
public class UserDto {
    int id;
    String loginName;
    String password;
    String realName;
    int type;
}
