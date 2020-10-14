package com.example.p_blog;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;
    NavigationView navigationView;
    LinearLayout cv1_img1,cv3_img1,cv4_img1,cv5_img1,cv6_img1,cv7_img1,cv8_img1,cv9_img1;

    LinearLayout  cv2_img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawerId);
        toggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.nav_open, R.string.nav_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        /*...........*/

        drawerLayout = findViewById(R.id.drawerId);

        navigationView = findViewById(R.id.navigationId);
        navigationView.setNavigationItemSelectedListener(this);

        /*.............*/

        cv1_img1 = (LinearLayout) findViewById(R.id.cv1img1);

        cv1_img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, cv1image1.class);
                startActivity(intent);
            }
        });


        /*.................*/

        cv2_img1 = (LinearLayout) findViewById(R.id.cv2img1);

        cv2_img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, cv2image1.class);
                startActivity(intent);
            }
        });




        /*.................*/

        cv3_img1 = (LinearLayout) findViewById(R.id.cv3img1);

        cv3_img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, cv3image1.class);
                startActivity(intent);
            }
        });



        /*.................*/

        cv4_img1 = (LinearLayout) findViewById(R.id.cv4img1);

        cv4_img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, cv4image1.class);
                startActivity(intent);
            }
        });



        /*.................*/

        cv5_img1 = (LinearLayout) findViewById(R.id.cv5img1);

        cv5_img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, cv5image1.class);
                startActivity(intent);
            }
        });



        /*.................*/

        cv6_img1 = (LinearLayout) findViewById(R.id.cv6img1);

        cv6_img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, cv6image1.class);
                startActivity(intent);
            }
        });



        /*.................*/

        cv7_img1 = (LinearLayout) findViewById(R.id.cv7img1);

        cv7_img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, cv7image1.class);
                startActivity(intent);
            }
        });


        /*.................*/

        cv8_img1 = (LinearLayout) findViewById(R.id.cv8img1);

        cv8_img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, cv8image1.class);
                startActivity(intent);
            }
        });


        /*.................*/

        cv9_img1 = (LinearLayout)findViewById(R.id.cv9img1);

        cv9_img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, cv9image1.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(toggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        Intent intent;

        if(menuItem.getItemId()==R.id.aboutMeMenuId)
        {
            intent = new Intent(this, aboutMe.class);
            startActivity(intent);
        }

        else if(menuItem.getItemId()==R.id.aboutAppMenuId)
        {
            intent = new Intent(this, aboutApp.class);
            startActivity(intent);
        }
        else if(menuItem.getItemId()==R.id.contactMenuId)
        {
            intent = new Intent(this, contactMe.class);
            startActivity(intent);
        }

        return false;
    }
}
