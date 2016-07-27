package com.example.fragmentbutton;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivityTAG_";
    private Button mButton;
    private FrameLayout mFrameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* mButton = (Button) findViewById(R.id.a_main_button);
        mFrameLayout = (FrameLayout) findViewById(R.id.a_main_frame);
*/
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager
                .beginTransaction()
                .add(R.id.a_main_frame, new BlankFragment())
                .commit();
        fragmentManager
                .beginTransaction()
                .add(R.id.a_main_frame1, new BlankFragment())
                .commit();
        fragmentManager
                .beginTransaction()
                .add(R.id.a_main_frame2, new BlankFragment())
                .commit();

    }
}
