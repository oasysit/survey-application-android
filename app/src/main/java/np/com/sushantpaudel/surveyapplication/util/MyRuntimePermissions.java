package np.com.sushantpaudel.surveyapplication.util;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;

/**
 * Created by sushant on 2/25/2018 at 10:12 PM.
 */

public class MyRuntimePermissions {

    private Context context;

    public MyRuntimePermissions(Context context) {
        this.context = context;
    }

    public boolean callPhonePermission(int requestCode) {
        if (ContextCompat.checkSelfPermission(context,
                Manifest.permission.CALL_PHONE)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions((Activity) context,
                    new String[]{(Manifest.permission.CALL_PHONE)},
                    requestCode);
            return false;
        } else {
            return true;
        }
    }

    public boolean storagePermission(int requestCode) {
        if (ContextCompat.checkSelfPermission(context,
                Manifest.permission.WRITE_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions((Activity) context,
                    new String[]{(Manifest.permission.WRITE_EXTERNAL_STORAGE)},
                    requestCode);
            return false;
        } else {
            return true;
        }
    }

    public boolean locationPermission(int requestCode) {
        if (ContextCompat.checkSelfPermission(context,
                Manifest.permission.ACCESS_COARSE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions((Activity) context,
                    new String[]{(Manifest.permission.ACCESS_COARSE_LOCATION)},
                    requestCode);
            return false;
        } else {
            return true;
        }

    }

}
