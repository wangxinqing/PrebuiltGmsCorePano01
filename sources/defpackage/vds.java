package defpackage;

import com.google.android.gms.nearby.messages.Strategy;

/* renamed from: vds  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vds {
    public static long a(Strategy strategy) {
        return b(strategy.e);
    }

    public static boolean a(int i) {
        return i == Integer.MAX_VALUE;
    }

    public static boolean a(long j) {
        return j == Long.MAX_VALUE;
    }

    public static long b(int i) {
        if (!a(i)) {
            return ((long) i) * 1000;
        }
        return Long.MAX_VALUE;
    }
}
