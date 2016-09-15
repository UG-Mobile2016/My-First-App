package me.juancrg90.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnSend;
    EditText message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSend = (Button)findViewById(R.id.buttonSend);
        message = (EditText) findViewById(R.id.editText);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendMessage(view);
            }
        });


    }

    public void sendMessage(View view) {

        Log.v("ESCRIBI:", message.getText().toString());

    }


}
