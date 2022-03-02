package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.DataChannel;

/* renamed from: usx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class usx extends ull {
    public final DataChannel c;
    public final Object d = new Object();
    public final PipedInputStream e;
    public final PipedOutputStream f;
    public final OutputStream g = new usw(this);
    private final AtomicBoolean h = new AtomicBoolean(false);

    public usx(String str, DataChannel dataChannel) {
        super(str);
        this.c = dataChannel;
        this.e = new PipedInputStream();
        this.f = new PipedOutputStream(this.e);
    }

    public final InputStream a() {
        throw null;
    }

    public final OutputStream b() {
        throw null;
    }

    public final void c() {
        if (!e()) {
            this.h.set(true);
            jjt.a((Closeable) this.f);
            jjt.a((Closeable) this.e);
            DataChannel dataChannel = this.c;
            dataChannel.b();
            dataChannel.nativeClose();
            d();
            ((anih) ((anih) ulh.a.d()).a("usx", "c", 110, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Closed WebRTC socket.");
        }
    }

    public final void d() {
        synchronized (this.d) {
            this.d.notifyAll();
        }
    }

    public final boolean e() {
        return this.h.get();
    }

    public final void a(byte[] bArr) {
        try {
            this.f.write(bArr);
            this.f.flush();
        } catch (IOException e2) {
            anih anih = (anih) ulh.a.c();
            anih.a((Throwable) e2);
            ((anih) anih.a("usx", "a", 118, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to write to WebRtcSocket pipe.");
            c();
        }
    }
}
