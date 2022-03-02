package com.google.android.gms.accountsettings.mg.poc.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.OverScroller;
import android.widget.ScrollView;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BottomNavMenuScrollView extends ScrollView {
    public int a;
    public int b;
    public boolean c;
    public dah d;
    private final OverScroller e;
    private float f;

    public BottomNavMenuScrollView(Context context) {
        super(context);
        this.e = new OverScroller(context);
    }

    private final boolean a(int i) {
        if (i < Math.round(((float) this.a) * 0.75f)) {
            post(new daw(this));
            return true;
        } else if (i < this.a) {
            post(new dax(this));
            return true;
        } else if (i >= this.b) {
            return false;
        } else {
            post(new day(this));
            return true;
        }
    }

    public final void fling(int i) {
        int height = getHeight();
        int i2 = i;
        this.e.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, 0, Math.max(0, getChildAt(0).getHeight() - height));
        if (!a(this.e.getFinalY())) {
            super.fling(i);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = true;
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            if (motionEvent.getY() >= this.f) {
                z = false;
            }
            this.c = z;
            this.f = motionEvent.getY();
        } else if (motionEvent.getAction() == 1 && a(getScrollY())) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public BottomNavMenuScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new OverScroller(context);
    }
}
