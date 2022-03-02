package defpackage;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: ahgc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahgc implements Runnable {
    private final ahgg a;
    private final int b;
    private final Set c;
    private final long d;
    private final TimeUnit e;
    private final int f;

    public ahgc(ahgg ahgg, int i, Set set, long j, TimeUnit timeUnit, int i2) {
        this.a = ahgg;
        this.b = i;
        this.c = set;
        this.d = j;
        this.e = timeUnit;
        this.f = i2;
    }

    public final void run() {
        ahgg ahgg = this.a;
        int i = this.b;
        Set set = this.c;
        long j = this.d;
        TimeUnit timeUnit = this.e;
        int i2 = this.f;
        aucd o = aokw.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aokw aokw = (aokw) o.b;
        aokw.a |= 1;
        aokw.b = i;
        if (!aokw.c.a()) {
            aokw.c = aucj.a(aokw.c);
        }
        auab.a((Iterable) set, (List) aokw.c);
        int convert = (int) TimeUnit.MILLISECONDS.convert(j, timeUnit);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aokw aokw2 = (aokw) o.b;
        aokw2.a |= 2;
        aokw2.d = convert;
        aokw aokw3 = (aokw) o.i();
        aucd o2 = aokx.g.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aokx aokx = (aokx) o2.b;
        aokw3.getClass();
        aokx.d = aokw3;
        aokx.a |= 4;
        ahgg.a((aokx) o2.i(), i2);
    }
}
