package guo.edwin.wisdomapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;

public class MainActivity extends SlidingFragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setBehindContentView(R.layout.left_menu);

        SlidingMenu slidmenu = getSlidingMenu();
        slidmenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        slidmenu.setBehindOffset(850);

    }
}
