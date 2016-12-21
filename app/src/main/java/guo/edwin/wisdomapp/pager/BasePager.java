package guo.edwin.wisdomapp.pager;

import android.app.Activity;
import android.view.View;

import guo.edwin.wisdomapp.R;

/**
 * Created by EdwinGuo on 2016-12-19.
 */
public class BasePager {
    public Activity mActivity;
    public View rootView;

    public BasePager(Activity activity){
        this.mActivity = activity;
        initView();
    }

    public void initView(){
        rootView = View.inflate(mActivity, R.layout.base_pager, null);
    }

    public void initData(){

    }

}
