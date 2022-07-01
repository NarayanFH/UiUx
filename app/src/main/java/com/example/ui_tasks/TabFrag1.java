package com.example.ui_tasks;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TabFrag1 extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_tab_frag1, container, false);


        Tab1RecV[] myListData = new Tab1RecV[] {
                new  Tab1RecV("Data1","Text1","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. ","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum is simply dummy text of the printing and typesetting industry", android.R.drawable.ic_dialog_email,android.R.drawable.ic_dialog_alert),
                new  Tab1RecV("Data2","Text2","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. ", android.R.drawable.ic_dialog_email,android.R.drawable.ic_dialog_dialer),
                new  Tab1RecV("Data3","Text3","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","Lorem Ipsum is simply dummy text of the printing and typesetting industry.", android.R.drawable.ic_dialog_email,android.R.drawable.ic_dialog_email),
                new  Tab1RecV("Data4","Text4","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","Lorem Ipsum is simply dummy text of the printing and typesetting industry.", android.R.drawable.ic_dialog_info,android.R.drawable.ic_dialog_email),
                new  Tab1RecV("Email","Email","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","Lorem Ipsum is simply dummy text of the printing and typesetting industry.", android.R.drawable.ic_dialog_map,android.R.drawable.ic_dialog_email),
                new  Tab1RecV("Email","Email","Email","Email", android.R.drawable.ic_dialog_email,android.R.drawable.ic_dialog_email),
                new  Tab1RecV("Email","Email","Email","Email", android.R.drawable.ic_dialog_email,android.R.drawable.ic_dialog_email),
                new  Tab1RecV("Email","Email","Email","Email", android.R.drawable.ic_dialog_email,android.R.drawable.ic_dialog_email),
//                new Tab1RecV("Info", android.R.drawable.ic_dialog_info),
//                new Tab1RecV("Delete", android.R.drawable.ic_delete),
//                new Tab1RecV("Dialer", android.R.drawable.ic_dialog_dialer),
//                new Tab1RecV("Alert", android.R.drawable.ic_dialog_alert),
//                new Tab1RecV("Map", android.R.drawable.ic_dialog_map),
//                new Tab1RecV("Email", android.R.drawable.ic_dialog_email),
//                new Tab1RecV("Info", android.R.drawable.ic_dialog_info),
//                new Tab1RecV("Delete", android.R.drawable.ic_delete),
//                new Tab1RecV("Dialer", android.R.drawable.ic_dialog_dialer),
//                new Tab1RecV("Alert", android.R.drawable.ic_dialog_alert),
//                new Tab1RecV("Map", android.R.drawable.ic_dialog_map),
        };

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        recyclerView.setAdapter(adapter);
        return view;
    }
}