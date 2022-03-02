package defpackage;

import java.util.Comparator;
import java.util.Map;

/* renamed from: hpn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class hpn implements Comparator {
    public static final Comparator a = new hpn();

    private hpn() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((Comparable) ((Map.Entry) obj2).getValue()).compareTo(((Map.Entry) obj).getValue());
    }
}
