package io.quantum.pdiaz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestMongodbApplication {

//	@Autowired
//	private CustomerRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(TestMongodbApplication.class, args);
		
		
		
//		@Override
//		public void run(String... args) throws Exception {
	//
//			repository.deleteAll();
	//
//			// save a couple of customers
//			repository.save(new Customer("Fulanita", "Tenorio"));
//			repository.save(new Customer("Sutanito", "Tenorio"));
	//
//			// fetch all customers
//			System.out.println("Customers found with findAll():");
//			System.out.println("-------------------------------");
//			for (Customer customer : repository.findAll()) {
//				System.out.println(customer);
//			}
//			System.out.println();
	//
//			// fetch an individual customer
//			System.out.println("Customer found with findByFirstName('Fulanita'):");
//			System.out.println("--------------------------------");
//			System.out.println(repository.findByFirtsName("Fulanita"));
	//
//			System.out.println("Customers found with findByLastName('Tenorio'):");
//			System.out.println("--------------------------------");
//			for (Customer customer : repository.findByLastName("Tenorio")) {
//				System.out.println(customer);
//			}
	//
//		}
	}
}
