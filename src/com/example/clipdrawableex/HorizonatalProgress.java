package com.example.clipdrawableex;

import java.math.BigDecimal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class HorizonatalProgress extends ImageView {

	 private static final BigDecimal MAX = BigDecimal.valueOf(10000);

	    public HorizonatalProgress(Context context, AttributeSet attributeSet) {
	        super(context, attributeSet);
	        setImageResource(R.drawable.progress_vbar);
	    }

	    public void setCurrentValue(Percent percent){
	        int cliDrawableImageLevel = percent.asBigDecimal().multiply(MAX).intValue();
	        setImageLevel(cliDrawableImageLevel);
	    }
}
