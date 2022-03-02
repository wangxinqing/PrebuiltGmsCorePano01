package defpackage;

import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* renamed from: ahnx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahnx {
    public static final long a = (TimeUnit.NANOSECONDS.convert(1, TimeUnit.SECONDS) / 16);
    public final ahmz b;
    public final ahob c;

    public ahnx(ByteBuffer byteBuffer, ahmz ahmz) {
        this.b = ahmz;
        this.c = new ahob(byteBuffer);
    }
}
