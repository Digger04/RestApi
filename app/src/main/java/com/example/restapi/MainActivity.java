package com.example.restapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.restapi.callapi.ApiSV;
import com.example.restapi.callapi.callapi;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private TextView txt;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initview();
        tojon();
        click_callapi();
    }

    private void click_callapi() {
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               //http://apilayer.net/api/live?access_key=843d4d34ae72b3882e3db642c51e28e6&currencies=VND&source=USD&format=1
               ApiSV.apisv.callAPI("843d4d34ae72b3882e3db642c51e28e6","VND","USD",1)
                       .enqueue(new Callback<callapi>() {
                           @Override
                           public void onResponse(Call<callapi> call, Response<callapi> response) {
                               callapi callapi = response.body();
                               txt.setText(callapi.isSuccess() + "\n" + callapi.getError().getCode() +"\n"
                               + callapi.getError().getInfo());
                           }

                           @Override
                           public void onFailure(Call<callapi> call, Throwable t) {
                               txt.setText("Có lỗi xảy ra");
                           }
                       });
           }
       });
    }

    private void tojon() {
        Info info = new Info("Sơn La", "0333690316");
        List<Job> jobList = new ArrayList<>();
        jobList.add(new Job(1, "Android"));
        jobList.add(new Job(2,"Ios"));
        User user = new User("Chung",26,info,jobList);

        Gson gson = new Gson();
        String json = gson.toJson(user);

        Log.d("1111111", "kq = " + json);

    }

    private void initview() {
        txt = findViewById(R.id.txt);
        button = findViewById(R.id.button);
    }
}