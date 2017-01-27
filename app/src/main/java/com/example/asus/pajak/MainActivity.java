package com.example.asus.pajak;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    Button button;
    EditText nama;
    EditText alamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findAllViewsId();

        button.setOnClickListener(this);
    }

    private void findAllViewsId() {
        button = (Button) findViewById(R.id.kirimdata);
        nama = (EditText) findViewById(R.id.nama);
        alamat = (EditText) findViewById(R.id.alamat);
    }

    @Override
    public void onClick(View v){
        Intent intent = new Intent(getApplicationContext(),MainActivity2.class);

        Bundle b = new Bundle();

        b.putString("nama", nama.getText().toString());
        b.putString("alamat", alamat.getText().toString());

        intent.putExtras(b);

        startActivity(intent);
    }

}
