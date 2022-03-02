package defpackage;

import java.util.Comparator;

/* renamed from: bqn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class bqn implements Comparator {
    static final Comparator a = new bqn();

    private bqn() {
    }

    public final int compare(Object obj, Object obj2) {
        brk brk = (brk) obj;
        brk brk2 = (brk) obj2;
        return amya.b.a(brk.f, brk2.f).a((Comparable) brk.d, (Comparable) brk2.d).a();
    }
}
