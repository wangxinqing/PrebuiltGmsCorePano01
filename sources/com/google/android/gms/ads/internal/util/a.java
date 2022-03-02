package com.google.android.gms.ads.internal.util;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class a implements Runnable {
    final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    public final void run() {
        this.a.b = Thread.currentThread();
        b bVar = this.a;
        bVar.c.a(bVar.d);
    }
}
