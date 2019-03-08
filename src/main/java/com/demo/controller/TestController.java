package com.demo.controller;

import java.util.List;
import java.util.Map;

import com.demo.dao.StudentDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: lijian
 * @create: 2019-03-01
 **/
@RestController
public class TestController {
    @Autowired
    StudentDao studentDao;

    @RequestMapping("/hello")
    public List<Map<String,Object>> getStudents(){
        return studentDao.queryStudents();
    }


}
