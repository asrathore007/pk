package aavartan.pocketkharch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {

    //private TextView textView;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //textView=(TextView) findViewById(R.id.textView);
        imageView=(ImageView) findViewById(R.id.imageView);
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.animation_page);
        imageView.startAnimation(animation);
        //Typeface mycustomefont=Typeface.createFromAsset(getAssets(),"font/segoepr.ttf");
        //textView.setTypeface(mycustomefont);
        final Intent intent=new Intent(this,Splash.class);
        Thread timer =new Thread(){
            public void run(){
                try {
                    sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    startActivity(intent);
                    finish();
                }
            }
        };
        timer.start();
    }
}
