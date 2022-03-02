package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: fcw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fcw implements Callable {
    private final fcy a;
    private final Iterable b;
    private final String c;

    public fcw(fcy fcy, Iterable iterable, String str) {
        this.a = fcy;
        this.b = iterable;
        this.c = str;
    }

    public final Object call() {
        fcy fcy = this.a;
        Iterable<aorr> iterable = this.b;
        String str = this.c;
        if (!awoe.b()) {
            return new Object();
        }
        for (aorr a2 : iterable) {
            antu antu = (antu) aorl.a((Future) a2);
            hol hol = fcy.b;
            aucd o = anty.n.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            anty anty = (anty) o.b;
            anty.b = 2;
            int i = anty.a | 1;
            anty.a = i;
            str.getClass();
            int i2 = 2 | i;
            anty.a = i2;
            anty.c = str;
            antu.getClass();
            anty.d = antu;
            anty.a = i2 | 4;
            hol.a((audx) o.i()).b();
        }
        return new Object();
    }
}
