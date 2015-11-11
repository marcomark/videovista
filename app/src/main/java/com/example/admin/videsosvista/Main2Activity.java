package com.example.admin.videsosvista;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class Main2Activity extends AppCompatActivity {
    private VideoView mVideoView;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mVideoView =(VideoView)findViewById(R.id.surface_view);
        //de forma alternativa si queremos un streaming usar
        //mVideoView.setVideoURI(Uri.parse("https://www.youtube.com/watch?v=Wt2HmGZlWow"));

        //almacenar los videos  en una ruta especifica del telefono
        //un ejemplo es el siguiente del setVideoPatch
        //tienes que poner la direccion igual y el nombre del archivo si no funciona
        mVideoView.setVideoPath("/storage/emulated/0/Download/remy.mp4");
        mVideoView.setMediaController(new MediaController(this));
        mVideoView.start();
        mVideoView.requestFocus();


        tv1=(TextView)findViewById(R.id.textView12);
        // vas a concatenar getIntent().getStringExtra("url") en el string del setVideoPatch
        tv1.setText(getIntent().getStringExtra("url"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
