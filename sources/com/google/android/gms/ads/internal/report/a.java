package com.google.android.gms.ads.internal.report;

import com.google.android.gms.ads.internal.util.client.e;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class a implements Runnable {
    private final e a;
    private final String b;

    public a(e eVar, String str) {
        this.a = eVar;
        this.b = str;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
