package cn.edu.zust.se.course.mapper;

import cn.edu.zust.se.course.Dto.CourseDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CourseMapper {
    @Select("select * from t_course where id = #{id}")
    CourseDto getById(int id);
    @Select("select * from t_course")
    List<CourseDto> findAll();
    //增加课程
    @Insert("insert into t_course (name,credit,type) values (#{name},#{credit},#{type})")
    void addCourse(CourseDto courseDto);
    //修改课程
    @Insert("update t_course set name = #{name},credit = #{credit},type = #{type} where id = #{id}")
    void updateCourse(CourseDto courseDto);
    //删除课程
    @Insert("delete from t_course where id = #{id}")
    void deleteCourse(int id);
}
