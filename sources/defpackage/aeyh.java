package defpackage;

import java.util.Comparator;

/* renamed from: aeyh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aeyh implements Comparator {
    static final Comparator a = new aeyh();

    private aeyh() {
    }

    public final int compare(Object obj, Object obj2) {
        return (((aeth) obj).c().longValue() > ((aeth) obj2).c().longValue() ? 1 : (((aeth) obj).c().longValue() == ((aeth) obj2).c().longValue() ? 0 : -1));
    }
}
