package com.digitalinnovationone.beerDIO.mapper;

import com.digitalinnovationone.beerDIO.dto.BeerDTO;
import com.digitalinnovationone.beerDIO.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}