package defpackage;

import java.nio.ByteBuffer;

/* renamed from: bavf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bavf implements Runnable {
    final /* synthetic */ ByteBuffer a;
    final /* synthetic */ bawc b;

    public bavf(bawc bawc, ByteBuffer byteBuffer) {
        this.b = bawc;
        this.a = byteBuffer;
    }

    public final void run() {
        bawc bawc = this.b;
        bawc.c.execute(bawc.a((bawd) new bave(this)));
    }
}
