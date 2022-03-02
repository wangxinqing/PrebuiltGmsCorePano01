package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class b extends Thread {
    final CountDownLatch a = new CountDownLatch(1);
    boolean b = false;
    private final WeakReference c;
    private final long d;

    public b(d dVar, long j) {
        this.c = new WeakReference(dVar);
        this.d = j;
        start();
    }

    private final void a() {
        d dVar = (d) this.c.get();
        if (dVar != null) {
            dVar.c();
            this.b = true;
        }
    }

    public final void run() {
        try {
            if (!this.a.await(this.d, TimeUnit.MILLISECONDS)) {
                a();
            }
        } catch (InterruptedException e) {
            a();
        }
    }
}
