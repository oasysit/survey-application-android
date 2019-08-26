package np.com.sushantpaudel.surveyapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Switch;

import static np.com.sushantpaudel.surveyapplication.util.UtilClass.showToast;
import static np.com.sushantpaudel.surveyapplication.util.ValueClass.LANGUAGE_TOGGLE;
import static np.com.sushantpaudel.surveyapplication.util.ValueClass.SHARED_PREFS;

public class SettingsActivity extends AppCompatActivity {
    private Context context = this;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final Switch languageToggle = findViewById(R.id.languageToggle);
        final SharedPreferences preferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        languageToggle.setChecked(preferences.getBoolean(LANGUAGE_TOGGLE, false));
        languageToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = preferences.edit();
                editor.putBoolean(LANGUAGE_TOGGLE, languageToggle.isChecked());
                showToast(context, "Close and open your application to see changes!");
                editor.apply();
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}
