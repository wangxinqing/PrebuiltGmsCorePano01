package defpackage;

import java.util.Comparator;

/* renamed from: aika  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aika implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        aijt aijt = (aijt) obj2;
        long j = ((aijt) obj).a.b;
        long j2 = Long.MAX_VALUE;
        if (j == -1) {
            j = Long.MAX_VALUE;
        }
        long j3 = aijt.a.b;
        if (j3 != -1) {
            j2 = j3;
        }
        if (j != j2) {
            return j >= j2 ? 1 : -1;
        }
        return 0;
    }
}
