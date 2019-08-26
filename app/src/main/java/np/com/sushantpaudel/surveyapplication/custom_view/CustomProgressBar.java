package np.com.sushantpaudel.surveyapplication.custom_view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.v4.content.res.ResourcesCompat;
import android.util.AttributeSet;
import android.view.View;

import np.com.sushantpaudel.surveyapplication.R;

public class CustomProgressBar extends View {

    private RectF rectF = new RectF();
    private float strokeWidth = 100f;
    private Paint backgroundPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private Paint completedPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private Paint remainingPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private float completedValue = 0;
    private float remainingValue = 0;

    public CustomProgressBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        backgroundPaint.setColor(ResourcesCompat.getColor(context.getResources(), R.color.backgroundColor, null));
        backgroundPaint.setStyle(Paint.Style.STROKE);
        backgroundPaint.setStrokeWidth(strokeWidth);
        completedPaint.setColor(ResourcesCompat.getColor(context.getResources(), R.color.completedColor, null));
        completedPaint.setStyle(Paint.Style.STROKE);
        completedPaint.setStrokeWidth(strokeWidth);
        remainingPaint.setColor(ResourcesCompat.getColor(context.getResources(), R.color.remainingColor, null));
        remainingPaint.setStyle(Paint.Style.STROKE);
        remainingPaint.setStrokeWidth(strokeWidth);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float max;
        float min;
        if (canvas != null) {
            if (getHeight() >= getWidth()) {
                max = getHeight();
                min = getWidth();
                rectF.set(strokeWidth / 2, strokeWidth / 2 + max / 2 - min / 2, min - strokeWidth / 2, min - strokeWidth / 2 + max / 2 - min / 2);
            } else {
                max = getWidth();
                min = getHeight();
                rectF.set(strokeWidth / 2 + max / 2 - min / 2, strokeWidth / 2, min - strokeWidth / 2 - max / 2 - min / 2, min - strokeWidth / 2);
            }
            float remaining = remainingValue * 360;
            float completed = completedValue * 360;
            canvas.drawOval(rectF, backgroundPaint);
            canvas.drawArc(rectF, -90f, completed, false, completedPaint);
            canvas.drawArc(rectF, -90f + completed, remaining, false, remainingPaint);
        }
    }

    public void setRemainingValue(float remainingValue) {
        this.remainingValue = remainingValue;
    }

    public void setCompletedValue(float completedValue) {
        this.completedValue = completedValue;
    }
}
