package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exception.ResourceNotFoundException;
import com.example.model.Customer;
import com.example.repository.CustomerRepository;


@Service
public class CustomerService {
	@Autowired
	CustomerRepository customerRepository;
	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
	public List<Customer> getAllCustomers(){
		return customerRepository.findAll();
	}
	public Customer getCustomerById(int custId) {
		return customerRepository.findById(custId).orElseThrow(()-> new ResourceNotFoundException("Id not fund));"));
	}
	public Customer updateCustomer(Customer customer ) {
		Customer cust=customerRepository.findById(customer.getCustId()).orElseThrow(()-> new ResourceNotFoundException("Id not fund));"));
		cust.setCustName(customer.getCustName());
		cust.setCustAdd(customer.getCustAdd());
		return customerRepository.save(cust);
	}
	public String deleteCustomer(int custId) {
		Customer cust=customerRepository.findById(custId).orElseThrow(()-> new ResourceNotFoundException("Id not fund));"));
		customerRepository.delete(cust);
		return "Record deleted Successfully";
	
		}
	
}
