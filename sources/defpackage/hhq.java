package defpackage;

import java.util.Comparator;

/* renamed from: hhq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class hhq implements Comparator {
    public static final Comparator a = new hhq();

    private hhq() {
    }

    public final int compare(Object obj, Object obj2) {
        hhp hhp = (hhp) obj;
        hhp hhp2 = (hhp) obj2;
        return amya.b.a((Comparable) hhp.b, (Comparable) hhp2.b).a(hhp.c, hhp2.c).a();
    }
}
