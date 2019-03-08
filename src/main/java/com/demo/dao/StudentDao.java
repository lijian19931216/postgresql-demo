package com.demo.dao;

import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: lijian
 * @create: 2019-03-01
 **/
public interface StudentDao {
    List<Map<String,Object>> queryStudents();
}
