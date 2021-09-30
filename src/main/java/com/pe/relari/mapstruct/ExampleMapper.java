package com.pe.relari.mapstruct;

import com.pe.relari.mapstruct.model.CurrencyDetail;
import com.pe.relari.mapstruct.model.Limit;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface ExampleMapper {

  @Mapping(source = "limit.currencyCode", target = "currency.code")
  @Mapping(source = "limit.currencyCode", target = "currency.description", qualifiedByName = "currencyDescription")
  @Mapping(expression = "java(false)", target = "isActive")
  CurrencyDetail mapCurrencyDetail(Limit limit);
  
  @Named("currencyDescription")
  default String currencyDescription(String currencyCode) {
    return currencyCode.equals("PEN") ? "SOLES" : "DOLARES";
  }

}
