package ee.praktikaspringdemo.DAO;

import java.util.List;

import ee.praktika.springdemo.entity.Customer;

public interface CustomerDAO {

    public List<Customer> getCustomers();

}
