package org.web.model;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {

	public static void main(String[] args) {
		Admin admin=new Admin();
		Student student=new Student();
		Colleges colleges=new Colleges();
		ListOfCollege lcollege=new ListOfCollege();
		P_details detail=new P_details();
		
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session =sf.openSession();
        session.beginTransaction();
        session.save(admin);
        session.save(student);
        session.save(colleges);
        session.save(lcollege);
        session.save(detail);
        session.getTransaction().commit();
        session.close();
        
	}

}
