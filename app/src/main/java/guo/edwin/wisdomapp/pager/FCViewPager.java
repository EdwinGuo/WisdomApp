package guo.edwin.wisdomapp.pager;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by EdwinGuo on 2016-12-23.
 */
public class FCViewPager extends ViewPager {
    public FCViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FCViewPager(Context context) {
        super(context);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        return false;
    }
}
