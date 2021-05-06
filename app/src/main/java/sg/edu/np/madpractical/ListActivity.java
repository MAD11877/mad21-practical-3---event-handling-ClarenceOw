package sg.edu.np.madpractical;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class ListActivity extends AppCompatActivity {
    private final static String TAG = "Main ListActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ImageView IMAGE = findViewById(R.id.Logo);
        IMAGE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                POPOUT();
            }
        });
    }
    private int randomOTP(){
        Random ran = new Random();
        int value = ran.nextInt(1000000000);
        Log.v("RNG", String.valueOf(value));
        return value;
    }
    private void POPOUT(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Profile");
        builder.setMessage("MADness");
        builder.setCancelable(false);
        builder.setPositiveButton("View", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(ListActivity.this, MainActivity.class);
                intent.putExtra("Name", randomOTP());
                startActivity(intent);
            }
        });
        builder.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}