package com.example.androidprogramming.MyMessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.androidprogramming.R;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);

        EditText messageView = (EditText) findViewById(R.id.message);
        Button send = (Button) findViewById(R.id.send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String messageText = messageView.getText().toString();

                // Intent intent = new Intent(CreateMessageActivity.this, ReceiveMessageActivity.class);
                // intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, messageText);
                // startActivity(intent);

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, messageText);

                String chooserTitle = getString(R.string.chooser);
                Intent chosenIntent = Intent.createChooser(intent, chooserTitle);

                startActivity(chosenIntent);
            }
        });
    }
}