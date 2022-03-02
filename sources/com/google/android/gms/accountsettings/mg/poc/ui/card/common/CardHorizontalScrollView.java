package com.google.android.gms.accountsettings.mg.poc.ui.card.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CardHorizontalScrollView extends HorizontalScrollView {
    private boolean a;
    private float b;
    private boolean c;
    private float d;
    private boolean e;

    public CardHorizontalScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private final boolean a() {
        return canScrollHorizontally(-1);
    }

    private final boolean b() {
        return canScrollHorizontally(1);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.e = false;
            this.a = true;
            this.b = motionEvent.getX();
        } else if (actionMasked == 1) {
            this.e = false;
        } else if (actionMasked == 2 && this.a) {
            if (a(motionEvent, this.b)) {
                this.a = false;
                if (!a()) {
                    this.e = true;
                }
            } else if (b(motionEvent, this.b)) {
                this.a = false;
                if (!b()) {
                    this.e = true;
                }
            }
        }
        if (!this.e) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.e) {
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.c = true;
            this.d = motionEvent.getX();
        } else if (actionMasked == 1) {
            this.e = false;
        } else if (actionMasked == 2 && this.c) {
            if (a(motionEvent, this.d)) {
                this.c = false;
                if (!a()) {
                    this.e = true;
                }
            } else if (b(motionEvent, this.d)) {
                this.c = false;
                if (!b()) {
                    this.e = true;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    private static final boolean a(MotionEvent motionEvent, float f) {
        return motionEvent.getX() - f > 0.0f;
    }

    private static final boolean b(MotionEvent motionEvent, float f) {
        return motionEvent.getX() - f < 0.0f;
    }
}
