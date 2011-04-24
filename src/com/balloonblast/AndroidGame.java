package com.balloonblast;

/*import android.app.Activity;
import android.os.Bundle;

public class AndroidGame extends Activity {
    *//** Called when the activity is first created. *//*
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}*/


import com.badlogic.gdx.backends.android.AndroidApplication;
import com.dgcgames.balloonblast.Balloonblast;

public class AndroidGame extends AndroidApplication {		//h
        public void onCreate (android.os.Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                initialize(new Balloonblast(), false);
        }
}