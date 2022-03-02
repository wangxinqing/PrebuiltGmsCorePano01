package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: edi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class edi implements Runnable {
    final /* synthetic */ edj a;
    private byte[] b;

    public edi(edj edj) {
        this.a = edj;
    }

    public final void run() {
        while (true) {
            try {
                this.b = new byte[200];
                int read = this.a.a.read(this.b);
                if (read > 0) {
                    edj edj = this.a;
                    ByteBuffer wrap = ByteBuffer.wrap(this.b, 0, read);
                    for (ecf a2 : (ecf[]) edj.b.a) {
                        a2.a(wrap);
                    }
                }
            } catch (IOException e) {
                anih anih = (anih) edx.a.c();
                anih.a((Throwable) e);
                ((anih) anih.a("edi", "run", 96, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Error reading audio InputStream");
                for (ecf b2 : (ecf[]) this.a.b.a) {
                    b2.b();
                }
                this.a.f();
                return;
            }
        }
    }
}
