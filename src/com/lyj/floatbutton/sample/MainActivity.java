package com.lyj.floatbutton.sample;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Toast;

import com.lyj.floatbutton.FloatingActionButton;
import com.melnykov.fab.sample.R;


public class MainActivity extends ListActivity implements OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(R.id.button_floating_action);
        floatingActionButton.attachToListView(getListView());
        floatingActionButton.setOnClickListener(this);
        ListAdapter listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.planets));
        getListView().setAdapter(listAdapter);
    }

	@Override
	public void onClick(View v) {
		Toast.makeText(this, getResources().getString(R.string.nimei), 1).show();
	}

	
}