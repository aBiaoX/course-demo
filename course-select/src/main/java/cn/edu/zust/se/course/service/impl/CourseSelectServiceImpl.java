package cn.edu.zust.se.course.service.impl;

import cn.edu.zust.se.course.Dto.SelectResultDto;
import cn.edu.zust.se.course.mapper.CourseSelectMapper;
import cn.edu.zust.se.course.service.CourseSelectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class CourseSelectServiceImpl implements CourseSelectService {

    final CourseSelectMapper courseSelectMapper;
    @Override
    public SelectResultDto getById(int id) {
        return courseSelectMapper.getById(id);
    }

    @Override
    public List<SelectResultDto> findAll() {
        return courseSelectMapper.findAll();
    }

    @Override
    public void addSelectResult(SelectResultDto selectResultDto) {
        courseSelectMapper.addSelectResult(selectResultDto);
    }

    @Override
    public void updateSelectResult(SelectResultDto selectResultDto) {
        courseSelectMapper.updateSelectResult(selectResultDto);
    }

    @Override
    public void deleteSelectResult(int id) {
        courseSelectMapper.deleteSelectResult(id);
    }
}
