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

    /**
     * @param beerDto BeerDto entity
     * @return Saved BeerDto entity
     */
    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerStyle(beerDto.getBeerStyle())
                .beerName(beerDto.getBeerName())
                .build();
    }
}
