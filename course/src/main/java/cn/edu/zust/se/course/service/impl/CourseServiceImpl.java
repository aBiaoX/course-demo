package cn.edu.zust.se.course.service.impl;

import cn.edu.zust.se.course.Dto.CourseDto;
import cn.edu.zust.se.course.mapper.CourseMapper;
import cn.edu.zust.se.course.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class CourseServiceImpl implements CourseService {

    final CourseMapper CourseMapper;
    @Override
    public CourseDto getById(int id) {
        return CourseMapper.getById(id);
    }

    @Override
    public List<CourseDto> findAll() {
        return CourseMapper.findAll();
    }

    @Override
    public void addCourse(CourseDto courseDto) {
        CourseMapper.addCourse(courseDto);
    }

    @Override
    public void updateCourse(CourseDto courseDto) {
        CourseMapper.updateCourse(courseDto);
    }

    @Override
    public void deleteCourse(int id) {
        CourseMapper.deleteCourse(id);
    }
}
