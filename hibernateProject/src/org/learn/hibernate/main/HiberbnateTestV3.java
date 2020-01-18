package org.learn.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.learn.hibernate.dto.UserDetailsV4;
import org.learn.hibernate.dto.UserDetailsV5;
import org.learn.hibernate.dto.VehicleV1;

/**
 * @author rajes
 * date    Jul 6, 20175:46:50 PM
 *
 */
public class HiberbnateTestV3 {

	/**
	 * Demo for one to Many mapping
	 */
	public static void main(String[] args) {

		
		UserDetailsV5 uv5 = new UserDetailsV5();
		uv5.setUserName("Hello World");
		
	    VehicleV1 vv1= new VehicleV1();
		vv1.setVehicleName("Nissan");
		
		VehicleV1 vv2= new VehicleV1();
		vv2.setVehicleName("Honda");
		
		uv5.getVehicles().add(vv1);
		uv5.getVehicles().add(vv2);
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(uv5);
		session.save(vv1);
		session.save(vv2);
		session.getTransaction().commit();
		session.close();
		
	}

}
