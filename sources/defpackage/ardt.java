package defpackage;

import java.util.Comparator;

/* renamed from: ardt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ardt implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        long j = ((ardh) obj).a;
        long j2 = ((ardh) obj2).a;
        if (j != j2) {
            return j > j2 ? 1 : -1;
        }
        return 0;
    }
}
