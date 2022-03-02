package defpackage;

import java.util.Comparator;

/* renamed from: ptp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ptp implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return Long.signum(((pts) obj2).d - ((pts) obj).d);
    }
}
