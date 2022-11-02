package com.example.utsprl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv = (ListView) findViewById(R.id.lv);

        String[] anggota = new String[]{
                "Nadiah Hatta Mokora",
                "Nailul Munjidah",
                "Ramsya Devanaqia Vansa Aseka",
                "Rizqulloh Rayhan Ferdiansyah",
                "Syifa' Aulia Ash-Sholihah"
        };

        List<String> anggota_list = new ArrayList<String>(Arrays.asList(anggota));

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, anggota_list);

        lv.setAdapter(arrayAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = (String) parent.getItemAtPosition(position);
                if (selectedItem=="Nadiah Hatta Mokora"){

                } else if (selectedItem=="Nailul Munjidah"){

                }else if (selectedItem=="Ramsya Devanaqia Vansa Aseka"){

                }else if (selectedItem=="Rizqulloh Rayhan Ferdiansyah"){

                }else if (selectedItem=="Syifa' Aulia Ash-Sholihah"){

                }
            }
        });
    }
}