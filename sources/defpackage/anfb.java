package defpackage;

import java.util.Iterator;

/* renamed from: anfb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anfb {
    public static anaa a(Iterable iterable, amqy amqy) {
        Iterator it = iterable.iterator();
        amrl.a((Object) amqy);
        amzz amzz = new amzz();
        while (it.hasNext()) {
            Object next = it.next();
            amrl.a(next, (Object) it);
            amzz.a(amqy.a(next), next);
        }
        return amzz.a();
    }

    public static ancq a(ancq ancq) {
        return new angy(ancq);
    }
}
