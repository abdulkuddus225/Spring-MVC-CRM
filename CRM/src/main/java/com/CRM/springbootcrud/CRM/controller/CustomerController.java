package com.CRM.springbootcrud.CRM.controller;

import com.CRM.springbootcrud.CRM.model.Customer;
import com.CRM.springbootcrud.CRM.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/Customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    public void test(){
        System.out.println("Receiving");

    }

    @GetMapping("/")
    public String showWelcome(){
        return "index";
    }

    @GetMapping("/list")
    public String getCustomer(Model model){
        List<Customer> customers = customerService.getCustomerList();
        model.addAttribute("customers",customers);
       return "list-customer";
    }

    @GetMapping("/showForm")
    public String showForm(Model model){
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "customer-form";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer){
        customerService.saveCustomer(customer);
        return "redirect:/Customer/list";
    }

    @GetMapping("/showFormUpdate")
    public String showFormUpdate(@RequestParam("customerId") int theid, Model model){

        Customer customer = customerService.getCustomer(theid);
        model.addAttribute("customer",customer);
        return "customer-form";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam("customerId") int theid, Model model){
        customerService.deleteCustomer(theid);
        return "redirect:/Customer/list";
    }

}
