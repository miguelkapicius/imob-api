package br.com.imob.api.customer.controller;

import br.com.imob.api.customer.dtos.CreateConsumerDto;
import br.com.imob.api.customer.dtos.UpdateCustomerDto;
import br.com.imob.api.customer.entity.Customer;
import br.com.imob.api.customer.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> listCustomers() {
        return customerService.listAllCustomers();
    }

    @GetMapping("/{id}")
    public Customer findCustomerById(@PathVariable UUID id) {
        return customerService.findCustomerById(id);
    }

    @PostMapping
    public Customer createCustomer(@RequestBody CreateConsumerDto dto) {
        return customerService.createCustomer(dto);
    }

    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable UUID id, @RequestBody UpdateCustomerDto dto) {
        return customerService.updateCustomer(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable UUID id) {
        customerService.deleteCustomer(id);
    }

}
