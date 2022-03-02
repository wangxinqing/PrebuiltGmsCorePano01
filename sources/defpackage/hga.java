package defpackage;

import java.util.Comparator;

/* renamed from: hga  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class hga implements Comparator {
    static final Comparator a = new hga();

    private hga() {
    }

    public final int compare(Object obj, Object obj2) {
        hfp hfp = (hfp) obj;
        hfp hfp2 = (hfp) obj2;
        Comparator comparator = hgi.a;
        return amya.b.a((Comparable) hfp.b, (Comparable) hfp2.b).a((Comparable) hfp.d, (Comparable) hfp2.d).a();
    }
}
