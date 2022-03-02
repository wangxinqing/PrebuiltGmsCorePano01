package com.google.android.gms.auth.api.credentials.yolo.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class EventsInterceptableLinearLayout extends LinearLayout {
    public boolean a = false;

    public EventsInterceptableLinearLayout(Context context) {
        super(context);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.a) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    public EventsInterceptableLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
