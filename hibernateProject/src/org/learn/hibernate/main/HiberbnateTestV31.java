package org.learn.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.learn.hibernate.dto.UserDetailsV4;
import org.learn.hibernate.dto.UserDetailsV5;
import org.learn.hibernate.dto.UserDetailsV51;
import org.learn.hibernate.dto.VehicleV1;
import org.learn.hibernate.dto.VehicleV11;

/**
 * @author rajes
 * date    Jul 6, 20175:46:50 PM
 *
 */
public class HiberbnateTestV31 {

	/**
	 * Demo for one to Many mapping
	 */
	public static void main(String[] args) {

		
		UserDetailsV51 uv51 = new UserDetailsV51();
		uv51.setUserName("Hello World");
		
	    VehicleV11 vv11= new VehicleV11();
	    vv11.setVehicleName("Nissan");
		
		VehicleV11 vv12= new VehicleV11();
		vv12.setVehicleName("Honda");
		
		uv51.getVehicles().add(vv11);
		uv51.getVehicles().add(vv12);
		
		vv11.setUser(uv51);
		vv12.setUser(uv51);
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(uv51);
		session.save(vv11);
		session.save(vv12);
		session.getTransaction().commit();
		session.close();
		
	}

}
