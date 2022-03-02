package defpackage;

import java.util.Comparator;

/* renamed from: byh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class byh implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int a = byi.a(((bzk) obj).a);
        int a2 = byi.a(((bzk) obj2).a);
        if (a >= a2) {
            return a != a2 ? 1 : 0;
        }
        return -1;
    }
}
