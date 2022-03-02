package defpackage;

import java.util.Comparator;

/* renamed from: aisa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aisa implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        long j = ((aiay) obj).c;
        long j2 = ((aiay) obj2).c;
        if (j <= j2) {
            return j == j2 ? 0 : -1;
        }
        return 1;
    }
}
