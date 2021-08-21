package com.invain.dao;

import com.invain.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author ：invain
 * @date ：2021/8/20 17:00
 */
public interface StudentMapper {
    /**
     * 增加
     * @param student
     * @return
     */
    int addStudent(Student student);

    /**
     * 删除
     * @param id
     * @return
     */
    int deleteStudentById(@Param("id") int id);

    /**
     * 更新
     * @param student
     * @return
     */
    int updateStudent(Student student);

    /**
     * 查一个学生
     * @param id
     * @return
     */
    int queryBookById(@Param("id") int id);

    /**
     * 查所有学生
     * @return
     */
    List<Student> queryAllStudent();

}
