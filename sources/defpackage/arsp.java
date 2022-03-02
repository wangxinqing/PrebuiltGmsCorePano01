package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: arsp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class arsp implements Runnable {
    final /* synthetic */ ByteBuffer a;
    final /* synthetic */ arsq b;

    public arsp(arsq arsq, ByteBuffer byteBuffer) {
        this.b = arsq;
        this.a = byteBuffer;
    }

    public final void run() {
        try {
            this.b.b(this.a.array());
        } catch (IOException e) {
        }
    }
}
