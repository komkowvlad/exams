package com.example.vladkomkow.exams;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    Calendar date;
    Calendar actualDate = Calendar.getInstance();
    String[] list= {"Выбирите экзамен", "География", "Информатика", "Матем(база)", "Матем(профиль)", "Обществознание" , "Литеретура", "Физика",
            "русскай язык", "Английский язык" , "Биология" , "Английский(усн)" , "Химия" , "История"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, list);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        spinner.setAdapter(adapter);
        for (int i = 0; i<list.length; i++){
            switch (list[i]){
                case "География": date.set(2017, 5, 29, 9, 0, 0);break;
                case "Информатика": date.set(2017, 5, 29, 9, 0, 0); break;
                case "Матем(база)": date.set(2017, 5, 31, 9, 0, 0); break;
                case "Матем(профиль)": date.set(2017, 6, 2, 9, 0, 0); break;
                case "Обществознание": date.set(2017, 6, 5, 9, 0 , 0); break;
                case "Литеретура": date.set(2017, 6, 7, 9, 0, 0); break;
                case "Физика": date.set(2017, 6, 7, 9, 0, 0); break;
                case "русскай язык": date.set(2017, 6, 9, 9, 0, 0); break;
                case "Английский язык": date.set(2017, 6, 13, 9, 0, 0); break;
                case "Биология": date.set(2017, 6, 13, 9, 0, 0); break;
                case "Английский(усн)": date.set(2017, 6, 15, 9, 0, 0); break;
                case "Химия": date.set(2017, 6, 19, 9, 0, 0); break;
                case "История": date.set(2017, 6, 19, 9, 0, 0); break;
            }
            
        }


    }

}
