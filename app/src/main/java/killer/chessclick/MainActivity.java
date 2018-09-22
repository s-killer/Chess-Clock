package killer.chessclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public abstract class MainActivity extends AppCompatActivity {

    ToggleButton playerOneClock, playerTwoClock;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerOneClock = findViewById(R.id.playerOneButton);
        playerTwoClock = findViewById(R.id.playerTwoButton);

        playerOneClock.setChecked(false);
        playerTwoClock.setChecked(false);

        playerOneClock.setOnCheckedChangeListener(changeChecker);
        playerTwoClock.setOnCheckedChangeListener(changeChecker);

    }


    CompoundButton.OnCheckedChangeListener changeChecker = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if (isChecked) {
                if (buttonView == playerOneClock) {
                    playerTwoClock.setChecked(false);

                }
                if (buttonView == playerTwoClock) {
                    playerOneClock.setChecked(false);

                }

            }
        }
    };

}
