package guo.edwin.wisdomapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;

import java.util.ArrayList;


/**
 * Created by EdwinGuo on 2016-12-01.
 */
public class GuideActivity extends Activity {

    // viewPager hold the guide images
    ViewPager guideVP;

    // image array list to hold all the guide images
    int[] guideImages = new int[]{R.drawable.guide_image_1, R.drawable.guide_image_2,
            R.drawable.guide_image_3};

    // image view to hold to image
    ArrayList<ImageView> guideImgViews = new ArrayList<ImageView>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.acitivity_guide);
        guideVP = (ViewPager) findViewById(R.id.guide_vp);
        initView();
        guideVP.setAdapter(new GuidePager());

    }

    public void initView(){
        for(int i=0; i<guideImages.length; i++){
            ImageView guideV = new ImageView(this);
            guideV.setImageResource(guideImages[i]);
            guideImgViews.add(guideV);
        }

    }


    public class GuidePager extends PagerAdapter{

        @Override
        public int getCount() {
            return guideImgViews.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int  position){
            container.addView(guideImgViews.get(position));
            return guideImgViews.get(position);
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }
    }

}
