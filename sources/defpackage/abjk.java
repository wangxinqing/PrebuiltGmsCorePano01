package defpackage;

import java.util.Comparator;

/* renamed from: abjk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abjk implements Comparator {
    static final Comparator a = new abjk();

    private abjk() {
    }

    public final int compare(Object obj, Object obj2) {
        return (((avjj) obj2).g > ((avjj) obj).g ? 1 : (((avjj) obj2).g == ((avjj) obj).g ? 0 : -1));
    }
}
