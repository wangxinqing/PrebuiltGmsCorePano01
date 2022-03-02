package defpackage;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: afnq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afnq implements Callable {
    private final afnt a;
    private final AtomicInteger b;
    private final List c;

    public afnq(afnt afnt, AtomicInteger atomicInteger, List list) {
        this.a = afnt;
        this.b = atomicInteger;
        this.c = list;
    }

    public final Object call() {
        afnt afnt = this.a;
        AtomicInteger atomicInteger = this.b;
        List list = this.c;
        if (atomicInteger.get() > 0) {
            afnt.e.a(4, atomicInteger.get());
        }
        int a2 = afnt.a(afsp.a(afnt.a, afnt.g), list);
        if (a2 <= 0) {
            return null;
        }
        afnt.e.a(5, a2);
        return null;
    }
}
