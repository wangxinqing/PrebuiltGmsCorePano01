package defpackage;

import java.util.Set;

/* renamed from: aopy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aopy extends aopw {
    public final int a(aopz aopz) {
        int i;
        synchronized (aopz) {
            i = aopz.remaining - 1;
            aopz.remaining = i;
        }
        return i;
    }

    public final void a(aopz aopz, Set set) {
        synchronized (aopz) {
            if (aopz.seenExceptions == null) {
                aopz.seenExceptions = set;
            }
        }
    }
}
