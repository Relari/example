package com.renzo.exercises.lessons.java.retrofit;

import com.renzo.exercises.lessons.java.model.Employee;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

interface EmployeeApi {

  @GET("/application/v1/firebase/employees")
  Call<List<Employee>> findAll();

  @POST("/application/v1/firebase/employees")
  Call<Void> save(@Body Employee employeeEntity);

}
