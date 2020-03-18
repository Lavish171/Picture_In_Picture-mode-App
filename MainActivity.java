package com.example.elavi.picture_in_picture;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void Gopip(View view)
    {
        enterPictureInPictureMode();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Button gopip=findViewById(R.id.gopip);
    }

    @Override
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, Configuration newConfig) {
        super.onPictureInPictureModeChanged(isInPictureInPictureMode, newConfig);
        TextView textView=findViewById(R.id.textview);
        Button button=findViewById(R.id.gopip);
        if(isInPictureInPictureMode)
        {
            button.setVisibility(View.INVISIBLE);
            getSupportActionBar().hide();
            textView.setText("Gone into the pip mode");
        }else
        {
            button.setVisibility(View.VISIBLE);
            getSupportActionBar().show();
            textView.setText("Out of the pip mode");
        }
    }
}
