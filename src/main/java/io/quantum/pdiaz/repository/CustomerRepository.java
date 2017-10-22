package io.quantum.pdiaz.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import io.quantum.pdiaz.model.Customer;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface CustomerRepository  extends MongoRepository<Customer,String> {
	
//	public Customer findByFirtsName(String firstName);
//    public List<Customer> findByLastName(String lastName);
    List<Customer> findByLastName(@Param("name") String name);
    
    
    
}
