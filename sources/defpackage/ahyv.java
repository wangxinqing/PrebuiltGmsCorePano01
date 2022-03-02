package defpackage;

import java.util.Comparator;

/* renamed from: ahyv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahyv implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        long j = ((ahyw) obj).a - ((ahyw) obj2).b;
        if (j != 0) {
            return j >= 0 ? 1 : -1;
        }
        return 0;
    }
}
