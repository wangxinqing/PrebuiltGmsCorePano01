package com.google.android.gms.ads.internal;

import android.os.Build;
import com.google.android.gms.ads.internal.request.service.a;
import com.google.android.gms.ads.internal.util.h;
import com.google.android.gms.ads.internal.util.l;
import com.google.android.gms.ads.internal.util.m;
import com.google.android.gms.ads.internal.util.n;
import com.google.android.gms.ads.internal.util.o;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.ads.internal.util.q;
import com.google.android.gms.ads.internal.util.w;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class b {
    public static final b a = new b();
    public final p b;
    private final h c;
    private final com.google.android.gms.ads.internal.state.b d;

    protected b() {
        p pVar;
        h hVar = new h();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            pVar = new o();
        } else if (i >= 26) {
            pVar = new n();
        } else if (i >= 24) {
            pVar = new m();
        } else {
            pVar = new l();
        }
        com.google.android.gms.ads.internal.state.b bVar = new com.google.android.gms.ads.internal.state.b();
        new com.google.android.gms.ads.internal.cache.b();
        new a();
        new q();
        new com.google.android.gms.ads.internal.scionintegration.a();
        new w();
        new com.google.android.gms.ads.internal.video.gmsg.a();
        this.c = hVar;
        this.b = pVar;
        this.d = bVar;
        new com.google.android.gms.ads.internal.interstitial.a();
    }

    public static h a() {
        return a.c;
    }

    public static void b() {
        com.google.android.gms.ads.internal.state.b bVar = a.d;
    }
}
