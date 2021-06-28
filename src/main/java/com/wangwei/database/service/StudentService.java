package com.wangwei.database.service;

import com.wangwei.database.entity.Student;
import com.wangwei.database.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author wangwei
 * @date 2021-06-24 13:31
 * @since 1.0
 */
@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Transactional
    public void saveStudent(String realname) throws Exception {
        Student student = new Student();
        student.setRealname(realname);
        studentMapper.saveStudent(student);
        if (student.getRealname().equals("小明")) {
            throw new Exception("该学生已存在");
        }
    }
}

