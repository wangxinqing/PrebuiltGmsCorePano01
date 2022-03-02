package defpackage;

import android.location.Location;

/* renamed from: ajkt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajkt implements Runnable {
    final /* synthetic */ ajkv a;

    public ajkt(ajkv ajkv) {
        this.a = ajkv;
    }

    public final void run() {
        ajix.a("GCoreUlr", "Starting scheduled upload task");
        ajkv ajkv = this.a;
        ajkv.a(ajkv.c.a(), (Location) null);
    }
}
