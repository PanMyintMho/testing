package com.example.frag_one;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
int count=0,counter=0;
    TextView tvone,tvtwo;
    Button btnone,btntwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvone=findViewById(R.id.tvone);
        tvtwo=findViewById(R.id.tvtwo);
        btnone=findViewById(R.id.btnone);
        btntwo=findViewById(R.id.btntwo);
        btnone.setOnClickListener(this);
        btntwo.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
//    switch (view.getId()){
//        case R.id.btnone:
//            count++;
//            tvtwo.setText("You Click me Button Two "+ count+" "+"time.");
//
//            break;
//        case R.id.btntwo:
//            counter++;
//            tvone.setText("You click me Button One "+ counter+" "+"time.");
//            break;
//
//}
//
       Button btn= (Button) view;
       if (btn.getText().toString().contentEquals("Button One"))
        {
           count++;
           tvtwo.setText("You click me Button One"+count+"time.");
        }
        else if (btn.getText().toString().contentEquals("Button Two"))
        {
            counter++;
            tvone.setText("You Click me Buttib Two"+counter+"time.");
        }
    }
}