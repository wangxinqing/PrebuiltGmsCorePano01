package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: swz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class swz implements Runnable {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ sxd e;

    public swz(sxd sxd, AtomicReference atomicReference, String str, String str2, String str3) {
        this.e = sxd;
        this.a = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final void run() {
        sye l = this.e.x.l();
        AtomicReference atomicReference = this.a;
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        l.h();
        l.l();
        l.a((Runnable) new sxw(l, atomicReference, str, str2, str3, l.a(false)));
    }
}
