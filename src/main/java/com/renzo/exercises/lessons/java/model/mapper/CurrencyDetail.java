package com.renzo.exercises.lessons.java.model.mapper;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CurrencyDetail {

    private Currency currency;
    private Boolean isActive;

}
