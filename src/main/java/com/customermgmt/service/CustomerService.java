package com.customermgmt.service;


 
import java.util.List;

import com.customermgmt.dto.CustomerDTO;
import com.customermgmt.dto.CustomerSaveDTO;
import com.customermgmt.dto.CustomerUpdateDTO;
 
public interface CustomerService {
    String addCustomer(CustomerSaveDTO customerSaveDTO);
 
    List<CustomerDTO> getAllCustomer();
 
    String updateCustomers(CustomerUpdateDTO customerUpdateDTO);
 
    boolean deleteCustomer(int id);
}