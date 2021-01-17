package org.security.hershield.Retrofit;

import org.security.hershield.model.RetrofitModel.PlaceResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RetrofitInterface {

    @GET("{parameter}.JSON")
    Call<PlaceResult> getData(@Path("parameter") String parameter, @Query("key") String key, @Query("lat") String lat, @Query("lon") String lon);

}
