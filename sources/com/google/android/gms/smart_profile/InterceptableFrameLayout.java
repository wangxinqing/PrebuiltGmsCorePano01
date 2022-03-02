package com.google.android.gms.smart_profile;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class InterceptableFrameLayout extends FrameLayout {
    public InterceptableFrameLayout(Context context) {
        super(context);
        a(context);
    }

    private final void a(Context context) {
        if (azim.b() && azig.b()) {
            setBackgroundColor(jsa.a(context, R.attr.cardsContainerBackgroundColor));
        }
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(false);
    }

    public InterceptableFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public InterceptableFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }
}
