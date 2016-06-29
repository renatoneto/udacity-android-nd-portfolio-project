package net.renatoneto.udacityportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button popularMoviesButton = (Button)findViewById(R.id.launch_app_popular_movies);
        popularMoviesButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                launchMyApp("popular movies");
            }
        });

        Button stockHawkButton = (Button)findViewById(R.id.launch_app_stock_hawk);
        stockHawkButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                launchMyApp("stock hawk");
            }
        });

        Button buildItBiggerButton = (Button)findViewById(R.id.launch_app_build_it_bigger);
        buildItBiggerButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                launchMyApp("build it bigger");
            }
        });

        Button makeYourAppMaterialButton = (Button)findViewById(R.id.launch_app_make_your_app_material);
        makeYourAppMaterialButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                launchMyApp("make your app material");
            }
        });

        Button goUbiquitousButton = (Button)findViewById(R.id.launch_app_go_ubiquitous);
        goUbiquitousButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                launchMyApp("go ubiquitous");
            }
        });

        Button capstoneButton = (Button)findViewById(R.id.launch_app_capstone);
        capstoneButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                launchMyApp("capstone");
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        return super.onOptionsItemSelected(item);
    }

    protected void launchMyApp(String appName) {

        Toast.makeText(getApplicationContext(), "This button will launch my " + appName + " app!",
                Toast.LENGTH_SHORT).show();

    }

}
