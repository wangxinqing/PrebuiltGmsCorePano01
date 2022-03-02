package defpackage;

import java.nio.ByteBuffer;
import java.util.zip.Adler32;

/* renamed from: arhh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arhh {
    public static void a(ByteBuffer byteBuffer, byte b, int i) {
        int position = byteBuffer.position() - i;
        Adler32 adler32 = new Adler32();
        adler32.update(b);
        adler32.update(byteBuffer.array(), position, i);
        byteBuffer.putLong(position - 8, adler32.getValue());
    }

    public static boolean a(ByteBuffer byteBuffer, byte b) {
        int i = byteBuffer.getInt();
        long j = byteBuffer.getLong();
        Adler32 adler32 = new Adler32();
        adler32.update(b);
        adler32.update(byteBuffer.array(), byteBuffer.position(), i);
        return j == adler32.getValue();
    }
}
