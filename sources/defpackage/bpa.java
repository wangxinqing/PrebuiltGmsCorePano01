package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: bpa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bpa extends apxg {
    public static final /* synthetic */ int a = 0;

    public static bpa a(bpa bpa, int i, String str, ByteBuffer byteBuffer) {
        byte[] bytes = str.getBytes((Charset) apxg.b.get());
        int i2 = byteBuffer.getInt(i - 4);
        int i3 = 0;
        while (i2 != 0) {
            int i4 = i2 / 2;
            int a2 = apxg.a(((i3 + i4) * 4) + i, byteBuffer);
            int a3 = apxg.a(apxg.c(byteBuffer.capacity() - a2, byteBuffer), bytes, byteBuffer);
            if (a3 > 0) {
                i2 = i4;
            } else if (a3 < 0) {
                int i5 = i4 + 1;
                i3 += i5;
                i2 -= i5;
            } else {
                if (bpa == null) {
                    bpa = new bpa();
                }
                bpa.b(a2, byteBuffer);
                return bpa;
            }
        }
        return null;
    }

    public final int S() {
        int d = d(6);
        if (d != 0) {
            return this.d.getInt(d + this.c);
        }
        return 0;
    }

    public final String b() {
        int d = d(4);
        if (d != 0) {
            return f(d + this.c);
        }
        return null;
    }

    public final ByteBuffer c() {
        return i(4);
    }

    public final int e() {
        int d = d(8);
        if (d != 0) {
            return this.d.getInt(d + this.c);
        }
        return 0;
    }
}
