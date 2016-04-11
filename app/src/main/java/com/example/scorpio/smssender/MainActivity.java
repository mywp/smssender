package com.example.scorpio.smssender;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.view.Menu;;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener {
    private EditText etNumber;
    private EditText etContent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
         etNumber=(EditText)findViewById(R.id.et_number);
         etContent=(EditText)findViewById(R.id.et_content);

        Button button=(Button) findViewById(R.id.btn_send);
        button.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        //号码
        String number=etNumber.getText().toString();
        //内容
        String content =etContent.getText().toString();
        SmsManager smsManager=SmsManager.getDefault();
        smsManager.sendTextMessage(
                number,//收件人
                null,//短信中心号码
                content,//内容
                null,
                null);
    }
}
