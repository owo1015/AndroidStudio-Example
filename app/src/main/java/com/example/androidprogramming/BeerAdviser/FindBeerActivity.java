package com.example.androidprogramming.BeerAdviser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.androidprogramming.R;

import java.util.List;

public class FindBeerActivity extends AppCompatActivity {

    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);

        Spinner color = (Spinner) findViewById(R.id.color);
        Button find_beer = (Button) findViewById(R.id.find_beer);
        TextView brands = (TextView) findViewById(R.id.brands);

        find_beer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String beerType = String.valueOf(color.getSelectedItem());

                List<String> brandsList = expert.getBrands(beerType);
                StringBuilder brandsFormatted = new StringBuilder();
                for (String brand : brandsList) {
                    brandsFormatted.append(brand).append('\n');
                }

                brands.setText(brandsFormatted);
            }
        });
    }
}