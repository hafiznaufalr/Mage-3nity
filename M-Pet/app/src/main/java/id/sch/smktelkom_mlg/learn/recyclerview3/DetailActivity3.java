package id.sch.smktelkom_mlg.learn.recyclerview3;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import id.sch.smktelkom_mlg.learn.recyclerview3.model.Hotel3;

import static id.sch.smktelkom_mlg.learn.recyclerview3.R.id.buttonShare;

public class DetailActivity3 extends AppCompatActivity {

    /*Deklarasi variable*/
    Button btn_navigasi;
    String goolgeMap = "com.google.android.apps.maps"; // identitas package aplikasi google masps android
    Uri gmmIntentUri;
    Intent mapIntent;
    String masjid_agung_demak = "-7.975203, 112.661867"; // koordinat omah

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail3);

        // menyamakan variable pada layout activity_main.xml
        btn_navigasi    = (Button) findViewById(buttonShare);

        Hotel3 hotel = (Hotel3) getIntent().getSerializableExtra(MainActivity3.HOTEL);
        setTitle(hotel.judul);
        ImageView ivFoto = (ImageView) findViewById(R.id.imageFoto);
        ivFoto.setImageURI(Uri.parse(hotel.foto));
        TextView tvDeskripsi = (TextView) findViewById(R.id.place_detail);
        tvDeskripsi.setText(hotel.detail);
        TextView tvLokasi = (TextView) findViewById(R.id.place_location);
        tvLokasi.setText(hotel.lokasi);
        TextView tvBaru = (TextView) findViewById(R.id.baru);
        tvBaru.setText(hotel.baru);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });



    }
}