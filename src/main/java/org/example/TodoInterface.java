package org.example;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface TodoInterface {

    @GET("/todos/{id}")
    Call<Todo> getTodoByID(@Path("id") String id);
}
