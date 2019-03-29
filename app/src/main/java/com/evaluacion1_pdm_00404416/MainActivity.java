package com.evaluacion1_pdm_00404416;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.function.Function;

public class MainActivity extends AppCompatActivity {

    private TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9;

    private LinearLayout ll1, ll2, ll3, ll4, ll5, ll6, ll7, ll8, ll9;

    private Integer s;


    private void TV(TextView TView){
        TView.setText(((Integer.parseInt(TView.getText().toString())+1)+""));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ll1=findViewById(R.id.ll1);
        ll2=findViewById(R.id.ll2);
        ll3=findViewById(R.id.ll3);
        ll4=findViewById(R.id.ll4);
        ll5=findViewById(R.id.ll5);
        ll6=findViewById(R.id.ll6);
        ll7=findViewById(R.id.ll7);
        ll8=findViewById(R.id.ll8);
        ll9=findViewById(R.id.ll9);

        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        tv3=findViewById(R.id.tv3);
        tv4=findViewById(R.id.tv4);
        tv5=findViewById(R.id.tv5);
        tv6=findViewById(R.id.tv6);
        tv7=findViewById(R.id.tv7);
        tv8=findViewById(R.id.tv8);
        tv9=findViewById(R.id.tv9);

        ll1.setOnClickListener( v ->{

            TV(tv1);

        });

        ll2.setOnClickListener( v ->{

            TV(tv2);

        });

        ll3.setOnClickListener( v ->{

            TV(tv3);

        });

        ll4.setOnClickListener( v ->{

            TV(tv4);

        });

        ll5.setOnClickListener( v ->{

            TV(tv5);

        });

        ll6.setOnClickListener( v ->{

            TV(tv6);

        });

        ll7.setOnClickListener( v ->{

            TV(tv7);

        });

        ll8.setOnClickListener( v ->{

            TV(tv8);

        });

        ll9.setOnClickListener( v ->{

            TV(tv9);

        });


    }





}
