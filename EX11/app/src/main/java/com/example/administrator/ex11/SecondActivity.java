package com.example.administrator.ex11;

/**
 * Created by Administrator on 2018/4/16 0016.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity  extends Activity {
    @Override
    protected void onCreate(Bundle savedInstateState){
        super.onCreate(savedInstateState);
        setContentView(R.layout.second_layout);
        processExtraData();

        Button bn = (Button)findViewById(R.id.buttonexit);

        bn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                Intent intent = getIntent();
                String name = intent.getStringExtra("Content");
                intent.putExtra("result","页面返回" + name);
                setResult(0,intent);
                finish();
            }
        });

    }
    @Override
    protected void onNewIntent(Intent intent){
        super.onNewIntent(intent);
        setIntent(intent);
        processExtraData();
    }
    private void processExtraData(){
        Intent intent = getIntent();
        String name = intent.getStringExtra("Content");
        Toast.makeText(this,"上个活动传递的数据为"+ name ,Toast.LENGTH_LONG).show();
    }

}