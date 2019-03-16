package grdp.ganeshinc.maitringo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.AdapterViewFlipper;

public class Home1 extends AppCompatActivity {

    int[] fruitImages = {R.drawable.flif22, R.drawable.flif1, R.drawable.flif3, R.drawable.flif44, R.drawable.flif5};     // array of images
    String fruitNames[] = {"0oooo", "o0ooo", "oo0oo", "ooo0o", "oooo0"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home1);




            AdapterViewFlipper simpleAdapterViewFlipper = (AdapterViewFlipper) findViewById(R.id.simpleAdapterViewFlipper);
            // Custom Adapter for setting the data in Views
            CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), fruitNames, fruitImages);
            simpleAdapterViewFlipper.setAdapter(customAdapter); // set adapter for AdapterViewFlipper
            // set interval time for flipping between views
            simpleAdapterViewFlipper.setFlipInterval(3000);
            // set auto start for flipping between views
            simpleAdapterViewFlipper.setAutoStart(true);





        }
    }