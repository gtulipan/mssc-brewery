package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDto;

import java.util.UUID;

/**
 * Serving Beer's business logic
 */
public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
