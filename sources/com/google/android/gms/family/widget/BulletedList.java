package com.google.android.gms.family.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class BulletedList extends LinearLayout {
    public int a;

    public BulletedList(Context context) {
        super(context);
        a();
    }

    private final void a() {
        setOrientation(1);
    }

    public BulletedList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public BulletedList(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}
