package defpackage;

import java.util.Comparator;

/* renamed from: bli  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class bli implements Comparator {
    static final Comparator a = new bli();

    private bli() {
    }

    public final int compare(Object obj, Object obj2) {
        boc boc = (boc) obj;
        boc boc2 = (boc) obj2;
        Comparator comparator = blj.a;
        return amya.b.a((Comparable) boc.b, (Comparable) boc2.b).a(boc.c, boc2.c).a();
    }
}
