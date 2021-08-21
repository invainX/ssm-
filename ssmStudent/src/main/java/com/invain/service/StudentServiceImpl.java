package com.invain.service;

import com.invain.dao.StudentMapper;
import com.invain.pojo.Student;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：invain
 * @date ：2021/8/20 17:23
 */
public class StudentServiceImpl implements StudentMapper {

    /**
     * service 调 dao 层： 组合Dao
     */
    private StudentMapper studentMapper;
    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    public int addStudent(Student student) {
        return studentMapper.addStudent(student);
    }

    public int deleteStudentById(int id) {
        return studentMapper.deleteStudentById(id);
    }

    public int updateStudent(Student student) {
        return studentMapper.updateStudent(student);
    }

    public int queryBookById(int id) {
        return studentMapper.queryBookById(id);
    }

    public List<Student> queryAllStudent() {
        return studentMapper.queryAllStudent();
    }
}
