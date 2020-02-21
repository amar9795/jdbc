package com.nucleus.exec;

import java.sql.SQLException;

import com.nucleus.dao.StudentDao;
import com.nucleus.dao.StudentRDBSMSDaoImpl;
import com.nucleus.entity.Student;

public class JDBCMain {

	public static void main(String[] args) {
		StudentDao studentDao=new StudentRDBSMSDaoImpl();
		Student student=new Student();
		student.setStdId(5);
		student.setStdName("Student 5");
		student.setMarks(100);
		try {
			studentDao.save(student);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
