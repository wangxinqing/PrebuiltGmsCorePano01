package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: egu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class egu {
    static byte[] a(ehm ehm) {
        byte[] bytes = ehm.d.getBytes(Charset.forName("UTF-8"));
        byte[] bArr = new byte[(bytes.length + 9)];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.put(bytes);
        wrap.put((byte) 0);
        wrap.putLong(ehm.c);
        wrap.flip();
        return bArr;
    }
}
