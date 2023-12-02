package cn.edu.zust.se.course.service;


import cn.edu.zust.se.course.Dto.SelectResultDto;

import java.util.List;

public interface CourseSelectService {
    SelectResultDto getById(int id);
    List<SelectResultDto> findAll();
    void addSelectResult(SelectResultDto selectResultDto);
    void updateSelectResult(SelectResultDto selectResultDto);
    void deleteSelectResult(int id);
}
