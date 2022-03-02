package defpackage;

/* renamed from: aqen  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqen {
    public static long a(aqek aqek, int i, long j) {
        if (aqek == null) {
            return j;
        }
        try {
            return aqek.i(i) ? aqek.c(i) : j;
        } catch (IllegalArgumentException e) {
            return j;
        } catch (ClassCastException e2) {
            return j;
        }
    }
}
