package guru.springframework.msscbrewery.services.impl;

import guru.springframework.msscbrewery.services.BeerService;
import guru.springframework.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Service implementation to serving Beer's business logic
 */
@Service
public class BeerServiceImpl implements BeerService {

    /**
     * @param beerId Beer identifier
     * @return A {@link BeerDto} based on beer id
     */
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(beerId)
                .beerName("Heineken")
                .beerStyle("Lager")
                .build();
    }
}
