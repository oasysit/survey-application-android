package np.com.sushantpaudel.surveyapplication.active_android;

import com.activeandroid.ActiveAndroid;

public class Application extends com.activeandroid.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ActiveAndroid.initialize(this);
    }
}
