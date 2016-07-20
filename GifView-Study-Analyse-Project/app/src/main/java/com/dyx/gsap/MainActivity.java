package com.dyx.gsap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.ant.liao.GifView;

import butterknife.Bind;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Bind(R.id.gv_test)
    GifView gvTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initGifView();
    }

    private void initGifView() {
        gvTest.setGifImage(R.mipmap.mygif1);
        gvTest.setOnClickListener(this);
        gvTest.setShowDimension(1400, 840);
        gvTest.setGifImageType(GifView.GifImageType.COVER);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "点啥子嘛！", Toast.LENGTH_SHORT).show();
    }
}
