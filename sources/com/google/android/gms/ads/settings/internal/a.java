package com.google.android.gms.ads.settings.internal;

import android.content.Context;
import com.google.android.gms.ads.identifier.settings.e;
import com.google.android.gms.ads.internal.b;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class a {
    final /* synthetic */ e a;
    final /* synthetic */ int b;
    final /* synthetic */ Context c;

    public a(e eVar, int i, Context context) {
        this.a = eVar;
        this.b = i;
        this.c = context;
    }

    public final void a(boolean z) {
        if (z) {
            this.a.a(true);
            if (awhh.i()) {
                b.a().a(this.c, (String) null, "gmob-apps", b.a("edu_eligible", Boolean.toString(this.a.i()), Integer.toString(this.b)));
            }
        }
    }
}
