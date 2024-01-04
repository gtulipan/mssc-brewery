package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

/**
 * Serving Customer's business logic
 */
public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
