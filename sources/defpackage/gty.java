package defpackage;

import java.util.Arrays;

/* renamed from: gty  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gty extends gtw {
    public final int a() {
        return 0;
    }

    public final byte[] a(gti gti) {
        return null;
    }

    public final boolean b() {
        return false;
    }

    public final boolean c() {
        return false;
    }

    public final Integer a(int i) {
        return Integer.valueOf(i);
    }

    public final byte[] c(gti gti) {
        byte[] a = gti.a(gtw.a);
        if (a[1] == 1) {
            return Arrays.copyOfRange(a, 1, 18);
        }
        return Arrays.copyOfRange(a, 1, 14);
    }
}
