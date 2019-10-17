package ee.praktika.springdemo.service;

import java.util.List;

import ee.praktika.springdemo.entity.Customer;

public interface CustomerService {

    public List<Customer> getCustomers();

    public void saveCustomer( Customer theCustomer );

}
