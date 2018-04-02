package com.example.ghummanjeee.task28.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ghummanjeee.task28.Modal.User;
import com.example.ghummanjeee.task28.R;

import java.util.ArrayList;


public class UserAdapter extends ArrayAdapter<User> {
    ArrayList<User> OListuser;
    LayoutInflater OLayoutInflater;
    public UserAdapter(Context context, ArrayList<User> OuserList) {
        super(context,0,  OuserList);
        OListuser=OuserList;
        OLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public ArrayList<User> getOuser() {
        return OListuser;
    }

    public void setOuser(ArrayList<User> ouser) {
        OListuser = ouser;
    }

    public LayoutInflater getOLayoutInflater() {
        return OLayoutInflater;
    }

    public void setOLayoutInflater(LayoutInflater OLayoutInflater) {
        this.OLayoutInflater = OLayoutInflater;
    }





    @Override
    public int getCount() {
        return OListuser.size();
    }

    @Override
    public User getItem(int position) {

        return OListuser.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view=OLayoutInflater.inflate(R.layout.items,null,true);


        TextView fname=(TextView)view.findViewById(R.id.tvName);
        ImageView UserImgView=(ImageView)view.findViewById(R.id.iamgeview);
        User ouser=  getItem(position);
        fname.setText(ouser.getFirstName());
       UserImgView.setImageResource(ouser.getDrawableImage());
        return  view;

    }

}
