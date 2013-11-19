package com.doubleencore.transitionsample;

import android.app.Activity;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class EasyActivity extends Activity {
    int mCounter = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy);
        final LinearLayout view = (LinearLayout)findViewById(R.id.easy_root);


        final Button button = (Button)view.findViewById(R.id.press_me);
        final ImageView image = (ImageView)view.findViewById(R.id.some_image);
        final TextView textView = (TextView)view.findViewById(R.id.text_view);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TransitionManager.beginDelayedTransition(view);

                switch (mCounter) {
                    case 0:
                        button.setText("Press me again!");
                        textView.setVisibility(View.VISIBLE);
                        break;
                    case 1:
                        button.setText("Wasn't that easy? :)");
                        image.setVisibility(View.VISIBLE);
                        break;
                    case 2:

                }

                mCounter++;
            }
        });

    }

}
