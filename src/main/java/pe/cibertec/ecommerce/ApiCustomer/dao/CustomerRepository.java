package pe.cibertec.ecommerce.ApiCustomer.dao;

import org.springframework.data.repository.CrudRepository;
import pe.cibertec.ecommerce.ApiCustomer.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{
    
    
}
