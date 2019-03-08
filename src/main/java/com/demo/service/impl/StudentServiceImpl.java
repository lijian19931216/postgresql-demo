package com.demo.service.impl;

import java.util.List;
import java.util.Map;

import com.demo.bean.Student;
import com.demo.dao.StudentDao;
import com.demo.service.IStudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: lijian
 * @create: 2019-03-01
 **/
@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    StudentDao studentDao;
    @Override
    public List<Map<String,Object>> getStudents() {
        return studentDao.queryStudents();
    }
}
