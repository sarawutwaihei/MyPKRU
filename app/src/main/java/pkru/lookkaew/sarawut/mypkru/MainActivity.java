package pkru.lookkaew.sarawut.mypkru;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Explicit การประกาศตัวแปล ประกอบด้วย 3 อย่าง 1. Access 2. Type ชนิดของตัวแปล 3. Name
    private EditText userEditText, passwordEditText;
    private TextView textView;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initial View การเชื่อมต่อใน .xml
        initialView();

        //Controller
        Controller();


    }  // Main Method

    private void Controller() {
        textView.setOnClickListener(this);
        button.setOnClickListener(this);

    }

    private void initialView() {
        userEditText = (EditText) findViewById(R.id.edtUser);
        passwordEditText = (EditText) findViewById(R.id.edtPassword);
        textView = (TextView) findViewById(R.id.txtNewRegister);
        button = (Button) findViewById(R.id.btnLogin);

    }

    @Override
    public void onClick(View v) {

        //For TextView
        if (v == textView) {
            //Intent NewRegister
            Intent intent = new Intent(MainActivity.this, NewRegisterActivity.class);
            startActivity(intent);
        }

        //For button
        if (v == button) {
        }


    }
}   // Main class คลาสหลัก
