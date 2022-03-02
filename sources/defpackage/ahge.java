package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: ahge  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahge implements Callable {
    private final ahgg a;
    private final aorr b;

    public ahge(ahgg ahgg, aorr aorr) {
        this.a = ahgg;
        this.b = aorr;
    }

    public final Object call() {
        ahgg ahgg = this.a;
        String str = (String) aorl.a((Future) this.b);
        aoje a2 = ((afjl) aorl.a((Future) ahgg.a)).a(str);
        if (a2 == null) {
            return null;
        }
        aucd o = aokx.g.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aokx aokx = (aokx) o.b;
        str.getClass();
        int i = aokx.a | 1;
        aokx.a = i;
        aokx.b = str;
        a2.getClass();
        aokx.c = a2;
        aokx.a = i | 2;
        ahgg.a((aokx) o.i(), (int) a2.d);
        return null;
    }
}
