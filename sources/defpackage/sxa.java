package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: sxa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class sxa implements Runnable {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ boolean e;
    final /* synthetic */ sxd f;

    public sxa(sxd sxd, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f = sxd;
        this.a = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
    }

    public final void run() {
        sye l = this.f.x.l();
        AtomicReference atomicReference = this.a;
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        boolean z = this.e;
        l.h();
        l.l();
        l.a((Runnable) new sxx(l, atomicReference, str, str2, str3, z, l.a(false)));
    }
}
