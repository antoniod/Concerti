package it.lfteam.concerti;

import android.app.Activity;
import android.os.Bundle;

public class ConcertiActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void a(){
    	System.out.println("Questo � il mio metodo amichetto!");
    }
}