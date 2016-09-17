package me.juancrg90.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "me.juancrg90.myfirstapp.MESSAGE";
    @Bind(R.id.editText)
    EditText editText;
    @Bind(R.id.buttonSend)
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.buttonSend)
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        String messageToSend = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, messageToSend);
        startActivity(intent);

        Log.v("ESCRIBI:", messageToSend);

    }


}
