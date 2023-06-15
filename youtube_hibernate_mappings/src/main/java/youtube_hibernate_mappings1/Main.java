package youtube_hibernate_mappings1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Laptop laptop=new Laptop();
		laptop.setId(106);
		laptop.setName("hp");
		
		
		
		Student std=new Student();
		std.setRollno(6);
		std.setName("love");
		std.setMarks(68);
		//std.setLoptop(laptop);  //--->onetoone
		
		std.getLoptop().add(laptop);
		
		laptop.getStudent().add(std);	
		
		
		EntityManagerFactory factor=Persistence.createEntityManagerFactory("Lavanya");
		EntityManager manager=factor.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		
		manager.persist(laptop);
		manager.persist(std);
		transaction.commit();
		
	}

}
