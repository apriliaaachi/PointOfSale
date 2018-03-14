package com.zyra.pointofsale;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ListView;

/**
 * Created by Zyra on 28/02/2018.
 */

public class EmployeeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employee_activity);

        ListView lv = (ListView) findViewById(R.id.list_employee);
        Employee_adapter adapter = new Employee_adapter(getApplicationContext(), 123 ,"abc", "abc", "abc" );
        lv.setAdapter(adapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_employee, menu);

        return true;
    }
}
