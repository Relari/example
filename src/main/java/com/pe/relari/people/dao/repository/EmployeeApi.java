package com.pe.relari.people.dao.repository;

import com.pe.relari.people.model.entity.EmployeeEntity;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

import java.util.List;

/**
 * Interface EmployeeApi.
 * @author Relari
 */
public interface EmployeeApi {

  @GET("business/firebase/v1/employees")
  Call<List<EmployeeEntity>> findAll();

  @POST("business/firebase/v1/employees")
  Call<Void> save(@Body EmployeeEntity employeeEntity);

}
