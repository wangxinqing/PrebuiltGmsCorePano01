package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: apxd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apxd extends apxc {
    public static final apxd a = new apxd();

    public final ByteBuffer a(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }
}
