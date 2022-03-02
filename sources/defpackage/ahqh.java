package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: ahqh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahqh implements Runnable {
    final /* synthetic */ ByteBuffer a;
    final /* synthetic */ ahqj b;

    public ahqh(ahqj ahqj, ByteBuffer byteBuffer) {
        this.b = ahqj;
        this.a = byteBuffer;
    }

    public final void run() {
        try {
            this.b.b(this.a.array());
        } catch (IOException e) {
        }
    }
}
