package com.example.SeptaGPSAndroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.gson.Gson;
import org.apache.http.impl.client.DefaultHttpClient;

public class MyActivity extends Activity {

    Button busRouteButton;
    TextView loadingRoutesMessage;
    Spinner routesList;

    DefaultHttpClient httpClient;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        busRouteButton = (Button) findViewById(R.id.busButton);
        loadingRoutesMessage = (TextView) findViewById(R.id.loadingRoutesMessage);
        routesList = (Spinner) findViewById(R.id.busRouteList);
        loadingRoutesMessage.setVisibility(0);
        routesList.setVisibility(0);

    }

    /** Called when user clicks the Bus Routes button */
    public void findBusRoutes(View view) {
        loadingRoutesMessage.setVisibility(1);
        routesList.setVisibility(0);

        httpClient = new DefaultHttpClient(getResources().);

    }
}
