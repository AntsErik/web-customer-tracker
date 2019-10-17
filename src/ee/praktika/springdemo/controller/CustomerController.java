package ee.praktika.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ee.praktika.springdemo.entity.Customer;
import ee.praktikaspringdemo.DAO.CustomerDAO;

@Controller
@RequestMapping( "/customer" )
public class CustomerController {

    //need to inject the DAO into the controller
    @Autowired
    private CustomerDAO customerDAO;

    @GetMapping( "/list" )
    public String listCustomers( Model theModel ){

        //get customers from the DAO
        List<Customer> theCustomers = customerDAO.getCustomers();

        //add those Customers to the Spring MVC model
        theModel.addAttribute( "customers", theCustomers );

        return "list-customers";
    }

}
