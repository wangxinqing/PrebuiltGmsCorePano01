package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: brv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class brv extends apxg {
    public static final /* synthetic */ int a = 0;

    public final String U() {
        int d = d(4);
        if (d != 0) {
            return f(d + this.c);
        }
        return null;
    }

    public final apxg a(String str) {
        int d = d(6);
        if (d == 0) {
            return null;
        }
        int h = h(d);
        ByteBuffer byteBuffer = this.d;
        byte[] bytes = str.getBytes((Charset) apxg.b.get());
        int i = byteBuffer.getInt(h - 4);
        int i2 = 0;
        while (i != 0) {
            int i3 = i / 2;
            int a2 = apxg.a(((i2 + i3) * 4) + h, byteBuffer);
            int a3 = apxg.a(apxg.c(byteBuffer.capacity() - a2, byteBuffer), bytes, byteBuffer);
            if (a3 > 0) {
                i = i3;
            } else if (a3 < 0) {
                int i4 = i3 + 1;
                i2 += i4;
                i -= i4;
            } else {
                apxg apxg = new apxg();
                apxg.b(a2, byteBuffer);
                return apxg;
            }
        }
        return null;
    }
}
