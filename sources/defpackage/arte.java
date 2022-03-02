package defpackage;

import java.util.Comparator;

/* renamed from: arte  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class arte implements Comparator {
    static final Comparator a = new arte();

    private arte() {
    }

    public final int compare(Object obj, Object obj2) {
        return Integer.compare(((artg) obj2).d, ((artg) obj).d);
    }
}
