package com.google.android.gms.accountsettings.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.material.tabs.TabLayout;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PagerTabLayout extends TabLayout {
    public ddh a;

    public PagerTabLayout(Context context) {
        super(context);
    }

    public final void a(akbk akbk, int i, boolean z) {
        ddh ddh;
        if (awgy.k() && (ddh = this.a) != null) {
            ddp ddp = ddh.a;
            aqrk b = ((dhp) ddp.f.get(i)).b();
            if (b != null) {
                if (cyd.a(ddp.getContext())) {
                    qb.d(akbk.h, 1);
                } else {
                    qb.d(akbk.h, 0);
                }
                akbk.a(cxz.b(ddp.getContext(), b));
            } else {
                akbk.a((Drawable) null);
            }
        }
        super.a(akbk, i, z);
    }

    public PagerTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PagerTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
