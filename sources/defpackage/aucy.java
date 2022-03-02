package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: aucy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aucy {
    static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        aubc.a(b);
    }

    static int a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int a(boolean z) {
        return z ? 1231 : 1237;
    }

    public static String b(byte[] bArr) {
        return new String(bArr, a);
    }

    public static int c(byte[] bArr) {
        int length = bArr.length;
        int a2 = a(length, bArr, 0, length);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    static Object a(Object obj, Object obj2) {
        audw av = ((audx) obj).av();
        av.a((audx) obj2);
        return av.h();
    }

    static void a(audx audx) {
        if (audx instanceof auad) {
            auad auad = (auad) audx;
            throw null;
        }
    }

    static void a(Object obj) {
        if (obj == null) {
            throw null;
        }
    }

    static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static boolean a(byte[] bArr) {
        return aufv.a.a(bArr, 0, bArr.length);
    }
}
