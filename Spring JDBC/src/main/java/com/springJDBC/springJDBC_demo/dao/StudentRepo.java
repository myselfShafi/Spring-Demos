package com.springJDBC.springJDBC_demo.dao;

import com.springJDBC.springJDBC_demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;
    private String sql;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student student) {
        sql = "insert into student(rollNo, name, marks) values(?, ?, ?)";
        int insertedRows = jdbc.update(sql, student.getRollNo(), student.getName(), student.getMarks());
        System.out.println("----- " + insertedRows + " effected! -----");
    }

    public List<Student> getList() {
        sql = "select * from student";
        return jdbc.query(sql, (rs, column) -> {
           Student std = new Student();
           std.setRollNo(rs.getInt("rollNo"));
           std.setName(rs.getString("name"));
           std.setMarks(rs.getInt("marks"));
           return std;
        });
    }

//    without lambda expression
//    public List<Student> findAll() {
//        String sql="select * from student"; RowMapper<Student> mapper=new
//        RowMapper<Student>() {
//            @Override public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//                Student s=new Student(); s.setRollNo(rs.getInt("rollno"));
//                s.setName(rs.getString("name")); s.setMarks(rs.getInt("marks")); return s;
//            }
//        };
//        return jdbc.query(sql, mapper);
//    }
}
