package com.pe.relari.example.mapstruct;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.pe.relari.example.mapstruct.model.Limit;
import org.junit.jupiter.api.Test;

class ExampleMapperTest {

    @Test
    void mapCurrencyDetailTest() {
        var mapper = new ExampleMapperImpl();

        var limit = new Limit();
        limit.setCurrencyCode("PEN");

        var currencyDetail = mapper.mapCurrencyDetail(limit);
        System.out.println(currencyDetail);

        assertEquals(limit.getCurrencyCode(), currencyDetail.getCurrency().getCode());
        assertEquals("SOLES", currencyDetail.getCurrency().getDescription());
    }
}
