package ee.praktika.springdemo.DAO;

import java.util.List;

import ee.praktika.springdemo.entity.Customer;

public interface CustomerDAO {

    public List<Customer> getCustomers();

    public void saveCustomer( Customer theCustomer );

}
