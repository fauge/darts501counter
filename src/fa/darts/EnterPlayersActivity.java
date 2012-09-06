package fa.darts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

import fa.darts.R;

import fa.darts.data.DartsData;
import fa.darts.data.Player;

public class EnterPlayersActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_enter_players);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_enter_players, menu);
		return true;
	}

	@Override
	protected void onStart() {
		super.onStart();
		
		EditText player1Name = (EditText) findViewById(R.id.player1);
		EditText player2Name = (EditText) findViewById(R.id.player2);
		EditText player3Name = (EditText) findViewById(R.id.player3);
		EditText player4Name = (EditText) findViewById(R.id.player4);
		
		if (!DartsData.isEmpty()) {
			Player player1 = DartsData.getPlayer(0);
			Player player2 = DartsData.getPlayer(1);
			Player player3 = DartsData.getPlayer(2);
			Player player4 = DartsData.getPlayer(3);
			
			player1Name.setText(player1.getName());
			player2Name.setText(player2.getName());
			player3Name.setText(player3.getName());
			player4Name.setText(player4.getName());
		}
	}

	public void validatePlayers(View view) {
		EditText player1 = (EditText) findViewById(R.id.player1);
		EditText player2 = (EditText) findViewById(R.id.player2);
		EditText player3 = (EditText) findViewById(R.id.player3);
		EditText player4 = (EditText) findViewById(R.id.player4);

		DartsData.resetPlayers();
		String player1Name = player1.getText().toString();
		DartsData.addPlayer(new Player(player1Name));

		String player2Name = player2.getText().toString();
		DartsData.addPlayer(new Player(player2Name));

		String player3Name = player3.getText().toString();
		DartsData.addPlayer(new Player(player3Name));

		String player4Name = player4.getText().toString();
		DartsData.addPlayer(new Player(player4Name));

		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
	}

}
