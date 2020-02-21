package com.nucleus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.nucleus.connection.ConnectionClass;
import com.nucleus.entity.Student;

public class StudentRDBSMSDaoImpl implements StudentDao
{

	@Override
	public void save(Student student) throws SQLException {
		ConnectionClass conClass=new ConnectionClass();
		Connection con=conClass.getDBConnection();
		PreparedStatement pstat=con.prepareStatement("insert into stud0 values(?,?,?)");
		pstat.setInt(1, student.getStdId());
		pstat.setString(2, student.getStdName());
		pstat.setFloat(3, student.getMarks());
		pstat.executeUpdate();
		System.out.println("Record inserted");
		
	}

	@Override
	public Student getStudentById(int stdId) {
		// TODO Auto-generated method stub
		return null;
	}

}
