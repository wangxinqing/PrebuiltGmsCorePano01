package defpackage;

import java.util.Comparator;

/* renamed from: acka  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acka implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        acov acov = (acov) obj;
        acov acov2 = (acov) obj2;
        int i = acov.d;
        int i2 = acov2.d;
        if (i > i2) {
            return -1;
        }
        if (i != i2) {
            return 1;
        }
        int i3 = acov.b;
        int i4 = acov2.b;
        if (i3 <= i4) {
            return i3 != i4 ? 1 : 0;
        }
        return -1;
    }
}
