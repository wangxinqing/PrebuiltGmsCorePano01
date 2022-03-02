package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* renamed from: agin  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agin implements Runnable {
    private final agio a;
    private final agnm b;

    public agin(agio agio, agnm agnm) {
        this.a = agio;
        this.b = agnm;
    }

    public final void run() {
        agio agio = this.a;
        barz[] a2 = agnn.a(aghz.a, this.b);
        if (a2 != null && a2.length > 0) {
            aucd o = barw.h.o();
            long leastSignificantBits = UUID.randomUUID().getLeastSignificantBits();
            if (o.c) {
                o.c();
                o.c = false;
            }
            barw barw = (barw) o.b;
            barw.a |= 1;
            barw.b = leastSignificantBits;
            List asList = Arrays.asList(a2);
            if (o.c) {
                o.c();
                o.c = false;
            }
            barw barw2 = (barw) o.b;
            barw2.c();
            auab.a((Iterable) asList, (List) barw2.d);
            barw barw3 = (barw) o.i();
            aucd o2 = basu.s.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            basu basu = (basu) o2.b;
            barw3.getClass();
            basu.m = barw3;
            basu.a |= 32768;
            basu basu2 = (basu) o2.i();
            if ((barw3.a & 1) != 0) {
                long j = barw3.b;
            }
            if (barw3.d.size() > 0) {
                String str = ((barz) barw3.d.get(0)).b;
            }
            agio.a.a(basu2);
        }
    }
}
