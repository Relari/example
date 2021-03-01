package com.renzo.exercises.lessons.java.example.test;

import com.renzo.exercises.lessons.java.mapper.ExampleMapperImpl;
import com.renzo.exercises.lessons.java.model.mapper.Limit;

public class TestMapper {

    public static void main(String[] args) {

        var mapper = new ExampleMapperImpl();

        var limit = new Limit();
        limit.setCurrencyCode("PEN");

        var currencyDetail = mapper.mapCurrencyDetail(limit);
        System.out.println(currencyDetail);

    }
}
