package com.doubleencore.transitionsample;

import android.app.Fragment;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by casey on 11/6/13.
 */
public class EasyFragment extends Fragment {
    int mCounter = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final LinearLayout view = (LinearLayout)inflater.inflate(R.layout.activity_easy, container, false);


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

        return view;
    }
}