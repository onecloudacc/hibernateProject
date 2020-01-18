package org.learn.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.learn.hibernate.dto.UserDetailsV4;
import org.learn.hibernate.dto.UserDetailsV5;
import org.learn.hibernate.dto.UserDetailsV6;
import org.learn.hibernate.dto.VehicleV1;
import org.learn.hibernate.dto.VehicleV2;

/**
 * Many to one mapping
 *
 */
public class HiberbnateTestV4 {

	/**
	 * Demo for one to Many mapping
	 */
	public static void main(String[] args) {

		
		UserDetailsV6 uv6 = new UserDetailsV6();
		uv6.setUserName("Hello World");
		
	    VehicleV2 vv2= new VehicleV2();
		vv2.setVehicleName("Nissan");
		
		VehicleV2 vv3= new VehicleV2();
		vv3.setVehicleName("Honda");
		
		vv2.setUserDetailsv6(uv6);
		vv3.setUserDetailsv6(uv6);
		
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(uv6);
		session.save(vv2);
		session.save(vv3);
		session.getTransaction().commit();
		session.close();
		
	}

}
