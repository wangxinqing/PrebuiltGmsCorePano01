package defpackage;

/* renamed from: arsu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arsu {
    public static final byte[] a = new byte[5];

    public static final int a(byte[] bArr, int i) {
        loop0:
        while (i >= 0) {
            int i2 = (i * 11) + 17;
            for (int i3 = 0; i3 < a.length; i3++) {
                if (bArr[i2 + i3] != 0) {
                    break loop0;
                }
            }
            i--;
        }
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException("First MAC entry cannot be virtual.");
    }
}
