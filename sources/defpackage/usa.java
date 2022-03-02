package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: usa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class usa extends ull {
    public final usd c;
    public final PipedInputStream d;
    public final PipedOutputStream e;
    public final PipedInputStream f;
    private final tfu g;
    private final ScheduledExecutorService h;
    private final PipedOutputStream i;

    public usa() {
        super("IncomingNfcSocket");
        this.h = tid.a();
        this.d = new PipedInputStream(131070);
        this.f = new PipedInputStream(131070);
        this.c = null;
        this.g = null;
        this.i = a(this.d);
        this.e = a(this.f);
    }

    private static PipedOutputStream a(PipedInputStream pipedInputStream) {
        try {
            return new PipedOutputStream(pipedInputStream);
        } catch (IOException e2) {
            return null;
        }
    }

    public final InputStream a() {
        throw null;
    }

    public final OutputStream b() {
        throw null;
    }

    public final void c() {
        tid.a(this.h, "NearFieldCommunicationSocket.dataExecutor");
        tfu tfu = this.g;
        if (tfu != null) {
            tfu.b();
        }
        usd usd = this.c;
        if (usd != null) {
            usd.close();
        }
        jjt.a((Closeable) this.f);
        jjt.a((Closeable) this.i);
        jjt.a((Closeable) this.d);
        jjt.a((Closeable) this.e);
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        try {
            byte[] a = a(this.c.b());
            int b = this.c.b();
            while (true) {
                urw a2 = this.c.a(new urv(Byte.MIN_VALUE, (byte) 3, (byte) 0, (byte) 0, a, b));
                if (!a2.c()) {
                    a(a2.a);
                    try {
                        if (this.f.available() > 0) {
                            continue;
                        }
                    } catch (IOException e2) {
                    }
                    if (a2.a.length <= 0) {
                        return;
                    }
                } else {
                    jjt.a((Closeable) this);
                    return;
                }
            }
        } catch (IOException e3) {
            anih anih = (anih) ulh.a.c();
            anih.a((Throwable) e3);
            ((anih) anih.a("usa", "d", 122, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("NearFieldCommunicationSocket encountered an error when sending DATA command.");
            jjt.a((Closeable) this);
        }
    }

    public final void a(byte[] bArr) {
        PipedOutputStream pipedOutputStream = this.i;
        if (pipedOutputStream != null) {
            try {
                pipedOutputStream.write(bArr);
                if (aymi.A()) {
                    this.i.flush();
                }
            } catch (IOException e2) {
                anih anih = (anih) ulh.a.c();
                anih.a((Throwable) e2);
                ((anih) anih.a("usa", "a", 140, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("NearFieldCommunicationSocket encountered an error when receiving incoming data.");
            }
        } else {
            ((anih) ((anih) ulh.a.b()).a("usa", "a", 130, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("NearFieldCommunicationSocket failed to process incoming bytes.");
        }
    }

    public usa(usd usd) {
        super(usd.toString());
        this.h = tid.a();
        this.d = new PipedInputStream(131070);
        this.f = new PipedInputStream(131070);
        this.c = usd;
        jjg jjg = ulh.a;
        this.g = tfu.a(new urz(this), aymi.a.a().as(), this.h);
        this.i = a(this.d);
        this.e = a(this.f);
    }

    public final byte[] a(int i2) {
        try {
            if (this.f.available() == 0) {
                return new byte[0];
            }
            byte[] bArr = new byte[i2];
            int read = this.f.read(bArr);
            if (read >= 0) {
                byte[] bArr2 = new byte[read];
                System.arraycopy(bArr, 0, bArr2, 0, read);
                return bArr2;
            }
            jjt.a((Closeable) this);
            return new byte[0];
        } catch (IOException e2) {
            anih anih = (anih) ulh.a.c();
            anih.a((Throwable) e2);
            ((anih) anih.a("usa", "a", 170, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("NearFieldCommunicationSocket encountered an error when reading outgoing data.");
            jjt.a((Closeable) this);
            return new byte[0];
        }
    }
}
