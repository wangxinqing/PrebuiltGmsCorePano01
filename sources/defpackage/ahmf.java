package defpackage;

import java.util.Comparator;

/* renamed from: ahmf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahmf implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        ahmo ahmo = (ahmo) obj;
        ahmo ahmo2 = (ahmo) obj2;
        int compare = Integer.compare(ahmo2.b, ahmo.b);
        return compare == 0 ? ahmo.a.compareTo(ahmo2.a) : compare;
    }
}
