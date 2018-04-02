package com.example.ghummanjeee.task28;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.darwindeveloper.horizontalscrollmenulibrary.custom_views.HorizontalScrollMenuView;
import com.darwindeveloper.horizontalscrollmenulibrary.extras.MenuItem;

public class MainActivity extends AppCompatActivity {
    HorizontalScrollMenuView horizontal_menu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BlankFragment Listview;
        Gridview gd;
        horizontal_menu = (HorizontalScrollMenuView) findViewById(R.id.horizontal_menu);
        horizontal_menu.addItem("ListView", R.drawable.abc,true);
        horizontal_menu.addItem("GridView", R.drawable.xy);
        horizontal_menu.showItems();
        final BlankFragment finalListview;
        horizontal_menu.setOnHSMenuClickListener(new HorizontalScrollMenuView.OnHSMenuClickListener() {
            @Override
            public void onHSMClick(MenuItem menuItem, int position) {


             Gridview gd=new Gridview();
                getSupportFragmentManager().beginTransaction().replace(R.id.fyp,gd).commit();
            }
        });

    }



    }

