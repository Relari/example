package com.renzo.exercises.lessons.java.retrofit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

class RestConfiguration {

  private Retrofit retrofit() {

    return new Retrofit.Builder()
        .baseUrl("https://employee-firebase.herokuapp.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .client(new OkHttpClient.Builder().build())
        .build();
  }

  public EmployeeApi employeeRepository() {
    return retrofit().create(EmployeeApi.class);
  }
}
