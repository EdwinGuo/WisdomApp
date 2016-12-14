package guo.edwin.wisdomapp;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;

import guo.edwin.wisdomapp.fragment.ContentFragment;
import guo.edwin.wisdomapp.fragment.LeftMenuFragment;

public class MainActivity extends SlidingFragmentActivity {
    public static String LEFT_MENU_MAIN_FRAGMENT = "LEFT_FRAGMENT_MENU";
    public static String FRAGMENT_CONETNT = "FRAGMENT_CONETNT";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setBehindContentView(R.layout.left_menu);

        SlidingMenu slidmenu = getSlidingMenu();
        slidmenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        slidmenu.setBehindOffset(850);

        initFragment();
    }

    private void initFragment() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.fl_left_menu_main, new LeftMenuFragment(), LEFT_MENU_MAIN_FRAGMENT);
        transaction.replace(R.id.fl_main, new ContentFragment(), FRAGMENT_CONETNT);

        transaction.commit();
    }
}
