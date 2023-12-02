package cn.edu.zust.se.course.Dto;

import lombok.Data;

@Data
public class CourseArrangeDto {
    int id;
    int courseId;
    int teacherId;
    String courseTime;
    String coursePlace;
    int maxNum;
    int selectedNum;
}
