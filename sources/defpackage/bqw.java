package defpackage;

import java.util.Comparator;

/* renamed from: bqw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class bqw implements Comparator {
    static final Comparator a = new bqw();

    private bqw() {
    }

    public final int compare(Object obj, Object obj2) {
        bre bre = (bre) obj;
        bre bre2 = (bre) obj2;
        return amya.b.a(bre2.c, bre.c).a((Comparable) bre.b, (Comparable) bre2.b).a();
    }
}
