package cn.edu.zust.se.course.Dto;

import lombok.Data;

import java.util.Date;

@Data
public class SelectResultDto {
    int id;
    int courseArrangeId;
    int studentId;
    Date selectTime;
}
