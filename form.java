package com.example.secondapp;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	EditText et;
	Spinner sp;
	RadioGroup rg;
	RadioButton r1, r2;
	ListView lv;
	RatingBar rb;
	Button b;
	String name;
	int degree;
	String area;
	String rating;
	String sex;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_main);

	    et = (EditText) findViewById(R.id.editText1);
	    sp = (Spinner) findViewById(R.id.spinner1);
	    rg = (RadioGroup) findViewById(R.id.radioGroup1);
	    r1 = (RadioButton) findViewById(R.id.radioButton1);
	    r2 = (RadioButton) findViewById(R.id.radioButton2);
	    lv = (ListView) findViewById(R.id.listView1);
	    rb = (RatingBar) findViewById(R.id.ratingBar1);
	    b = (Button) findViewById(R.id.button1);

	    // Spinner Item

	    sp.setOnItemSelectedListener(new OnItemSelectedListener() {
	        @Override
	        public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
	            sex = arg0.getItemAtPosition(arg2).toString();
	        }

	        @Override
	        public void onNothingSelected(AdapterView<?> arg0) {
	        }
	    });

	    // RadioGroup Item

	    rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {
	        @Override
	        public void onCheckedChanged(RadioGroup arg0, int arg1) {
	            String temp;
	            View radioButton = arg0.findViewById(arg1);
	            int index = arg0.indexOfChild(radioButton);
	            if (index == 0) 
	                temp = "B.E CSE";
	            else 
	                temp = "B.TECH IT";
	            degree = temp;
	        }
	    });
	    lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                area = ((TextView) arg1).getText().toString();
            }
        });
	    rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar arg0, float arg1, boolean arg2) {
                rating = String.valueOf(arg1);
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                name = et.getText().toString();

                String line = System.getProperty("line.separator");
                String str = "Name = " + name + line + "Sex = " + sex + "Degree = " + degree + line + "Area = " + area + line + "Rating = " + rating;

                Toast.makeText(MainActivity.this, str, Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this, "Your Data Saved!!!", Toast.LENGTH_LONG).show();
            }
        });
	    }

        @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
