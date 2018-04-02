package com.example.bivin.simpleoptionmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.optinmenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.item1){
            Toast.makeText(getApplicationContext(),"Clicked on Item1",Toast.LENGTH_LONG).show();
        }
        if(id==R.id.item2){
            Toast.makeText(getApplicationContext(),"Clicked on Item2",Toast.LENGTH_LONG).show();
        }
        if(id==R.id.item2){
            Toast.makeText(getApplicationContext(),"Clicked on Item3",Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }

}
