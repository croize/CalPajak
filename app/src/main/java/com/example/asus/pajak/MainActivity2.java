package com.example.asus.pajak;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity{

    private EditText edtPanjang, edtLebar, edtTaman;
    private Button btnHitung;
    private TextView txtLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle b = getIntent().getExtras();

        TextView nama = (TextView) findViewById(R.id.namaValue);
        TextView alamat = (TextView) findViewById(R.id.alamatValue);

        nama.setText(b.getCharSequence("nama"));
        alamat.setText(b.getCharSequence("alamat"));

        edtPanjang = (EditText)findViewById(R.id.edt_panjang);
        edtLebar = (EditText)findViewById(R.id.edt_lebar);
        edtTaman = (EditText)findViewById(R.id.edt_taman);
        btnHitung = (Button)findViewById(R.id.btn_hitung);
        txtLuas = (TextView)findViewById(R.id.txt_luas);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String panjang = edtPanjang.getText().toString().trim();
                String lebar = edtLebar.getText().toString().trim();
                String taman = edtTaman.getText().toString().trim();

                int luastanah = Integer.parseInt(panjang);
                int  luasbangunan = Integer.parseInt(lebar);
                int luastaman = Integer.parseInt(taman);


                int bangunan1 = luasbangunan * 1000000;
                int kosong = luastaman * 500000;
                int tanah1 = luastanah * 2000000;
                int nilaibangunan = bangunan1 + kosong - 10000000;
                double pbb1 = nilaibangunan * 0.1/100;
                double pbb = tanah1 * 0.1/100;
                double total = pbb1 + pbb;

                txtLuas.setText("Total PBB:  "+ total);
            }
        });

    }
}
