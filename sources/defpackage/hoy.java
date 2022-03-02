package defpackage;

import java.util.Comparator;

/* renamed from: hoy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class hoy implements Comparator {
    static final Comparator a = new hoy();

    private hoy() {
    }

    public final int compare(Object obj, Object obj2) {
        return (((avsg) obj).b > ((avsg) obj2).b ? 1 : (((avsg) obj).b == ((avsg) obj2).b ? 0 : -1));
    }
}
