package myapplication.sairamkrishna.example.com.myapp;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dispatchTakePictureIntent();//+
    }
    static final int REQUEST_IMAGE_CAPTURE = 1;

    private void dispatchTakePictureIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);//the intention of taking the image
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {//+
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);//+
        }
    }
}
