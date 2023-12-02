package cn.edu.zust.se.course.service.impl;

import cn.edu.zust.se.course.Dto.CourseArrangeDto;
import cn.edu.zust.se.course.mapper.CourseArrangeMapper;
import cn.edu.zust.se.course.service.CourseArrangeService;
import cn.edu.zust.se.course.service.SelectResultService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class CourseArrangeServiceImpl implements CourseArrangeService {

    final CourseArrangeMapper courseArrangeMapper;
    final SelectResultService selectResultService;
    @Override
    public CourseArrangeDto getById(int id) {
        return courseArrangeMapper.getById(id);
    }

    @Override
    public List<CourseArrangeDto> findAll() {
        return courseArrangeMapper.findAll();
    }

    @Override
    public void addCourseArrange(CourseArrangeDto courseArrangeDto) {
        courseArrangeMapper.addCourseArrange(courseArrangeDto);
    }

    @Override
    public void updateCourseArrange(CourseArrangeDto courseArrangeDto) {
        courseArrangeMapper.updateCourseArrange(courseArrangeDto);
    }

    @Override
    public void deleteCourseArrange(int id) {
        courseArrangeMapper.deleteCourseArrange(id);
    }


}
