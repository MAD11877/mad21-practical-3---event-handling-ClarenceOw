package sg.edu.np.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User Number1 = new User("Hello World!", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua", 1, false);
        TextView Desc1 = findViewById(R.id.Description);
        Desc1.setText(Number1.getDescription());

        Button button = findViewById(R.id.follow);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Button Clicked!");
                Button following = findViewById(R.id.follow);
                if (Number1.isFollowed() == false){
                    Number1.setFollowed(true);
                    following.setText("Unfollow");
                    Log.v(TAG, "Following!");
                }
                else{
                    Number1.setFollowed(false);
                    following.setText("Follow");
                    Log.v(TAG, "Unfollowing!");
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG, "App Started!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG, "App Resume!");
    }
    @Override

    protected void onPause(){
        super.onPause();
        Log.v(TAG, "App Paused!");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG, "App Stopped!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "App Destroy!");
    }
}