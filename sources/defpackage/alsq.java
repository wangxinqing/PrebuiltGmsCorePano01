package defpackage;

/* renamed from: alsq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alsq {
    public static int a(int i, amik amik, amii amii, int i2) {
        int i3 = amik.b;
        int i4 = amik.c - i3;
        if (i < i3) {
            return i;
        }
        int i5 = i3 + i4;
        if (i >= i5) {
            return i - i4;
        }
        amii amii2 = amii.SHIFT_AFTER_DELETE;
        int ordinal = amii.ordinal();
        if (ordinal == 0) {
            return i2 + -1 != 0 ? i3 : i5;
        }
        if (ordinal == 1) {
            return i3 - 1;
        }
        if (ordinal == 2) {
            return -1;
        }
        throw new altg(amii);
    }
}
