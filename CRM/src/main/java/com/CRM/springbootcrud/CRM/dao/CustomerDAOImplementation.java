package com.CRM.springbootcrud.CRM.dao;

import com.CRM.springbootcrud.CRM.model.Customer;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;


@Repository
public class CustomerDAOImplementation implements CustomerDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Customer> getCustomerList() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Customer> theQuery =
                currentSession.createQuery("from Customer", Customer.class);
        List<Customer> list = theQuery.getResultList();
        return list;
    }

    @Override
    public void saveCustomer(Customer customer) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(customer);
    }

    @Override
    public Customer getCustomer(int theid) {
        Session currentSession = entityManager.unwrap(Session.class);
        Customer customer = currentSession.get(Customer.class, theid);
        return customer;
    }

    @Override
    public void deleteCustomer(int theid) {
        Session currentSession = entityManager.unwrap(Session.class);
        Query query = currentSession.createQuery("delete from Customer where id=: customerId");
        query.setParameter("customerId", theid);
        query.executeUpdate();
    }

}
