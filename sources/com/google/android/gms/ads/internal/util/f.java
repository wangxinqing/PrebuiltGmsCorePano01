package com.google.android.gms.ads.internal.util;

import android.content.Context;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class f implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ h b;

    public f(h hVar, Context context) {
        this.b = hVar;
        this.a = context;
    }

    public final void run() {
        synchronized (this.b.b) {
            h hVar = this.b;
            hVar.c = hVar.a(this.a);
            this.b.b.notifyAll();
        }
    }
}
