package com.example.clipdrawableex;

import java.math.BigDecimal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

import com.example.clipdrawableex.Percent;
import com.example.clipdrawableex.R;

public class VerticalProgressBar extends ImageView {

    /**
     * @see <a href="http://developer.android.com/reference/android/graphics/drawable/ClipDrawable.html">ClipDrawable</a>
     */
    private static final BigDecimal MAX = BigDecimal.valueOf(10000);

    public VerticalProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setImageResource(R.drawable.progress_vbar);
    }

    public void setCurrentValue(Percent percent){
        int cliDrawableImageLevel = percent.asBigDecimal().multiply(MAX).intValue();
        setImageLevel(cliDrawableImageLevel);
    }
}
