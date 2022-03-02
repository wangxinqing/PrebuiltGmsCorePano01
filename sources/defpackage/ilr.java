package defpackage;

import java.util.Comparator;

/* renamed from: ilr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ilr implements Comparator {
    final /* synthetic */ Comparator a;
    final /* synthetic */ ils b;

    public ilr(ils ils, Comparator comparator) {
        this.b = ils;
        this.a = comparator;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return this.a.compare(((xfe) this.b.a).a(((Integer) obj).intValue()), ((xfe) this.b.a).a(((Integer) obj2).intValue()));
    }
}
