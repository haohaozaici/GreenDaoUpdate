package io.github.haohaozaici.greendaoupdate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import io.github.haohaozaici.greendaoupdate.model.db.Sample;

public class MainActivity extends AppCompatActivity {

  private static final String TAG = "MainActivity";


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    if (App.getDaoSession().getSampleDao().count() <= 6) {
      Sample sample = new Sample();
      sample.setDate("11");
      sample.setUser_id("22");
      sample.setBatch_no("33");
      sample.setDetails("44");
      sample.setTest1("1111test");
      App.getDaoSession().getSampleDao().insert(sample);
    }

    Log.d(TAG, "onCreate: " + App.getDaoSession().getSampleDao().count());

  }

}
