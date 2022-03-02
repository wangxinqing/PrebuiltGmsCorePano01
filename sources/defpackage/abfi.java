package defpackage;

import java.util.Comparator;

/* renamed from: abfi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abfi implements Comparator {
    static final Comparator a = new abfi();

    private abfi() {
    }

    public final int compare(Object obj, Object obj2) {
        return (((avjj) obj2).g > ((avjj) obj).g ? 1 : (((avjj) obj2).g == ((avjj) obj).g ? 0 : -1));
    }
}
