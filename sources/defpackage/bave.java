package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

/* renamed from: bave  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bave implements bawd {
    final /* synthetic */ bavf a;

    public bave(bavf bavf) {
        this.a = bavf;
    }

    public final void a() {
        int i;
        bavf bavf = this.a;
        ReadableByteChannel readableByteChannel = bavf.b.n;
        if (readableByteChannel != null) {
            i = readableByteChannel.read(bavf.a);
        } else {
            i = -1;
        }
        bavf bavf2 = this.a;
        bawc bawc = bavf2.b;
        ByteBuffer byteBuffer = bavf2.a;
        if (i != -1) {
            bavz bavz = bawc.b;
            bavz.a(new bavv(bavz, bawc.o, byteBuffer));
            return;
        }
        ReadableByteChannel readableByteChannel2 = bawc.n;
        if (readableByteChannel2 != null) {
            readableByteChannel2.close();
        }
        if (bawc.g.compareAndSet(5, 7)) {
            bawc.d();
            bavz bavz2 = bawc.b;
            bavz2.b.execute(new bavx(bavz2, bawc.o));
        }
    }
}
