package com.company.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import comm.company.myapp.entity.Instructor;
import com.company.factory.InstructorFactory;

public class InstructorDAOImpl implements InstructorDAO {
	
	private static Session session=null;
	{
		session=InstructorFactory.getMySession();
	}

	public void createInstructor(Instructor instructor) {
		
		session.getTransaction().begin();
		session.persist(instructor);
		session.getTransaction().commit();
	}

}