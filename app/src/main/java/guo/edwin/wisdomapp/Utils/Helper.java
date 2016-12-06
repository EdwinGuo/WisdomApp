package guo.edwin.wisdomapp.Utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by EdwinGuo on 2016-12-06.
 */
public class Helper {
    public static String WISDOM_APP_CONF = "WISDOM_CONF";

    public static boolean jumpToGuide(Context ct){
        SharedPreferences sp = ct.getSharedPreferences(WISDOM_APP_CONF, Context.MODE_PRIVATE);
        return sp.getBoolean("showed_guide", false);
    }

    public static void updatePreference(Context ct) {
        SharedPreferences.Editor spe = ct.getSharedPreferences(WISDOM_APP_CONF, Context.MODE_PRIVATE).edit();
        spe.putBoolean("showed_guide", true);
        spe.commit();
    }
}
