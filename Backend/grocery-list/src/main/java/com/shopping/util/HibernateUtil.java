package com.shopping.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessfact;
	
	private static SessionFactory buildSessionFactory() {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		return config.buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory() {
		if(sessfact==null) {
			sessfact=buildSessionFactory();
		}
		return sessfact;
	}
	
}
