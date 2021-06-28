package com.CRM.springbootcrud.CRM.service;

import com.CRM.springbootcrud.CRM.model.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getCustomerList();

   public void saveCustomer(Customer customer);

    public Customer getCustomer(int theid);

    public void deleteCustomer(int theid);
}
