package com.android.setupwizardlib.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.LinearLayout;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CheckableLinearLayout extends LinearLayout implements Checkable {
    private boolean a = false;

    public CheckableLinearLayout(Context context) {
        super(context);
        setFocusable(true);
    }

    public final boolean isChecked() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i) {
        if (!this.a) {
            return super.onCreateDrawableState(i);
        }
        return mergeDrawableStates(super.onCreateDrawableState(i + 1), new int[]{16842912});
    }

    public final void setChecked(boolean z) {
        this.a = z;
        refreshDrawableState();
    }

    public final void toggle() {
        setChecked(!this.a);
    }

    public CheckableLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setFocusable(true);
    }

    public CheckableLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setFocusable(true);
    }

    public CheckableLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        setFocusable(true);
    }
}
