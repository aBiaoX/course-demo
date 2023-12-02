package cn.edu.zust.se.course;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("cn.edu.zust.se.course.mapper")
public class CourseApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(CourseApplication.class, args);
    }
}
