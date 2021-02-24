package main.java.hibernate;

import org.hibernate.Session;

import main.java.hibernate.dto.Task;

public class TestHibernateInsert {
	
	public static void main(String[] args) 
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
       
		//Add new Task object
		Task task = new Task();
		task.setName("Bilal Ahmed");
		task.setSummary("this is first task");
		
		session.save(task);

		session.getTransaction().commit();
		HibernateUtil.shutdown();
	}

}
