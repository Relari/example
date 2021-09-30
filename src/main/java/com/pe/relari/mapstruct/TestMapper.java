package com.pe.relari.mapstruct;

import com.pe.relari.mapstruct.model.Limit;

public class TestMapper {

    public static void main(String[] args) {

        var mapper = new ExampleMapperImpl();

        var limit = new Limit();
        limit.setCurrencyCode("PEN");

        var currencyDetail = mapper.mapCurrencyDetail(limit);
        System.out.println(currencyDetail);

    }
}
