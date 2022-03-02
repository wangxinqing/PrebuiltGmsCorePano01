package com.google.android.gms.drivingmode;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CheckableLinearLayout extends LinearLayout implements Checkable {
    private boolean a;

    public CheckableLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean isChecked() {
        return this.a;
    }

    public final void setChecked(boolean z) {
        this.a = z;
        ((CheckedTextView) findViewById(16908310)).setChecked(this.a);
    }

    public final void toggle() {
        setChecked(!this.a);
    }
}
