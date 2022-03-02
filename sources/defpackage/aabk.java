package defpackage;

import java.util.Comparator;
import java.util.Map;

/* renamed from: aabk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aabk implements Comparator {
    private final Map a;

    public aabk(Map map) {
        this.a = map;
    }

    public final int compare(Object obj, Object obj2) {
        Map map = this.a;
        int i = aabn.a;
        return ((Integer) map.get((nxc) obj2)).intValue() - ((Integer) map.get((nxc) obj)).intValue();
    }
}
