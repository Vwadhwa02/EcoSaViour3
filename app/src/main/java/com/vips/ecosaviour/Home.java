package com.vips.ecosaviour;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.vips.ecosaviour.databinding.ActivityHomeBinding;

public class Home extends AppCompatActivity {

    private ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button bu1=findViewById(R.id.bu1);
//        bu1.setOnClickListener((View view) ->{
//            Intent view2 = new Intent(Home.this,Support.class);
//            startActivity(view2);
//        });
        Button bu2=findViewById(R.id.bu2);
//        bu2.setOnClickListener((View view) ->{
//            Intent view3 = new Intent(Home.this,About.class);
//            startActivity(view3);
//        });

        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_home);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);
        //code bhagwan
    }
    public void shiftbu2(View view){
        Intent view4 = new Intent(Home.this,About.class);
        startActivity(view4);
    }
    public void shiftbu1(View view){
        Intent view5 = new Intent(Home.this,Supprt.class);
        startActivity(view5);
    }
}