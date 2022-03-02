package com.google.android.gms.plus.oob;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Spinner;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GenderSpinner extends Spinner {
    public yys a;

    public GenderSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void setSelection(int i) {
        super.setSelection(i);
        yys yys = this.a;
        if (yys != null) {
            yys.b(i);
        }
    }
}
