package cn.edu.zust.se.course.service;


import cn.edu.zust.se.course.Dto.CourseDto;

import java.util.List;

public interface CourseService {
    CourseDto getById(int id);
    List<CourseDto> findAll();
    void addCourse(CourseDto courseDto);
    void updateCourse(CourseDto courseDto);
    void deleteCourse(int id);
}
