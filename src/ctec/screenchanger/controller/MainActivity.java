package ctec.screenchanger.controller;

import ctec.screenchanger.R;
import ctec.screenchanger.SecondActivity;
import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity
{
	private Button firstScreenButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        firstScreenButton = (Button) findViewById(R.id.firstScreenButton);
        
        setupListeners();
    }
    
    private void setupListeners()
    {
    	firstScreenButton.setOnClickListener(new View.OnClickListener()
    	{
    		@Override
    		public void onClick(View currentView)
    		{
    			Intent myIntent = new Intent(currentView.getContext(), SecondActivity.class);
    			startActivityForResult(myIntent, 0);
    		}
    	});
    }
    
    


    
    
    
}
