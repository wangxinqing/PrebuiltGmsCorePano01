package defpackage;

import java.util.Comparator;

/* renamed from: artf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class artf implements Comparator {
    static final Comparator a = new artf();

    private artf() {
    }

    public final int compare(Object obj, Object obj2) {
        return (((artg) obj).c > ((artg) obj2).c ? 1 : (((artg) obj).c == ((artg) obj2).c ? 0 : -1));
    }
}
