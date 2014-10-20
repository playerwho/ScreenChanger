package ctec.screenchanger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends Activity
{
	private Button secondScreenButton;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second1);
		
		secondScreenButton = (Button) findViewById(R.id.secondScreenButton);
		
		setupListeners();
	}
	
	private void setupListeners()
	{
		secondScreenButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View currentView)
			{
				Intent currentIntent = new Intent();
				setResult(RESULT_OK, currentIntent);
				finish();			
			}
		});
	}
}
