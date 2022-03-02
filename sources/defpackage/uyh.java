package defpackage;

import java.util.Comparator;

/* renamed from: uyh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uyh implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        uyg uyg = (uyg) obj;
        uyg uyg2 = (uyg) obj2;
        long j = uyg.d;
        long j2 = uyg2.d;
        return j == j2 ? uyg.a.compareTo(uyg2.a) : (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }
}
