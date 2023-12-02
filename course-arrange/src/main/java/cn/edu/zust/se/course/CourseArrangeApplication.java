package cn.edu.zust.se.course;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("cn.edu.zust.se.course.mapper")
public class CourseArrangeApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(CourseArrangeApplication.class, args);
    }
}
