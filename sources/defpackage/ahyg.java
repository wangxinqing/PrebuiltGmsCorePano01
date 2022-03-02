package defpackage;

import java.util.Locale;

/* renamed from: ahyg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahyg {
    public static final String[] a = {"d", "r", "w", "b", "i"};
    public final boolean b;
    public final boolean c;
    public final int d;
    public final long e;

    public ahyg(boolean z, boolean z2, int i, long j) {
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = j;
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "GmmNavEvent: {isForeground: %b, isNavigating: %b, travelMode: %d, millisSinceBoot: %d}", new Object[]{Boolean.valueOf(this.b), Boolean.valueOf(this.c), Integer.valueOf(this.d), Long.valueOf(this.e)});
    }
}
