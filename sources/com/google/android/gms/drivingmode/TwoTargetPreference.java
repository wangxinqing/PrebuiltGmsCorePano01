package com.google.android.gms.drivingmode;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.Preference;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class TwoTargetPreference extends Preference {
    public TwoTargetPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.C = g();
    }

    public void a(anb anb) {
        int i;
        super.a(anb);
        View c = anb.c(16908312);
        boolean r = r();
        if (c != null) {
            if (!r) {
                i = 0;
            } else {
                i = 8;
            }
            c.setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    public int g() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public boolean r() {
        return g() == 0;
    }
}
