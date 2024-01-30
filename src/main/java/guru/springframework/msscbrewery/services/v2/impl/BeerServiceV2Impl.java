package guru.springframework.msscbrewery.services.v2.impl;

import guru.springframework.msscbrewery.services.v2.BeerServiceV2;
import guru.springframework.msscbrewery.web.model.v2.BeerDtoV2;
import guru.springframework.msscbrewery.web.model.v2.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Service implementation to serving Beer's business logic
 */
@Slf4j
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {

    /**
     * @param beerId Beer identifier
     * @return A {@link guru.springframework.msscbrewery.web.model.v2.BeerDtoV2} based on beer id
     */
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder()
                .id(beerId)
                .beerName("Heineken")
                .beerStyle(BeerStyleEnum.PILSENER)
                .build();
    }

    /**
     * @param beerDto BeerDto entity
     * @return Saved BeerDto entity
     */
    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .beerStyle(beerDto.getBeerStyle())
                .beerName(beerDto.getBeerName())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {
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
