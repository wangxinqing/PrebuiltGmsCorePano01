package defpackage;

import java.util.Comparator;

/* renamed from: bnr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class bnr implements Comparator {
    static final Comparator a = new bnr();

    private bnr() {
    }

    public final int compare(Object obj, Object obj2) {
        brm brm = (brm) obj;
        brm brm2 = (brm) obj2;
        return amya.b.a((Comparable) brm.b, (Comparable) brm2.b).a(brm2.c, brm.c).a();
    }
}
