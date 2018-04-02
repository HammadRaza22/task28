package com.example.ghummanjeee.task28;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.ghummanjeee.task28.Adapter.Adaptergrid;
import com.example.ghummanjeee.task28.Adapter.UserAdapter;
import com.example.ghummanjeee.task28.Modal.User;

import java.util.ArrayList;


public class Gridview extends Fragment {

    GridView gridview ;
    UserAdapter oUserAapter;
    Adaptergrid gd;
    ArrayList<User> oListUsers;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view=inflater.inflate(R.layout.fragment_gridview,container,false);
        gridview = (GridView)view.findViewById(R.id.gridview);
        User ouser1=new User();
        ouser1.setFirstName("Ali");
        ouser1.setDrawableImage(R.drawable.xy);
        User ouser2=new User();
        ouser2.setFirstName("Ahmed");
        ouser2.setDrawableImage(R.drawable.xy);
        User ouser3=new User();
        ouser3.setFirstName("Tahir");
        ouser3.setDrawableImage(R.drawable.xy);
        User ouser4=new User();
        ouser4.setFirstName("Farooq");
        ouser4.setDrawableImage(R.drawable.xy);
        oListUsers=new ArrayList<User>();
        oListUsers.add(ouser1);
        oListUsers.add(ouser2);
        oListUsers.add(ouser3);
        oListUsers.add(ouser4);

     gd=new Adaptergrid(getActivity(),oListUsers);
        gridview.setAdapter(gd);
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                User Ouser=oListUsers.get(position);
                Toast.makeText(getActivity(),Ouser.getFirstName().toString(), Toast.LENGTH_SHORT).show();
            }
        });
        return view;

    }

}
