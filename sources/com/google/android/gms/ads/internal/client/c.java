package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.config.g;
import com.google.android.gms.ads.internal.config.h;
import com.google.android.gms.ads.internal.config.l;
import com.google.android.gms.ads.internal.formats.client.d;
import com.google.android.gms.ads.internal.reward.client.b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.a;
import java.util.Random;
import java.util.WeakHashMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class c {
    public static final c a = new c();
    public final h b;
    private final a c;
    private final String d;
    private final g e;
    private final l f;

    protected c() {
        a aVar = new a();
        new b();
        new a();
        new g();
        new com.google.android.gms.ads.internal.formats.client.c();
        new b();
        new com.google.android.gms.ads.internal.overlay.client.a();
        new d();
        g gVar = new g();
        h hVar = new h();
        l lVar = new l();
        String a2 = a.a();
        new VersionInfoParcel(0, 201216000);
        new Random();
        new WeakHashMap();
        this.c = aVar;
        this.e = gVar;
        this.b = hVar;
        this.f = lVar;
        this.d = a2;
    }

    public static g a() {
        return a.e;
    }

    public static l b() {
        return a.f;
    }

    public static String c() {
        return a.d;
    }

    public static void d() {
        a aVar = a.c;
    }
}
