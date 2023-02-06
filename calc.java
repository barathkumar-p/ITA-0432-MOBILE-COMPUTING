package com.example.app3calculator;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends Activity implements View.OnClickListener {
  Button one, two, three, four, five, six, seven, eight, nine, zero, add,
  sub, mul, div, cancel, equal;
  EditText disp;
  int op1;
  int op2;
  String optr;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    one = (Button) findViewById(R.id.Button08);
    two = (Button) findViewById(R.id.Button15);
    three = (Button) findViewById(R.id.Button14);
    four = (Button) findViewById(R.id.Button03);
    five = (Button) findViewById(R.id.Button02);
    six = (Button) findViewById(R.id.Button01);
    seven = (Button) findViewById(R.id.button1);
    eight = (Button) findViewById(R.id.Button06);
    nine = (Button) findViewById(R.id.Button05);
    zero = (Button) findViewById(R.id.Button11);
    add = (Button) findViewById(R.id.Button09);
    sub = (Button) findViewById(R.id.Button13);
    mul = (Button) findViewById(R.id.Button07);
    div = (Button) findViewById(R.id.Button04);
    cancel = (Button) findViewById(R.id.Button12);
    equal = (Button) findViewById(R.id.Button10);
    disp = (EditText) findViewById(R.id.editText1);
    try {
      one.setOnClickListener(this);
      two.setOnClickListener(this);
      three.setOnClickListener(this);
      four.setOnClickListener(this);
      five.setOnClickListener(this);
      six.setOnClickListener(this);
      seven.setOnClickListener(this);
      eight.setOnClickListener(this);
      nine.setOnClickListener(this);
      zero.setOnClickListener(this);
      cancel.setOnClickListener(this);
      add.setOnClickListener(this);
      sub.setOnClickListener(this);
      mul.setOnClickListener(this);
      div.setOnClickListener(this);
      equal.setOnClickListener(this);
    } catch (Exception e) {}
  }
  public void operation() {
    if (optr.equals("+")) {
      op2 = Integer.parseInt(disp.getText().toString());
      disp.setText("");
      op1 = op1 + op2;
      disp.setText(Integer.toString(op1));
    } else if (optr.equals("-")) {
      op2 = Integer.parseInt(disp.getText().toString());
      disp.setText("");
      op1 = op1 - op2;
      disp.setText(Integer.toString(op1));
    } else if (optr.equals("*")) {
      op2 = Integer.parseInt(disp.getText().toString());
      disp.setText("");
      op1 = op1 * op2;
      disp.setText(Integer.toString(op1));
    } else if (optr.equals("/")) {
      op2 = Integer.parseInt(disp.getText().toString());
      disp.setText("");
      op1 = op1 / op2;
      disp.setText(Integer.toString(op1));
    }
  }
  @Override
  public void onClick(View arg0) {
    Editable str = disp.getText();
    switch (arg0.getId()) {
    case R.id.Button08:
      if (op2 != 0) {
        op2 = 0;
        disp.setText("");
      }
      str = str.append(one.getText());
      disp.setText(str);
      break;
    case R.id.Button15:
      if (op2 != 0) {
        op2 = 0;
        disp.setText("");
      }
      str = str.append(two.getText());
      disp.setText(str);
      break;
    case R.id.Button14:
      if (op2 != 0) {
        op2 = 0;
        disp.setText("");
      }
      str = str.append(three.getText());
      disp.setText(str);
      break;
    case R.id.Button03:
      if (op2 != 0) {
        op2 = 0;
        disp.setText("");
      }
      str = str.append(four.getText());
      disp.setText(str);
      break;
    case R.id.Button02:
      if (op2 != 0) {
        op2 = 0;
        disp.setText("");
      }
      str = str.append(five.getText());
      disp.setText(str);
      break;
    case R.id.Button01:
      if (op2 != 0) {
        op2 = 0;
        disp.setText("");
      }
      str = str.append(six.getText());
      disp.setText(str);
      break;
    case R.id.button1:

      if (op2 != 0) {
        op2 = 0;
        disp.setText("");
      }
      str = str.append(seven.getText());
      disp.setText(str);
      break;
    case R.id.Button06:
      if (op2 != 0) {
        op2 = 0;
        disp.setText("");
      }
      str = str.append(eight.getText());
      disp.setText(str);
      break;
    case R.id.Button05:
      if (op2 != 0) {
        op2 = 0;
        disp.setText("");
      }
      str = str.append(nine.getText());
      disp.setText(str);
      break;
    case R.id.Button11:
      if (op2 != 0) {
        op2 = 0;
        disp.setText("");
      }
      str = str.append(zero.getText());
      disp.setText(str);
      break;
    case R.id.editText1:
      op1 = 0;
      op2 = 0;
      disp.setText("");
      break;
    case R.id.Button09:
      optr = "+";
      if (op1 == 0) {
        op1 = Integer.parseInt(disp.getText().toString());
        disp.setText("");
      } else if (op2 != 0) {
        op2 = 0;
        disp.setText("");
      } else {
        op2 = Integer.parseInt(disp.getText().toString());
        disp.setText("");
        op1 = op1 + op2;
        disp.setText("Result : " + Integer.toString(op1));
      }
      break;
    case R.id.Button13:
      optr = "-";
      if (op1 == 0) {
        op1 = Integer.parseInt(disp.getText().toString());
        disp.setText("");
        
      } else if (op2 != 0) {
        op2 = 0;
        disp.setText("");
      } else {
        op2 = Integer.parseInt(disp.getText().toString());
        disp.setText("");
        op1 = op1 - op2;
        disp.setText("Result : " + Integer.toString(op1));
      }
      break;
    case R.id.Button07:
      optr = "*";
      if (op1 == 0) {
        op1 = Integer.parseInt(disp.getText().toString());
        disp.setText("");
      } else if (op2 != 0) {
        op2 = 0;
        disp.setText("");
      } else {
        op2 = Integer.parseInt(disp.getText().toString());
        disp.setText("");
        op1 = op1 * op2;
        disp.setText("Result : " + Integer.toString(op1));
      }
      break;
    case R.id.Button04:
      optr = "/";
      if (op1 == 0) {
        op1 = Integer.parseInt(disp.getText().toString());
        disp.setText("");
      } else if (op2 != 0) {
        op2 = 0;
        disp.setText("");
      } else {
        op2 = Integer.parseInt(disp.getText().toString());
        disp.setText("");
        op1 = op1 / op2;
        disp.setText("Result : " + Integer.toString(op1));
      }
      break;
    case R.id.Button10:
      if (!optr.equals(null)) {
        if (op2 != 0) {
          if (optr.equals("+")) {
            disp.setText(""); /* op1 = op1 + op2; */
            disp.setText(Integer.toString(op1));
        } else if (optr.equals("-")) {
          disp.setText(""); /* op1 = op1 - op2; */
          disp.setText(Integer.toString(op1));
      } else if (optr.equals("*")) {
        disp.setText(""); /* op1 = op1 * op2; */
        disp.setText(Integer.toString(op1));
    } else if (optr.equals("/")) {
      disp.setText(""); /* op1 = op1 / op2; */
      disp.setText(Integer.toString(op1));
  }
} else {
  
  operation();
}
}
break;
}
}
}
