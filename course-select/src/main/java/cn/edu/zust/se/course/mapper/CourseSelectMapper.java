package cn.edu.zust.se.course.mapper;

import cn.edu.zust.se.course.Dto.SelectResultDto;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CourseSelectMapper {
    @Select("select * from t_select_result where id = #{id}")
    SelectResultDto getById(int id);
    @Select("select * from t_select_result")
    List<SelectResultDto> findAll();
    @Select("insert into t_select_result(course_arrangeId, student_id, select_time) values(#{courseArrangeId}, #{studentId}, #{selectTime})")
    void addSelectResult(SelectResultDto selectResultDto);
    @Select("update t_select_result set course_arrangeId = #{courseArrangeId}, student_id = #{studentId}, select_time = #{selectTime} where id = #{id}")
    void updateSelectResult(SelectResultDto selectResultDto);
    @Select("delete from t_select_result where id = #{id}")
    void deleteSelectResult(int id);
}
