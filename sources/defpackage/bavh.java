package defpackage;

import java.io.IOException;
import java.nio.channels.ReadableByteChannel;

/* renamed from: bavh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bavh implements Runnable {
    final /* synthetic */ bawc a;

    public bavh(bawc bawc) {
        this.a = bawc;
    }

    public final void run() {
        ReadableByteChannel readableByteChannel = this.a.n;
        if (readableByteChannel != null) {
            try {
                readableByteChannel.close();
            } catch (IOException e) {
                apev.a(e);
            }
            this.a.n = null;
        }
    }
}
