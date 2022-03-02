package defpackage;

import java.util.Comparator;

/* renamed from: cdk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cdk implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        atrq atrq = (atrq) obj;
        atrq atrq2 = (atrq) obj2;
        int compareTo = Integer.valueOf(atrq2.c).compareTo(Integer.valueOf(atrq.c));
        if (compareTo != 0) {
            return compareTo;
        }
        atrp a = atrp.a(atrq.b);
        if (a == null) {
            a = atrp.IN_VEHICLE;
        }
        Integer valueOf = Integer.valueOf(a.x);
        atrp a2 = atrp.a(atrq2.b);
        if (a2 == null) {
            a2 = atrp.IN_VEHICLE;
        }
        return valueOf.compareTo(Integer.valueOf(a2.x));
    }
}
