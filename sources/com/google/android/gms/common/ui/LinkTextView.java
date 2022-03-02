package com.google.android.gms.common.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LinkTextView extends TextView {
    private jgg a;

    public LinkTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.a.a(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public LinkTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        jgg jgg = new jgg(this);
        this.a = jgg;
        qb.a((View) this, (oz) jgg);
    }
}
