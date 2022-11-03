package com.example.utsprl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
                    Intent intent = new Intent(getApplicationContext(), ProfilNadiah.class);
                    startActivity(intent);
                } else if (selectedItem=="Nailul Munjidah"){
                    Intent intent = new Intent(getApplicationContext(), ProfilNela.class);
                    startActivity(intent);
                }else if (selectedItem=="Ramsya Devanaqia Vansa Aseka"){
//                    Intent intent = new Intent(getApplicationContext(), ProfilNela.class);
//                    startActivity(intent);
                }else if (selectedItem=="Rizqulloh Rayhan Ferdiansyah"){
                    Intent intent = new Intent(getApplicationContext(), Profil_Rizqulloh.class);
                    startActivity(intent);
                }else if (selectedItem=="Syifa' Aulia Ash-Sholihah"){
                    Intent intent = new Intent(getApplicationContext(), ProfilSyifa.class);
                    startActivity(intent);
                }
            }
        });
    }
}