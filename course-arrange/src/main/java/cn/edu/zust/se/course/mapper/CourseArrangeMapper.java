package cn.edu.zust.se.course.mapper;

import cn.edu.zust.se.course.Dto.CourseArrangeDto;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CourseArrangeMapper {
    @Select("select * from t_course_arrange where id = #{id}")
    CourseArrangeDto getById(int id);
    @Select("select * from t_course_arrange")
    List<CourseArrangeDto> findAll();
    @Select("insert into t_course_arrange(course_id, teacher_id, course_time, course_place, maxNum,selected_num) values(#{courseId}, #{teacherId}, #{courseTime}, #{coursePlace}, #{maxNum},#{selectedNum})")
    void addCourseArrange(CourseArrangeDto courseArrangeDto);
    @Select("update t_course_arrange set course_id = #{courseId}, teacher_id = #{teacherId}, course_time = #{courseTime}, course_place = #{coursePlace}, maxNum = #{maxNum},selected_num = #{selectedNum} where id = #{id}")
    void updateCourseArrange(CourseArrangeDto courseArrangeDto);
    @Select("delete from t_course_arrange where id = #{id}")
    void deleteCourseArrange(int id);
}
