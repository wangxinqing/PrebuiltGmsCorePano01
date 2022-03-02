package defpackage;

import java.util.Comparator;

/* renamed from: akjk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akjk implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        akhx akhx = (akhx) obj;
        akhx akhx2 = (akhx) obj2;
        int compare = Integer.compare(akhx.h, akhx2.h);
        return compare == 0 ? -Float.compare(akhx.f, akhx2.f) : -compare;
    }
}
