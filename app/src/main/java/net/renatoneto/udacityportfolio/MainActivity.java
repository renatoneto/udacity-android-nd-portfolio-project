package net.renatoneto.udacityportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    protected Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button popularMoviesButton = (Button)findViewById(R.id.launch_app_popular_movies);
        popularMoviesButton.setOnClickListener(this);

        Button stockHawkButton = (Button)findViewById(R.id.launch_app_stock_hawk);
        stockHawkButton.setOnClickListener(this);

        Button buildItBiggerButton = (Button)findViewById(R.id.launch_app_build_it_bigger);
        buildItBiggerButton.setOnClickListener(this);

        Button makeYourAppMaterialButton = (Button)findViewById(R.id.launch_app_make_your_app_material);
        makeYourAppMaterialButton.setOnClickListener(this);

        Button goUbiquitousButton = (Button)findViewById(R.id.launch_app_go_ubiquitous);
        goUbiquitousButton.setOnClickListener(this);

        Button capstoneButton = (Button)findViewById(R.id.launch_app_capstone);
        capstoneButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.launch_app_popular_movies:
            case R.id.launch_app_stock_hawk:
            case R.id.launch_app_build_it_bigger:
            case R.id.launch_app_make_your_app_material:
            case R.id.launch_app_go_ubiquitous:
            case R.id.launch_app_capstone:

                Button button = (Button) v;
                String text   = button.getText().toString();

                launchMyApp(text);
                break;

        }

    }

    protected void launchMyApp(CharSequence appName) {

        showToast(this, getText(R.string.portfolio_launch_info_text) + " " + appName);

    }

    protected void showToast(Context context, String message) {

        if (toast != null) {
            toast.cancel();
        }

        toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        toast.show();

    }

}
