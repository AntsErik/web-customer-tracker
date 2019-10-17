package ee.praktika.springdemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ee.praktika.springdemo.entity.Customer;

@Service
public interface CustomerService {

    public List<Customer> getCustomers();

}
