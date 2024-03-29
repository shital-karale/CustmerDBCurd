package com.customermgmt.controller;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.customermgmt.dto.CustomerDTO;
import com.customermgmt.dto.CustomerSaveDTO;
import com.customermgmt.dto.CustomerUpdateDTO;
import com.customermgmt.service.CustomerService;

import java.util.List;
 
@RestController
@CrossOrigin
@RequestMapping("api/v1/customer")
public class CustomerController
{
    @Autowired
    private CustomerService customerService;
 
    @PostMapping(path = "/save")
 
    public String saveCustomer(@RequestBody CustomerSaveDTO customerSaveDTO)
    {
        String id = customerService.addCustomer(customerSaveDTO);
        return id;
    }
 
    @GetMapping(path = "/getAllCustomer")
    public List<CustomerDTO> getAllCustomer()
    {
       List<CustomerDTO>allCustomers = customerService.getAllCustomer();
       return allCustomers;
    }
 
    @PutMapping(path = "/update")
 
    public String updateCustomer(@RequestBody CustomerUpdateDTO customerUpdateDTO)
    {
        String id = customerService.updateCustomers(customerUpdateDTO);
        return id;
    }
 
    @DeleteMapping(path = "/deletecustomer/{id}")
    public String deleteCustomer(@PathVariable(value = "id") int id)
    {
        boolean deletecustomer = customerService.deleteCustomer(id);
        return "deleted";
    }
 
}