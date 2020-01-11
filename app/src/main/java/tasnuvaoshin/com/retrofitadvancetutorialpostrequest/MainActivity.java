package tasnuvaoshin.com.retrofitadvancetutorialpostrequest;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import tasnuvaoshin.com.retrofitadvancetutorialpostrequest.Response.MainResponseObjectClass;
import tasnuvaoshin.com.retrofitadvancetutorialpostrequest.tutorial5.CreateUserClass;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    LastLoginObject lastLoginObject;
    dataObjectClass dataObjectClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();




        OurRetrofitClient ourRetrofitClient = retrofit.create(OurRetrofitClient.class);

     Call<CreateUserClass> call =   ourRetrofitClient.CreateUser(101,"Tutorial 5","This is Lets Study");


        call.enqueue(new Callback<CreateUserClass>() {
            @Override
            public void onResponse(Call<CreateUserClass> call, Response<CreateUserClass> response) {

                Log.d("title",response.body().getTitle());
                Log.d("body",response.body().getBody());
                Log.d("userId", String.valueOf(response.body().getUserId()));
            }

            @Override
            public void onFailure(Call<CreateUserClass> call, Throwable t) {
                Log.d("response","failed");
            }
        });














//        lastLoginObject = new LastLoginObject("dateTime|UNIX", "172.242.228.245");
//        dataObjectClass = new dataObjectClass("555", "internetEmail", "personGender", "name", lastLoginObject);
//
//        MainObjectClass mainObjectClass =  new MainObjectClass("MPSfLPolMP80AQJpPc5cYQ",dataObjectClass);
//        OurRetrofitClient ourRetrofitClient = retrofit.create(OurRetrofitClient.class);
//        Call<MainResponseObjectClass> res = ourRetrofitClient.GetPostValue(mainObjectClass);
//
//          res.enqueue(new Callback<MainResponseObjectClass>() {
//              @Override
//              public void onResponse(Call<MainResponseObjectClass> call, Response<MainResponseObjectClass> response) {
//
//                         String email =    response.body().getEmail();
//                         String Name =    response.body().getName();
//                         String Gender =    response.body().getGender();
//                         String Id =    response.body().getId();
//                         LastLoginObject object = response.body().getLast_login();
//
//                         String time =         object.getDate_time();
//                         String ip =         object.getIp4();
//
//                         Log.d("name",Name);
//                         Log.d("email",email);
//                         Log.d("email",email);
//                         Log.d("Id",Id);
//                         Log.d("time",time);
//                         Log.d("ip",ip);
//
//              }
//
//              @Override
//              public void onFailure(Call<MainResponseObjectClass> call, Throwable t) {
//                  Log.d("response","fail");
//              }
//          });
    }
}
