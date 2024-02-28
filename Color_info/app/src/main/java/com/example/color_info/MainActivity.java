package com.example.color_info;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Spinner spinnerColors;
    private Button buttonShowDescription;
    private TextView textViewDescription;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerColors = findViewById(R.id.spinner);
        buttonShowDescription = findViewById(R.id.button);
        textViewDescription = findViewById(R.id.textView);
        buttonShowDescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = spinnerColors.getSelectedItemPosition();
                String description = getDescriptionByPosition(position) ;
                textViewDescription.setText(description);
            }
        });

    }

    private String getDescriptionByPosition(int position) {
        String[] descriptions = getResources().getStringArray(R.array.description_of_colors);
        return descriptions[position];
    }


}
