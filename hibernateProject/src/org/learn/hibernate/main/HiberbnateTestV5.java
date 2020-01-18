package org.learn.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.learn.hibernate.dto.UserDetailsV4;
import org.learn.hibernate.dto.UserDetailsV5;
import org.learn.hibernate.dto.UserDetailsV6;
import org.learn.hibernate.dto.UserDetailsV7;
import org.learn.hibernate.dto.VehicleV1;
import org.learn.hibernate.dto.VehicleV2;
import org.learn.hibernate.dto.VehicleV3;

/**
 * Many to Many Demo
 *
 */
public class HiberbnateTestV5 {

	/**
	 * Demo for one to Many mapping
	 */
	public static void main(String[] args) {

		
		UserDetailsV7 uv7 = new UserDetailsV7();
		uv7.setUserName("Hello World");
		
	    VehicleV3 vv31= new VehicleV3();
		vv31.setVehicleName("Nissan");
		
		VehicleV3 vv32= new VehicleV3();
		vv32.setVehicleName("Honda");
		
		uv7.getVehicles().add(vv31);
		uv7.getVehicles().add(vv32);
		
		vv31.getUser().add(uv7);
		vv32.getUser().add(uv7);
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(uv7);
		session.save(vv31);
		session.save(vv32);
		session.getTransaction().commit();
		session.close();
		
	}

}
