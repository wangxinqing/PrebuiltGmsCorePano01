package defpackage;

import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* renamed from: bact  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bact implements Runnable {
    final bacr a;
    final /* synthetic */ String b;
    final /* synthetic */ baaf c;
    final /* synthetic */ baaj d;
    final /* synthetic */ balm e;
    final /* synthetic */ azxh f;
    final /* synthetic */ bacu g;

    public bact(bacu bacu, String str, baaf baaf, baaj baaj, balm balm, azxh azxh) {
        this.g = bacu;
        this.b = str;
        this.c = baaf;
        this.d = baaj;
        this.e = balm;
        this.f = azxh;
        String str2 = this.b;
        bacu bacu2 = this.g;
        String str3 = bacu2.a;
        Executor executor = bacu2.e;
        baaf baaf2 = this.c;
        Object obj = bacu2.c;
        int i = bacu2.f;
        boolean z = bacu2.g;
        baaj baaj2 = this.d;
        balm balm2 = this.e;
        azxh azxh2 = this.f;
        balu balu = bacu2.h;
        boolean z2 = bacu2.i;
        boolean z3 = bacu2.j;
        this.a = new bacr(str2, str3, executor, baaf2, bacu2, this, obj, baaj2, balm2, azxh2, balu);
    }

    public final void run() {
        synchronized (this.g.c) {
            bacu bacu = this.g;
            if (bacu.k) {
                this.a.o.b(bacu.l, true, new baaf());
            } else if (bacu.m) {
                bacr bacr = this.a;
                bacu.d.add(bacr);
                bacq bacq = bacr.o;
                back back = bacu.n;
                bacr bacr2 = bacq.h;
                ByteBuffer byteBuffer = bacr.a;
                bacr2.p = back;
            } else {
                throw new AssertionError("Transport is not started");
            }
        }
    }
}
