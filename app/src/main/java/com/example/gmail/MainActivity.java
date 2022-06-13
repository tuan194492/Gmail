package com.example.gmail;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends ListActivity {
    private String[] names = {"Nguyen", "Quoc", "Tuan", "ABCDE"};
    private String[] subjects = {" I was right – and that’s not good for you",
                                "13 email marketing trends you must know",
                                " Before you write another blog post, read this",
                                "We’re starting in 5 HOURS"
    };
    private String[] times = {"12:34pm", "12:34pm", "12:34pm", "12:34pm"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomAdapter customAdapter = new CustomAdapter(this, R.layout.custom_list_item, names, subjects, times);
        setListAdapter(customAdapter);
    }
}
