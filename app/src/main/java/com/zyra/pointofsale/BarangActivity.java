package com.zyra.pointofsale;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Zyra on 15/02/2018.
 */

public class BarangActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.barang_activity);





        ListView lv = (ListView) findViewById(R.id.list_view_barang);

        List_adapter2 adapter = new List_adapter2(getApplicationContext(), R.drawable.bread ,"2","Bakery B", "Rp 100.000", "Rp 500.000");


        lv.setAdapter(adapter);

        Button btn = (Button) findViewById(R.id.cash_button);

        TextView txtSubtotal = (TextView) findViewById(R.id.Subtotal);
        TextView txtSubtotalvalue = (TextView) findViewById(R.id.Subtotal_value);
        txtSubtotalvalue.setText("Rp 900.000");

        TextView Total = (TextView) findViewById(R.id.Total);
        TextView Totalvalue = (TextView) findViewById(R.id.Total_value);
        Totalvalue.setText("Rp 900.000");

        EditText editSubtotal = (EditText) findViewById(R.id.etDiscount);
        ImageButton mImageBtn = (ImageButton) findViewById(R.id.addDiscount);

        Button mPayCashButton = (Button) findViewById(R.id.cash_button);
        Button mPayCardButton = (Button) findViewById(R.id.card);

        mPayCashButton.setText("Pay Cash");
        mPayCardButton.setText("Pay Card");

        mPayCardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(getApplicationContext(), Payment_status_activity.class);
                startActivity(mIntent);
            }
        });



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(BarangActivity.this, Payment_status_activity.class);
                startActivity(mIntent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_barang, menu);

        return true;


    }
}
