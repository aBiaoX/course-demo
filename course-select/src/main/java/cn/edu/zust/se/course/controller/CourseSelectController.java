package cn.edu.zust.se.course.controller;

import cn.edu.zust.se.course.Dto.SelectResultDto;
import cn.edu.zust.se.course.service.CourseSelectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/courseSelect")
public class CourseSelectController {
    final CourseSelectService courseSelectService;
    @GetMapping("/{id}")
    public SelectResultDto getById(@PathVariable int id) {
        return courseSelectService.getById(id);
    }
    @GetMapping("/all")
    public List<SelectResultDto> findAll() {
        return courseSelectService.findAll();
    }
    @GetMapping("/add")
    public void addSelectResult(SelectResultDto selectResultDto) {
        courseSelectService.addSelectResult(selectResultDto);
    }
    @GetMapping("/update")
    public void updateSelectResult(SelectResultDto selectResultDto) {
        courseSelectService.updateSelectResult(selectResultDto);
    }
    @GetMapping("/delete/{id}")
    public void deleteSelectResult(@PathVariable int id) {
        courseSelectService.deleteSelectResult(id);
    }
}
