package com.zyra.pointofsale;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ListView;

/**
 * Created by Zyra on 06/03/2018.
 */

public class RecordTransactionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.record_transaction_activity);

        ListView mLv = (ListView) findViewById(R.id.mLV);
        RecordTransaction_adapter adapter = new RecordTransaction_adapter(getApplicationContext());
        mLv.setAdapter(adapter);

        ListView nLv = (ListView) findViewById(R.id.nLV);
        RecordTransaction_adapter adapter2 = new RecordTransaction_adapter(getApplicationContext());
        nLv.setAdapter(adapter2);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mn = new MenuInflater(getApplicationContext());
        mn.inflate(R.menu.menu_record, menu);

        return true;
    }
}
