package com.google.android.gms.accountsettings.mg.poc.ui.common;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FadeInImageView extends AppCompatImageView {
    public FadeInImageView(Context context) {
        super(context);
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
    }

    public FadeInImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FadeInImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
