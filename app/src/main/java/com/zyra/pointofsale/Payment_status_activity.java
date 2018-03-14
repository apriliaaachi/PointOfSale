package com.zyra.pointofsale;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Zyra on 14/02/2018.
 */

public class Payment_status_activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment_status_activity);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.hide();



        TextView txt1 = (TextView) findViewById(R.id.success);
        txt1.setText("Successful!");

        ImageView img = (ImageView) findViewById(R.id.image);
        img.setImageResource(R.drawable.done);

        TextView txt2 = (TextView) findViewById(R.id.payable);
        txt2.setText("Payable");

        TextView txt3 = (TextView) findViewById(R.id.charges);
        txt3.setText("Rp 900.000");
        Button btn = (Button) findViewById(R.id.Done);
        btn.setText("DONE");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(Payment_status_activity.this, RecordTransactionActivity.class);
                startActivity(mIntent);
            }
        });
    }
}
