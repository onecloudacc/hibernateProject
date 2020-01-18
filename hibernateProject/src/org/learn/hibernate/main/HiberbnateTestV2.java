package org.learn.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.learn.hibernate.dto.UserDetailsV4;
import org.learn.hibernate.dto.VehicleV1;

/**
 * @author rajes
 * date    Jul 6, 20175:46:50 PM
 *
 */
public class HiberbnateTestV2 {

	/**
	 * Demo for one to one mapping
	 */
	public static void main(String[] args) {

		
		UserDetailsV4 uv4 = new UserDetailsV4();
		uv4.setUserName("Hello World");
		
		VehicleV1 vv1= new VehicleV1();
		vv1.setVehicleName("Nissan");
		
		uv4.setV1(vv1);
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(uv4);
		session.save(vv1);
		session.getTransaction().commit();
		session.close();
		
	}

}
