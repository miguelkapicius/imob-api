package br.com.imob.api.customer.service;

import br.com.imob.api.customer.dtos.CreateConsumerDto;
import br.com.imob.api.customer.dtos.UpdateCustomerDto;
import br.com.imob.api.customer.entity.Customer;
import br.com.imob.api.customer.repository.CustomerRepository;
import br.com.imob.api.shared.exceptions.NotFoundException;

import java.util.List;
import java.util.UUID;

public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> listAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer findCustomerById(UUID id) {
        return customerRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("cliente não encontrado"));
    }

    public Customer createCustomer(CreateConsumerDto dto) {
        Customer customer = new Customer(dto.name(), dto.document(), dto.email(), dto.phone(), dto.type(), dto.address());
        return customerRepository.save(customer);
    }

    public Customer updateCustomer(UUID id, UpdateCustomerDto dto) {
        Customer customer = this.findCustomerById(id);

        customer.setName(dto.name());
        customer.setEmail(dto.email());
        customer.setPhone(dto.phone());
        customer.setType(dto.type());
        customer.setDocument(dto.document());
        customer.setAddress(dto.address());

        return customerRepository.save(customer);
    }

    public void deleteCustomer(UUID id) {
        customerRepository.deleteById(id);
    }
}
