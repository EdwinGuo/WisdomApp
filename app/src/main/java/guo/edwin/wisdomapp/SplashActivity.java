package guo.edwin.wisdomapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.RelativeLayout;

public class SplashActivity extends Activity {

    RelativeLayout rl_splash_root;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        rl_splash_root = (RelativeLayout) findViewById(R.id.rl_splash_root);
        startAnim();
    }




    private void startAnim() {

        AnimationSet as = new AnimationSet(false);
        RotateAnimation rotate = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);

        rotate.setDuration(2000);
        rotate.setFillAfter(true);

        ScaleAnimation scale = new ScaleAnimation(0, 1, 0, 1, Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        scale.setDuration(2000);
        scale.setFillAfter(true);

        AlphaAnimation al = new AlphaAnimation(0, 1);

        as.addAnimation(rotate);
        as.addAnimation(scale);
        as.addAnimation(al);

        rl_splash_root.startAnimation(as);

    }
}
