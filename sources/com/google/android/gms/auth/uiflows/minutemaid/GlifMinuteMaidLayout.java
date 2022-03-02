package com.google.android.gms.auth.uiflows.minutemaid;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.setupdesign.GlifLayout;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GlifMinuteMaidLayout extends GlifLayout {
    public Context a;
    public alhe b;
    public alhg c;
    public alhg d;

    public GlifMinuteMaidLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void a(String str, int i, fzb fzb) {
        if (!TextUtils.isEmpty(str)) {
            alhf alhf = new alhf(this.a);
            alhf.c = i;
            alhf.d = 2132018060;
            alhf.a = str;
            alhg a2 = alhf.a();
            this.c = a2;
            a2.a(0);
            this.b.a(this.c);
            if (fzb != null) {
                this.c.f = new gor(fzb);
                return;
            }
            return;
        }
        alhg alhg = this.c;
        if (alhg != null) {
            alhg.a(8);
        }
    }

    public GlifMinuteMaidLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GlifMinuteMaidLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = context;
        alhe alhe = (alhe) a(alhe.class);
        this.b = alhe;
        alhe.i = true;
        alhe.d();
    }

    public final void a(boolean z) {
        alhg alhg = this.c;
        if (alhg != null) {
            alhg.a(z);
        }
    }
}
