package com.google.android.gms.ads.measurement.service;

import android.os.Bundle;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class a implements Runnable {
    final /* synthetic */ Bundle a;
    final /* synthetic */ String b;
    final /* synthetic */ b c;

    public a(b bVar, Bundle bundle, String str) {
        this.c = bVar;
        this.a = bundle;
        this.b = str;
    }

    public final void run() {
        this.c.c.a("auto", "_iap", this.a, this.b);
    }
}
