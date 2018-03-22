package id.sch.smktelkom_mlg.learn.recyclerview3;

import android.content.Intent;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class reminder extends AppCompatActivity {
    Button buttonAlarm;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);

        buttonAlarm = (Button)findViewById(R.id.btnAlarm);

        buttonAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { createAlarm("jadwal hewan .....",00,00);

            }
        });
    }

    private void createAlarm(String message, int hour,int minutes) {
        Intent alarmIntent = new Intent(AlarmClock.ACTION_SET_ALARM);
        alarmIntent.putExtra(AlarmClock.EXTRA_MESSAGE,message);
        alarmIntent.putExtra(AlarmClock.EXTRA_HOUR,hour);
        alarmIntent.putExtra(AlarmClock.EXTRA_MINUTES,minutes);

        if(alarmIntent.resolveActivity(getPackageManager()) != null)startActivity(alarmIntent);
    }
}

