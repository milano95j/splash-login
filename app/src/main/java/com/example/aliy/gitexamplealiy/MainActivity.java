package com.example.aliy.gitexamplealiy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    private RecyclerView mRecycleView;
    private RecyclerView.LayoutManager rv_LayoutManager;
    private RecyclerView.Adapter rv_Adapter;
    private ArrayList<item_model> dataSet;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mRecycleView = (RecyclerView) findViewById(R.id.my_main_rv);

        rv_LayoutManager = new LinearLayoutManager(this);
        mRecycleView.setLayoutManager(rv_LayoutManager);



        dataSet = generateModels();





        RecyclerV_Adapter mAdapter = new RecyclerV_Adapter(this, dataSet);
        mRecycleView.setAdapter(mAdapter);




    }//END OF onCREATE



    //MODEL GENERATING
    private ArrayList<item_model> generateModels(){

        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 50; i++){

            if (i % 3 == 0){

                item_model item = new item_model();
                item._ID = i;
                item._Name = "Beach " + i;
                item._Img = "http://t.wallpaperweb.org/wallpaper/nature/1600x900/beautiful_dream_beach_1600x900.jpg";

                arrayList.add(item);

            }else if (i % 7 ==0){
                item_model item = new item_model();
                item._ID = i;
                item._Name = "Beach " + i;
                item._Img = "https://static.businessinsider.com/image/54e3bed56da811bb7d85a479/image.jpg";
                arrayList.add(item);


            }else if (i % 11 == 0){
                item_model item = new item_model();
                item._ID = i;
                item._Name = "Beach " + i;
                item._Img = "http://cdn29.us1.fansshare.com/images/kohphiphi/beach-hd-wallpaper-maya-bay-1995278818.jpg";
                arrayList.add(item);



            }else {
                item_model item = new item_model();
                item._ID = i;
                item._Name = "Beach " + i;
                item._Img = "https://gallery.yopriceville.com/var/albums/World/Cala_Salada_Ibiza_Spain_Wallpaper.jpg?m=1399676400";
                arrayList.add(item);


            }
        }

        return arrayList;

    }









}
