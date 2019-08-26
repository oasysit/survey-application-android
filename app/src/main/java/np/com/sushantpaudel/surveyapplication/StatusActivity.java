package np.com.sushantpaudel.surveyapplication;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import np.com.sushantpaudel.surveyapplication.active_android.DataModel;
import np.com.sushantpaudel.surveyapplication.custom_view.CustomProgressBar;
import np.com.sushantpaudel.surveyapplication.util.ValueClass;

public class StatusActivity extends AppCompatActivity {

    private float completed;
    private float remaining;
    private float completedData;
    private float remainingData;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_status);
        setValues();
        showProgressBar();
        loadTextView();
    }

    private void loadTextView() {
        int total = (int) (remainingData + completedData);
        System.err.println("Total: " + total);
        TextView textView = findViewById(R.id.textViewStatus);
        String string = ("Total Entered: " + total) +
                "\n" +
                "Synced Data: " + (int) completedData +
                "\n" +
                "Remaining Data: " + (int) remainingData;
        textView.setText(string);
    }

    private void showProgressBar() {
        final CustomProgressBar customProgressBar = findViewById(R.id.customProgressBar);
        ValueAnimator valueAnimatorCompleted = ValueAnimator.ofFloat(0f, completed);
        final ValueAnimator valueAnimatorRemaining = ValueAnimator.ofFloat(0f, remaining);
        valueAnimatorCompleted.setDuration((long) (completed * 3000));
        valueAnimatorRemaining.setDuration((long) (remaining * 3000));
        valueAnimatorCompleted.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fraction = (float) valueAnimator.getAnimatedValue();
                customProgressBar.setCompletedValue(fraction);
                customProgressBar.setRemainingValue(0);
                customProgressBar.invalidate();
                if (fraction == completed) {
                    valueAnimatorRemaining.start();
                }
            }
        });

        valueAnimatorRemaining.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fraction = (float) valueAnimator.getAnimatedValue();
                customProgressBar.setCompletedValue(completed);
                customProgressBar.setRemainingValue(fraction);
                customProgressBar.invalidate();
            }
        });

        valueAnimatorCompleted.start();
    }

    private void setValues() {
        SharedPreferences preferences = getSharedPreferences(ValueClass.SHARED_PREFS, MODE_PRIVATE);
        completedData = preferences.getInt(ValueClass.SYNCED_TO_CLOUD, 0);
        remainingData = DataModel.countData();
        float total = completedData + remainingData;
        if (total == 0) total = 1;
        completed = completedData / total;
        remaining = remainingData / total;
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}
