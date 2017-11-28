package org.web.model.service;

import org.hibernate.Session;
import org.web.model.Admin;
import org.web.util.HBUtil;

public class adminService {
	public static Admin getAdminName(String name)
	{
		Session session =HBUtil.get().openSession();
		Admin admin = session.get(Admin.class, name);
		session.close();
		return admin;
	}
	public static Admin getPass(String password)
	{
		Session session =HBUtil.get().openSession();
		Admin pass = session.get(Admin.class, password);
		session.close();
		return pass;
	}
	

}
