package tasnuvaoshin.com.retrofitadvancetutorialpostrequest;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import tasnuvaoshin.com.retrofitadvancetutorialpostrequest.Response.MainResponseObjectClass;
import tasnuvaoshin.com.retrofitadvancetutorialpostrequest.tutorial5.CreateUserClass;

public interface OurRetrofitClient {

    @POST("q")
    Call<MainResponseObjectClass> GetPostValue(@Body MainObjectClass mainObjectClass);


    @FormUrlEncoded
    @POST("posts")
    Call<CreateUserClass> CreateUser(
            @Field("userId") int userId,
            @Field("title") String title,
            @Field("body") String body


    );

}
