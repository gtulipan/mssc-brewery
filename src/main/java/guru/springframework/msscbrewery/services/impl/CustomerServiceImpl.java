package guru.springframework.msscbrewery.services.impl;

import guru.springframework.msscbrewery.services.CustomerService;
import guru.springframework.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Service implementation to serving Customer's business logic
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    /**
     * @param customerId Customer identifier
     * @return {@link CustomerDto} based on customer id
     */
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .name("Teszt Elek")
                .customerId(customerId)
                .build();
    }
}
