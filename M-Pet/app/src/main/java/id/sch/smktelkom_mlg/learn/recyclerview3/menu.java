package id.sch.smktelkom_mlg.learn.recyclerview3;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;


public class menu extends AppCompatActivity  implements View.OnClickListener{

    FrameLayout button,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        button = (FrameLayout) findViewById(R.id.mail);
        button.setOnClickListener((View.OnClickListener) this);
        button2 = (FrameLayout) findViewById(R.id.petshop);
        button2.setOnClickListener((View.OnClickListener) this);
        button3 = (FrameLayout) findViewById(R.id.petcare);
        button3.setOnClickListener((View.OnClickListener) this);
        button4 = (FrameLayout) findViewById(R.id.reminder);
        button4.setOnClickListener((View.OnClickListener) this);

    }
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Apakah Anda Ingin Keluar?")
                .setCancelable(false)
                .setPositiveButton("Iya", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        menu.this.finish();
                    }
                })
                .setNegativeButton("Tidak", null)
                .show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.petshop:
                Intent yIntent = new Intent(menu.this, MainActivity.class);
                startActivity(yIntent);
                break;

            case R.id.petcare:
                Intent wIntent = new Intent(menu.this, MainActivity2.class);
                startActivity(wIntent);
                break;

            case R.id.mail:
                Intent mIntent = new Intent(menu.this, MainActivity3.class);
                startActivity(mIntent);
                break;

            case R.id.reminder:
                Intent tIntent = new Intent(menu.this, reminder.class);
                startActivity(tIntent);
                break;


        }
    }
}