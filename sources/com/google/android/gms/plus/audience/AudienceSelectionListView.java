package com.google.android.gms.plus.audience;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ListView;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AudienceSelectionListView extends ListView {
    public ypr a;
    public ypq b;

    public AudienceSelectionListView(Context context) {
        super(context);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ypq ypq = this.b;
        if (ypq != null) {
            ypq.a(this);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.onOverScrolled(i, i2, z, z2);
        ypr ypr = this.a;
        if (ypr != null) {
            ypr.a(this, z2);
        }
    }

    public AudienceSelectionListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AudienceSelectionListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
