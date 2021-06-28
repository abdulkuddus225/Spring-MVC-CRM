package com.CRM.springbootcrud.CRM.service;

import com.CRM.springbootcrud.CRM.dao.CustomerDAO;
import com.CRM.springbootcrud.CRM.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class CustomerServiceImplementation implements CustomerService{

    @Autowired
    private CustomerDAO customerDAO;

    @Override
    @Transactional
    public List<Customer> getCustomerList() {
        List<Customer> list = customerDAO.getCustomerList();
        return list;
    }

    @Override
    @Transactional
    public void saveCustomer(Customer customer) {
        customerDAO.saveCustomer(customer);
    }

    @Override
    @Transactional
    public Customer getCustomer(int theid) {
        return customerDAO.getCustomer(theid);
    }

    @Override
    @Transactional
    public void deleteCustomer(int theid) {
        customerDAO.deleteCustomer(theid);
    }


}
