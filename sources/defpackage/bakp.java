package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: bakp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bakp {
    static {
        new bakn(new byte[0], 0, 0);
    }

    public static bakl a(ByteBuffer byteBuffer) {
        return new bako(byteBuffer);
    }

    public static InputStream a(bakl bakl) {
        return new bakm(bakl);
    }

    public static String a(bakl bakl, Charset charset) {
        amrl.a((Object) charset, (Object) "charset");
        amrl.a((Object) bakl, (Object) "buffer");
        int a = bakl.a();
        byte[] bArr = new byte[a];
        bakl.a(bArr, 0, a);
        return new String(bArr, charset);
    }
}
