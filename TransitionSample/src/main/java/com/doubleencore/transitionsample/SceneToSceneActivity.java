package com.doubleencore.transitionsample;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.transition.ChangeBounds;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SceneToSceneActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Set the layout to the initial scene
        setContentView(R.layout.scene_1);

        //grab the root element from the XML
        RelativeLayout sceneBase = (RelativeLayout)findViewById(R.id.scene_base);

        //Create a scene using the root element from the initial scene, combined with a new layout
        final Scene scene2 = new Scene(sceneBase, (ViewGroup)getLayoutInflater().inflate(R.layout.scene_2, sceneBase, false));

        //When the user clicks the button transition from scene 1 to scene 2 by changing the bounds of the controls
        Button button = (Button)sceneBase.findViewById(R.id.press_me);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.go(scene2);
            }
        });
    }
}
