/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCustomer.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiCustomer.dao.CustomerRepository;
import pe.cibertec.ecommerce.ApiCustomer.entity.Customer;

/**
 *
 * Clase especial cabron, no te olviden
 */
@Service
public class CustomerServicelmpl implements CustomerService{ 
    @Autowired
    private CustomerRepository CustomerRepository;
            
    @Override
    public List<Customer> findAll() {
      return (List<Customer>) CustomerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
       return  CustomerRepository.findById(id).orElse(null);
       }
    
}
