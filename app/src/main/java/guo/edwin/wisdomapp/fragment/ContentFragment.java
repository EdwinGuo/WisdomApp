package guo.edwin.wisdomapp.fragment;

import android.view.View;

import guo.edwin.wisdomapp.R;

/**
 * Created by EdwinGuo on 2016-12-09.
 */
public class ContentFragment extends BaseFragment {
    @Override
    public View initView() {
        View view = View.inflate(mainActivity, R.layout.fragment_content, null);
        return view;    }
}
