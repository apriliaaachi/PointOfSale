package com.zyra.pointofsale;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);



        ListView list_barang_main = (ListView) findViewById(R.id.list_item);

        List_adapter adapter = new List_adapter(getApplicationContext(), R.drawable.bread, "Roti Bakrie", "Keterangan lain", "Rp 100.000");

        list_barang_main.setAdapter(adapter);

        Button btn = (Button) findViewById(R.id.button);

        final Intent mIntent = new Intent(MainActivity.this, BarangActivity.class);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(mIntent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        return super.onOptionsItemSelected(item);
    }
}
