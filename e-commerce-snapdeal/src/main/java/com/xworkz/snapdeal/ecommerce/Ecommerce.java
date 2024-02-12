package com.xworkz.snapdeal.ecommerce;


import com.xworkz.snapdeal.dto.CustomerDTO;

import java.util.List;

public interface Ecommerce {

    public boolean addCustomer(CustomerDTO dto);

    public List<CustomerDTO> getAllCustomers();

    public CustomerDTO getCustomersByCustomerId(int id);

}
