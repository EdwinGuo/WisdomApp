package guo.edwin.wisdomapp.fragment;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

import java.util.ArrayList;

import guo.edwin.wisdomapp.MainActivity;
import guo.edwin.wisdomapp.R;
import guo.edwin.wisdomapp.pager.BasePager;
import guo.edwin.wisdomapp.pager.HomePager;
import guo.edwin.wisdomapp.pager.NewsPager;
import guo.edwin.wisdomapp.pager.ServicePager;
import guo.edwin.wisdomapp.pager.SettingPager;

/**
 * Created by EdwinGuo on 2016-12-09.
 */
public class ContentFragment extends BaseFragment {

    ArrayList<BasePager> pagers = new ArrayList<BasePager>();

    RadioGroup home_btn;
    ViewPager cf_vp;

    @Override
    public View initView() {
        View view = View.inflate(mainActivity, R.layout.fragment_content, null);
        home_btn = (RadioGroup) view.findViewById(R.id.rg_btm);
        cf_vp = (ViewPager) view.findViewById(R.id.cf_vp);
        return view;
    }

    @Override
    public void initData() {
        home_btn.check(R.id.rb_home);
        pagers.add(new HomePager(mainActivity));
        pagers.add(new NewsPager(mainActivity));
        pagers.add(new ServicePager(mainActivity));
        pagers.add(new SettingPager(mainActivity));

        cf_vp.setAdapter(new ContentPager());
        home_btn.setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        MainActivity ac = (MainActivity) mainActivity;
                        switch (checkedId) {
                            case R.id.rb_home:
                                cf_vp.setCurrentItem(0, false);
                                ac.getSlidingMenu().setTouchModeAbove(SlidingMenu.TOUCHMODE_NONE);
                                break;
                            case R.id.rb_news:
                                cf_vp.setCurrentItem(1, false);
                                ac.getSlidingMenu().setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
                                break;
                            case R.id.rb_service:
                                cf_vp.setCurrentItem(2, false);
                                ac.getSlidingMenu().setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
                                break;
                            case R.id.rb_setting:
                                cf_vp.setCurrentItem(3, false);
                                ac.getSlidingMenu().setTouchModeAbove(SlidingMenu.TOUCHMODE_NONE);
                                break;
                        }
                    }
                }
        );
    }

    class ContentPager extends PagerAdapter {

        @Override
        public int getCount() {
            return pagers.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            container.addView(pagers.get(position).rootView);
            return pagers.get(position).rootView;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }
    }

}
