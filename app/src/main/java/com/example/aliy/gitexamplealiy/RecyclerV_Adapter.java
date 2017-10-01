package com.example.aliy.gitexamplealiy;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Aliy on 9/30/17.
 */

public class RecyclerV_Adapter extends RecyclerView.Adapter<RecyclerV_Adapter.ItemViewHolder> {



    private Context context;
    private ArrayList<item_model> dataSet;

    public RecyclerV_Adapter(Context context, ArrayList<item_model> dataSet) {
        this.context = context;
        this.dataSet = dataSet;
    }











    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater =  LayoutInflater.from(parent.getContext());

        View view = inflater.from(parent.getContext()).inflate(R.layout.item_cardview_layout, parent, false);

        ItemViewHolder viewHolder = new ItemViewHolder(view);





        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {


        item_model item = dataSet.get(position);

        holder.textView.setText(item._Name);
        holder.imageView.setImageResource(R.drawable.img1);




    }

    @Override
    public int getItemCount() {
        if (dataSet != null){
            return dataSet.size();
        }
        return 0;
    }




        //VIEWHOLDER CLASS
        public static class ItemViewHolder extends RecyclerView.ViewHolder {
            // each data item is just a string in this case

            public CardView cardView;
            public ImageView imageView;
            public TextView textView;


            public ItemViewHolder(View v) {
                super(v);

                cardView = (CardView) v.findViewById(R.id.card_view_main);
                imageView = (ImageView) v.findViewById(R.id.iv_card);
                textView = (TextView) v.findViewById(R.id.tv_card);



            }
        }

}
