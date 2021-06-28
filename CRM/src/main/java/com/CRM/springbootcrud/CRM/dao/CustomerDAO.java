package com.CRM.springbootcrud.CRM.dao;

import com.CRM.springbootcrud.CRM.model.Customer;

import java.util.List;

public interface CustomerDAO {

    List<Customer> getCustomerList();

    public void saveCustomer(Customer customer);

    public Customer getCustomer(int theid);

    public void deleteCustomer(int theid);
}
