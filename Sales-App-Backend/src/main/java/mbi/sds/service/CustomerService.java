package mbi.sds.service;

import java.util.List;

import mbi.sds.entity.Customer;

public interface CustomerService {
	List<Customer> getAllCustomers();

	Customer getCustomerById(Long id);

	Customer saveCustomer(Customer customer);

	void deleteCustomer(Long id);
}
