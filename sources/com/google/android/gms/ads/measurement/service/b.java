package com.google.android.gms.ads.measurement.service;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.c;
import com.google.android.gms.measurement.module.Analytics;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class b extends c {
    public static final Object a = new Object();
    public static b b;
    final Analytics c;
    private final svv d;

    public b(Analytics analytics, svv svv) {
        this.c = analytics;
        this.d = svv;
    }

    public final void a(Bundle bundle) {
        c.a("Reporting in-app purchase data in gmp conversion tracking service.");
        String string = bundle.getString("ap");
        bundle.remove("ap");
        this.d.F().a((Runnable) new a(this, bundle, string));
    }
}
