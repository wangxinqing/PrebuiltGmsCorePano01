package defpackage;

import java.nio.ByteBuffer;
import org.webrtc.JniCommon;

/* renamed from: baxj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class baxj implements Runnable {
    private final ByteBuffer a;

    public baxj(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    public final void run() {
        JniCommon.nativeFreeByteBuffer(this.a);
    }
}
