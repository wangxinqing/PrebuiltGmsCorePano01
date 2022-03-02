package defpackage;

import java.util.Comparator;

/* renamed from: akuq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class akuq implements Comparator {
    static final Comparator a = new akuq();

    private akuq() {
    }

    public final int compare(Object obj, Object obj2) {
        return Float.compare(((akhx) obj2).e, ((akhx) obj).e);
    }
}
