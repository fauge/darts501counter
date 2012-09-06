package fa.darts;

import fa.darts.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	public void enterPlayers(View view) {
		Intent intent = new Intent(this, EnterPlayersActivity.class);
		startActivity(intent);
	}

	public void startGame(View view) {
		Intent intent = new Intent(this, ScoresActivity.class);
		startActivity(intent);
	}

}
