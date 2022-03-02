package defpackage;

import android.util.Log;

/* renamed from: ink  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ink implements Runnable {
    private final long a;
    private final inb b;

    public ink(long j, inb inb) {
        this.a = j;
        this.b = inb;
    }

    public final void run() {
        long j = this.a;
        inb inb = this.b;
        try {
            Thread.sleep(Math.max(0, j));
        } catch (InterruptedException e) {
            Log.e("RestartUtil", "Interrupted.", e);
        }
        inm.a(inb);
    }
}
