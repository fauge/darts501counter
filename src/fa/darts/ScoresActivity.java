package fa.darts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

import fa.darts.R;

import fa.darts.data.DartsData;
import fa.darts.data.Player;

public class ScoresActivity extends Activity {
	
	public final static String CURRENT_PLAYER = "fa.darts.MESSAGE";
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_scores);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_scores, menu);
		return true;
	}

	@Override
	public void onStart() {
		super.onStart();

		TextView player1Name = (TextView) findViewById(R.id.player1Name);
		TextView player2Name = (TextView) findViewById(R.id.player2Name);
		TextView player3Name = (TextView) findViewById(R.id.player3Name);
		TextView player4Name = (TextView) findViewById(R.id.player4Name);

		TextView player1Score = (TextView) findViewById(R.id.player1Score);
		TextView player2Score = (TextView) findViewById(R.id.player2Score);
		TextView player3Score = (TextView) findViewById(R.id.player3Score);
		TextView player4Score = (TextView) findViewById(R.id.player4Score);

		Player player1 = DartsData.getPlayer(0);
		Player player2 = DartsData.getPlayer(1);
		Player player3 = DartsData.getPlayer(2);
		Player player4 = DartsData.getPlayer(3);

		player1Name.setText(player1.getName());
		player1Score.setText(Integer.valueOf(player1.getScore()).toString());
		player2Name.setText(player2.getName());
		player2Score.setText(Integer.valueOf(player2.getScore()).toString());
		player3Name.setText(player3.getName());
		player3Score.setText(Integer.valueOf(player3.getScore()).toString());
		player4Name.setText(player4.getName());
		player4Score.setText(Integer.valueOf(player4.getScore()).toString());

	}

	public void enterPlayer1Results(View view) {
		Intent intent = new Intent(this, ResultsActivity.class);
		intent.putExtra(CURRENT_PLAYER, 1);
		startActivity(intent);
	}

	public void enterPlayer2Results(View view) {
		Intent intent = new Intent(this, ResultsActivity.class);
		intent.putExtra(CURRENT_PLAYER, 2);
		startActivity(intent);
	}

	public void enterPlayer3Results(View view) {
		Intent intent = new Intent(this, ResultsActivity.class);
		intent.putExtra(CURRENT_PLAYER, 3);
		startActivity(intent);
	}

	public void enterPlayer4Results(View view) {
		Intent intent = new Intent(this, ResultsActivity.class);
		intent.putExtra(CURRENT_PLAYER, 4);
		startActivity(intent);
	}

	public void restart(View view) {
		Intent intent = new Intent(this, EnterPlayersActivity.class);
		startActivity(intent);
	}
	
}
