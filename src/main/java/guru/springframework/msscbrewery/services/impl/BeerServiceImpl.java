package guru.springframework.msscbrewery.services.impl;

import guru.springframework.msscbrewery.services.BeerService;
import guru.springframework.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Service implementation to serving Beer's business logic
 */
@Slf4j
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

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //todo - update beerEntity from db by id with values from beerDto :)
    }

    /**
     * @param beerId Beer identifier
     */
    @Override
    public void deleteBeer(UUID beerId) {
        log.debug("Deleting a beer... BeerId = {}", beerId);
    }
}
