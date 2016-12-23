package guo.edwin.wisdomapp.pager;

import android.app.Activity;
import android.view.View;
import android.widget.ImageButton;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

import guo.edwin.wisdomapp.MainActivity;
import guo.edwin.wisdomapp.R;

/**
 * Created by EdwinGuo on 2016-12-19.
 */
public class BasePager {
    public Activity mActivity;
    public View rootView;
    public ImageButton basePageib;

    public BasePager(Activity activity){
        this.mActivity = activity;
        initView();
    }

    public void initView(){
        rootView = View.inflate(mActivity, R.layout.base_pager, null);
        basePageib = (ImageButton) rootView.findViewById(R.id.BP_Image_Button);
    }

    public void initData(){

    }

}
