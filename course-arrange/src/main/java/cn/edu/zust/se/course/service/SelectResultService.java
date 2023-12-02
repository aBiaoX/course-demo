package cn.edu.zust.se.course.service;

import cn.edu.zust.se.course.Dto.SelectResultDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("select-result-service")
public interface SelectResultService {
    @GetMapping("/selectResult/{id}")
    public SelectResultDto getById(@PathVariable int id);
}
