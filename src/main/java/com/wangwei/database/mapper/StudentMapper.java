package com.wangwei.database.mapper;

import com.wangwei.database.entity.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author wangwei
 * @date 2021-06-24 13:25
 * @since 1.0
 */
@Mapper
public interface StudentMapper {
    @Insert("INSERT INTO `student`(`realname`) VALUES (#{realname})")
    void saveStudent(Student student);
}


