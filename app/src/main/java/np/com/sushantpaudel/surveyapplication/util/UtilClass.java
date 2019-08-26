package np.com.sushantpaudel.surveyapplication.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Base64;
import android.widget.Toast;

import java.util.Locale;

import static android.content.Context.MODE_PRIVATE;
import static np.com.sushantpaudel.surveyapplication.util.ValueClass.LANGUAGE_TOGGLE;
import static np.com.sushantpaudel.surveyapplication.util.ValueClass.SHARED_PREFS;

/**
 * Created by susha on 6/2/2018.
 */

public class UtilClass {

    public static String getHash(String data) {
        return Base64.encodeToString(data.getBytes(), Base64.DEFAULT);
    }

    public static boolean checkInternetConnection(Context context) {
        ConnectivityManager conMgr = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = null;
        if (conMgr != null) {
            netInfo = conMgr.getActiveNetworkInfo();
        }
        return netInfo != null;
    }

    public static void showToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public static void setLocale(Context context) {
        final SharedPreferences preferences = context.getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        boolean isNepali = preferences.getBoolean(LANGUAGE_TOGGLE, false);
        String languageToLoad;
        if (isNepali) {
            languageToLoad = "ne"; // your language
        } else {
            languageToLoad = "en";
        }
        Locale locale = new Locale(languageToLoad);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        context.getResources().updateConfiguration(config,
                context.getResources().getDisplayMetrics());
    }

}
