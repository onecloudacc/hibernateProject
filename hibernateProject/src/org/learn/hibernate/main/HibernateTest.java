package org.learn.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.learn.hibernate.dto.Address;
import org.learn.hibernate.dto.UserDetailsV2;
import org.learn.hibernate.dto.UserDetailsV3;

/**
 * @author rajes
 * date    Jul 3, 20172:38:59 PM
 *
 */
public class HibernateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*UserDetails userDetails = new UserDetails();
		// userDetails.setUserId(2); (not needed if we use the @GeneratedValue
		// for the primary key, Hibernate will generate it automatically)
		userDetails.setUserName("Rajesh");
		userDetails.setColumnToBeDropped("No content");
		Address address = new Address();
		address.setStreet("3 rd street");
		address.setCity("Chennai");
		address.setState("TN");
		PhoneDetails phno = new PhoneDetails();
		phno.setContactNo(125);

		PhoneDetails phno2 = new PhoneDetails();
		phno.setContactNo(567);

		userDetails.setAddr(address);
		userDetails.setMobileNo(phno);
		userDetails.setLandLineNo(phno2);

		//UserDetails userDetails2 = new UserDetails();
		//userDetails2.setUserName("Mahadevan");*/
		
		/* v2
		UserDetailsV2  uv2= new UserDetailsV2();
		uv2.setUserId(1);
		uv2.setUserName("RajeshMahadevan");*/
		UserDetailsV3  uv3= new UserDetailsV3();
		uv3.setUserId(100);
		uv3.setUserName("RajeshMahadevan");
		Address ad1= new Address();
		ad1.setStreet("1st street");
		ad1.setCity("Chennai");
		ad1.setState("TN");
		
		Address ad2= new Address();
		ad2.setStreet("2st street");
		ad2.setCity("Tirunelveli");
		ad2.setState("TN");
		
		/*v2
		uv2.getSetOfAddress().add(ad1);
		uv2.getSetOfAddress().add(ad2);*/
		
		uv3.getSetOfAddress().add(ad1);
		uv3.getSetOfAddress().add(ad2);
	
	    
		
		
		

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		// insert
		Session session = factory.openSession();
		session.beginTransaction();
		//session.save(userDetails);
		//session.save(uv2);
		session.save(uv3);
		//session.save(userDetails2);
		session.getTransaction().commit();
		session.close();

		// select
		//userDetails = null;
		//uv2=null;
		uv3=null;
		ad1=null;
		session = factory.openSession();
		session.beginTransaction();
		//userDetails = session.get(UserDetails.class, 1);
	//	System.out.println(userDetails.getUserId() + " : " + userDetails.getUserName());
		//uv2= session.get(UserDetailsV2.class, 1);
		uv3= session.get(UserDetailsV3.class, 100);
		
		System.out.println("Printing Userdetails V3=" +uv3.getUserId() + " : " + uv3.getUserName() );
		//System.out.println("Printing Address details V3=" +uv3.getSetOfAddress(). + " : " + uv3.getUserName());
		session.close();
		
		
		
		
		

	}

}
