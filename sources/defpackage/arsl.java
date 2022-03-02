package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: arsl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class arsl implements Runnable {
    final /* synthetic */ ByteBuffer a;
    final /* synthetic */ arsm b;

    public arsl(arsm arsm, ByteBuffer byteBuffer) {
        this.b = arsm;
        this.a = byteBuffer;
    }

    public final void run() {
        try {
            this.b.b(this.a.array());
        } catch (IOException e) {
        }
    }
}
