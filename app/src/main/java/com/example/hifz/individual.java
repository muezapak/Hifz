package com.example.hifz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class individual extends AppCompatActivity {

    TextView name;
    TextView id;
    TextView age;
    TextView class1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individual);
        name=findViewById(R.id.name1);
        id=findViewById(R.id.id1);
        age=findViewById(R.id.age1);
        class1=findViewById(R.id.class1);


        Intent intent = getIntent();
        Students myObject = (Students) ((Intent) intent).getSerializableExtra("myObject");
        name.setText(myObject.getName());

        id.setText(String.valueOf(myObject.getId()));
        age.setText(myObject.getAge());
        class1.setText(myObject.getSclass());

        System.out.println("name"+name.getText().toString());
        System.out.println("id"+id.getText().toString());
        System.out.println("age"+age.getText().toString());

        System.out.println("class"+class1.getText().toString());
        System.out.println("Done");









// Perform operations with the receivedObject

    }
}