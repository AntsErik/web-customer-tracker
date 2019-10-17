package ee.praktika.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ee.praktika.springdemo.DAO.CustomerDAO;
import ee.praktika.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

    //need to inject the Customer DAO
    @Autowired
    private CustomerDAO customerDAO;

    @Override
    @Transactional
    public List<Customer> getCustomers(){

        return customerDAO.getCustomers();
    }

    @Override
    @Transactional
    public void saveCustomer( Customer theCustomer ){

        customerDAO.saveCustomer( theCustomer );
    }

}
