package comswatisingh0960.httpsgithub.restaurantmap.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import comswatisingh0960.httpsgithub.restaurantmap.R;



/**
 * Created by Swati on 11/26/2016.
 */

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View view) {
        Intent intent = new Intent(MainActivity.this, StartActivity.class);
        startActivity(intent);

    }
}
