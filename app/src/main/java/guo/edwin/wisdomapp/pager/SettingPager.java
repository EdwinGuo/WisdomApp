package guo.edwin.wisdomapp.pager;

import android.app.Activity;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import guo.edwin.wisdomapp.R;

/**
 * Created by EdwinGuo on 2016-12-20.
 */
public class SettingPager extends BasePager {
    public SettingPager(Activity activity) {
        super(activity);
    }

    public void updateContents() {
        System.out.println("LOADING SETTING PAGER.....");
        basePageib.setVisibility(View.INVISIBLE);
        FrameLayout fl = (FrameLayout) super.rootView.findViewById(R.id.base_pager_fl);
        TextView view = new TextView(super.mActivity);
        view.setText("SETTINGS");
        view.setTextSize(25);
        view.setGravity(Gravity.CENTER);
        view.setTextColor(mActivity.getResources().getColor(R.color.colorAccent));
        fl.addView(view);
    }

    @Override
    public void initView() {
        super.initView();
        updateContents();
    }

}
