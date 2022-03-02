package com.google.android.gms.plus.audience;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AudienceSelectionScrollView extends ScrollView {
    public ypt a;
    public yps b;

    public AudienceSelectionScrollView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.onOverScrolled(i, i2, z, z2);
        yps yps = this.b;
        if (yps != null) {
            yps.a(i2, z2);
        }
    }

    /* access modifiers changed from: protected */
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        ypt ypt = this.a;
        if (ypt != null) {
            ypt.a(this, i2);
        }
    }

    public AudienceSelectionScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AudienceSelectionScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
