package cn.edu.zust.se.course.service;

import cn.edu.zust.se.course.Dto.CourseArrangeDto;

import java.util.List;

public interface CourseArrangeService {
    CourseArrangeDto getById(int id);
    List<CourseArrangeDto> findAll();
    void addCourseArrange(CourseArrangeDto courseArrangeDto);
    void updateCourseArrange(CourseArrangeDto courseArrangeDto);
    void deleteCourseArrange(int id);
}
