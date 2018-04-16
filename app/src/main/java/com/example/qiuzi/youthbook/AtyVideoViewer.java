package com.example.qiuzi.youthbook;

import android.app.Activity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;


public class AtyVideoViewer extends Activity {

    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        vv = new VideoView(this);
        vv.setMediaController( new MediaController( this ) );
        setContentView(vv);

        String path = getIntent().getStringExtra(EXTRA_PATH);
        if (path!=null){
            vv.setVideoPath(path);
        }else{
            finish();
        }
    }
    private VideoView vv;
    public static final String EXTRA_PATH = "path";
}
