package com.example.app4mt;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends Activity {
  ProgressBar pb;
  TextView tv;
  Button b;
  int i;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    pb = (ProgressBar) findViewById(R.id.progressBar1);
    tv = (TextView) findViewById(R.id.textView1);
    b = (Button) findViewById(R.id.button1);
    b.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View arg0) {
   
        Runnable r = new Runnable() {
          @Override
          public void run() {
           
            for (i = 20; i <= 100; i += 20) {
              final int value = i;
              try {
                Thread.sleep(2000);
              } catch (Exception e) {}
              pb.post(new Runnable() {
                @Override
                public void run() {
                
                  tv.setText(String.valueOf(value) + "%");
                  pb.setProgress(value);
                  if (value == 100)
                    Toast.makeText(MainActivity.this, "Download Completed...",3000).show();
                }
              });
            }
          }
        };
        new Thread(r).start();
      }
    });
  }
  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
      
      getMenuInflater().inflate(R.menu.main, menu);
      return true;
  }
}
