package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: ahgb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahgb implements Runnable {
    private final ahgg a;
    private final int b;
    private final long c;
    private final TimeUnit d;
    private final int e;

    public ahgb(ahgg ahgg, int i, long j, TimeUnit timeUnit, int i2) {
        this.a = ahgg;
        this.b = i;
        this.c = j;
        this.d = timeUnit;
        this.e = i2;
    }

    public final void run() {
        ahgg ahgg = this.a;
        int i = this.b;
        long j = this.c;
        TimeUnit timeUnit = this.d;
        int i2 = this.e;
        aucd o = aokv.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aokv aokv = (aokv) o.b;
        aokv.a |= 1;
        aokv.b = i;
        int convert = (int) TimeUnit.MILLISECONDS.convert(j, timeUnit);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aokv aokv2 = (aokv) o.b;
        aokv2.a |= 2;
        aokv2.c = convert;
        aokv aokv3 = (aokv) o.i();
        aucd o2 = aokx.g.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aokx aokx = (aokx) o2.b;
        aokv3.getClass();
        aokx.e = aokv3;
        aokx.a |= 8;
        ahgg.a((aokx) o2.i(), i2);
    }
}
