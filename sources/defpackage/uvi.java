package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/* renamed from: uvi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class uvi implements Closeable {
    public final uvy a;
    public volatile boolean b = false;
    public final PipedInputStream c;
    public final PipedOutputStream d;
    public final uvg e;
    public final uvh f;

    public uvi(uvy uvy, uvh uvh) {
        PipedOutputStream pipedOutputStream;
        PipedInputStream pipedInputStream = new PipedInputStream();
        this.c = pipedInputStream;
        this.a = uvy;
        this.f = uvh;
        try {
            pipedOutputStream = new PipedOutputStream(pipedInputStream);
        } catch (IOException e2) {
            anih anih = (anih) ulh.a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("uvi", "a", 54, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("WifiAwareL2Socket failed to create a PipedOutputStream. All reads will fail.");
            pipedOutputStream = null;
        }
        this.d = pipedOutputStream;
        this.e = new uvg(this);
    }

    private static PipedOutputStream a(PipedInputStream pipedInputStream) {
        try {
            return new PipedOutputStream(pipedInputStream);
        } catch (IOException e2) {
            anih anih = (anih) ulh.a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("uvi", "a", 54, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("WifiAwareL2Socket failed to create a PipedOutputStream. All reads will fail.");
            return null;
        }
    }

    public void close() {
        this.b = true;
        jjt.a((Closeable) this.d);
        jjt.a((Closeable) this.c);
        jjt.a((Closeable) this.e);
        jjg jjg = ulh.a;
    }

    public final void a(byte[] bArr) {
        PipedOutputStream pipedOutputStream = this.d;
        if (pipedOutputStream != null) {
            try {
                pipedOutputStream.write(bArr);
                if (aymi.A()) {
                    this.d.flush();
                }
            } catch (IOException e2) {
                anih anih = (anih) ulh.a.c();
                anih.a((Throwable) e2);
                ((anih) anih.a("uvi", "a", 97, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("WifiAwareL2Socket connected to %s encountered an error when receiving incoming data.", (Object) this.a);
            }
        } else {
            ((anih) ((anih) ulh.a.b()).a("uvi", "a", 87, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("WifiAwareL2Socket failed to process incoming bytes.");
        }
    }
}
