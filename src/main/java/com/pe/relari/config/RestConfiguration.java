package com.pe.relari.config;

import com.pe.relari.people.dao.repository.EmployeeApi;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Class RestConfiguration.
 * @author Relari
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RestConfiguration {

  private static Retrofit retrofit() {

//    OkHttpClient okHttpClient = new OkHttpClient();
//    okHttpClient.connectTimeoutMillis();
//    okHttpClient.readTimeoutMillis();
//    okHttpClient.writeTimeoutMillis();

    return new Retrofit.Builder()
        .baseUrl("https://employee-firebase.herokuapp.com/")
        .addConverterFactory(GsonConverterFactory.create())
//        .client(new OkHttpClient())
        .build();
  }

  public static EmployeeApi employeeApi() {
    return retrofit().create(EmployeeApi.class);
  }

}
