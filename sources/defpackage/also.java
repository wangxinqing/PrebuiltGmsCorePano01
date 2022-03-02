package defpackage;

import java.util.Comparator;

/* renamed from: also  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class also implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        alsp alsp = (alsp) obj;
        alsp alsp2 = (alsp) obj2;
        int compareTo = alsp.a().compareTo(alsp2.a());
        if (compareTo != 0) {
            return compareTo;
        }
        int b = alsp.b() - alsp2.b();
        if (b != 0) {
            return b;
        }
        if (alsp.c() != alsp2.c()) {
            return alsp.c() ? -1 : 1;
        }
        return 0;
    }
}
