package com.example.gmail;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class CustomAdapter extends ArrayAdapter<String> {
    Context context;
    String[] names;
    String[] subjects;
    String[] times;
    public CustomAdapter(@NonNull Context context, int resource, String[] names, String[] subjects, String[] times) {
        super(context, resource, names);
        this.context = context;
        this.names = names;
        this.subjects = subjects;
        this.times = times;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        View row = inflater.inflate(R.layout.custom_list_item, null);
        TextView name = (TextView) row.findViewById(R.id.name);
        TextView subject = (TextView) row.findViewById(R.id.subject);
        TextView time = (TextView) row.findViewById(R.id.time);

        name.setText(names[position]);
        subject.setText(subjects[position]);
        time.setText(times[position]);

        return (row);
    }

}
