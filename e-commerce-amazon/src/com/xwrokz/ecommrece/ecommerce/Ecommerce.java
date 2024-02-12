package com.xwrokz.ecommrece.ecommerce;

import com.xwrokz.ecommrece.dto.CustomerDTO;

import java.util.List;

public interface Ecommerce {

    public boolean addCustomer(CustomerDTO dto);

    public List<CustomerDTO> getAllCustomers();

    public CustomerDTO getCustomersByCustomerId(int id);

}
