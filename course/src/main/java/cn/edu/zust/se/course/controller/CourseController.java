package cn.edu.zust.se.course.controller;

import cn.edu.zust.se.course.Dto.CourseDto;
import cn.edu.zust.se.course.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/course")
public class CourseController {
    final CourseService courseService;
    @GetMapping("/{id}")
    public CourseDto getById(@PathVariable int id) {
        return courseService.getById(id);
    }
    @GetMapping("/all")
    public List<CourseDto> findAll() {
        return courseService.findAll();
    }
    @GetMapping("/add")
    public void addCourse(CourseDto courseDto) {
        courseService.addCourse(courseDto);
    }
    @GetMapping("/update")
    public void updateCourse(CourseDto courseDto) {
        courseService.updateCourse(courseDto);
    }
    @GetMapping("/delete/{id}")
    public void deleteCourse(@PathVariable int id) {
        courseService.deleteCourse(id);
    }
}
