package com.example.ui_tasks;




import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;


public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder>{
    private Tab1RecV[] listdata;

    // RecyclerView recyclerView;
    public MyListAdapter(Tab1RecV[] listdata) {
        this.listdata = listdata;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.item_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Tab1RecV myListData = listdata[position];
        holder.textView1.setText(listdata[position].getTitle1());
        holder.textView3.setText(listdata[position].getTitle2());
        holder.textView2.setText(listdata[position].getText1());
        holder.textView4.setText(listdata[position].getText2());
        holder.imageView.setImageResource(listdata[position].getImg1());
        holder.imageView2.setImageResource(listdata[position].getImg2());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(view.getContext(),"click on item: "+Tab1RecV.cla(),Toast.LENGTH_LONG).show();
            }
        });
    }


    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView textView1;
        public ImageView imageView2;
        public TextView textView2;
        public TextView textView3;
        public TextView textView4;
        public LinearLayout linearLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            this.imageView = itemView.findViewById(R.id.imageView);
            this.textView1 =  itemView.findViewById(R.id.textView);
            this.imageView2 = itemView.findViewById(R.id.imageView2);
            this.textView2 =  itemView.findViewById(R.id.textView2);
            this.textView3 =  itemView.findViewById(R.id.textView3);
            this.textView4 =  itemView.findViewById(R.id.textView4);

            linearLayout = itemView.findViewById(R.id.linearLayout);
        }
    }
}