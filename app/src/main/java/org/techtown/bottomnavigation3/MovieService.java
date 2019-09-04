package org.techtown.bottomnavigation3;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


public interface MovieService {
    //https://ghibliapi.herokuapp.com/films
    @GET("films")
    Call<List<MovieList>> getMovies();
}
