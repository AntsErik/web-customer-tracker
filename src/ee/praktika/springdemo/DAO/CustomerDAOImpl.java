package ee.praktika.springdemo.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ee.praktika.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    //need to inject the hibernate session factory
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Customer> getCustomers(){

        //get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        //create a query .. sort by last name
        Query<Customer> theQuery = currentSession.createQuery( "from Customer order by lastName",
            Customer.class );

        //and get the list of Customers from the query
        List<Customer> customers = theQuery.getResultList();

        //return the retrieved List of Customers
        return customers;
    }

    @Override
    public void saveCustomer( Customer theCustomer ){

        //get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        //save the customer
        currentSession.save( theCustomer );

    }

}
