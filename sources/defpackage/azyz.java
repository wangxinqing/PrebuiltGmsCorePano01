package defpackage;

import java.nio.charset.Charset;

/* renamed from: azyz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azyz {
    public static final Charset a = Charset.forName("US-ASCII");
    public static final anml b = baaf.b;

    public static baab a(String str, azyy azyy) {
        boolean z = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        return baab.a(str, z, azyy);
    }

    public static int b(baaf baaf) {
        return baaf.d;
    }

    public static baaf a(byte[]... bArr) {
        return new baaf(bArr.length >> 1, (Object[]) bArr);
    }

    public static byte[][] a(baaf baaf) {
        byte[][] bArr = new byte[baaf.a()][];
        Object[] objArr = baaf.c;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, baaf.a());
        } else {
            for (int i = 0; i < baaf.d; i++) {
                int i2 = i + i;
                bArr[i2] = baaf.a(i);
                bArr[i2 + 1] = baaf.b(i);
            }
        }
        return bArr;
    }
}
