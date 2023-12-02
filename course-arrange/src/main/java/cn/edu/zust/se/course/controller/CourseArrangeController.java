package cn.edu.zust.se.course.controller;

import cn.edu.zust.se.course.Dto.CourseArrangeDto;
import cn.edu.zust.se.course.service.CourseArrangeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/courseArrange")
public class CourseArrangeController {
    final CourseArrangeService courseArrangeService;
    @GetMapping("/{id}")
    public CourseArrangeDto getById(@PathVariable int id) {
        return courseArrangeService.getById(id);
    }
    @GetMapping("/all")
    public List<CourseArrangeDto> findAll() {
        return courseArrangeService.findAll();
    }
    @GetMapping("/add")
    public void addCourseArrange(CourseArrangeDto courseArrangeDto) {
        courseArrangeService.addCourseArrange(courseArrangeDto);
    }
    @GetMapping("/update")
    public void updateCourseArrange(CourseArrangeDto courseArrangeDto) {
        courseArrangeService.updateCourseArrange(courseArrangeDto);
    }
    @GetMapping("/delete/{id}")
    public void deleteCourseArrange(@PathVariable int id) {
        courseArrangeService.deleteCourseArrange(id);
    }
}
