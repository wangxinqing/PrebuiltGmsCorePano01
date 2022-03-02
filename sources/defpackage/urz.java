package defpackage;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: urz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class urz implements Runnable {
    private final usa a;

    public urz(usa usa) {
        this.a = usa;
    }

    public final void run() {
        usa usa = this.a;
        try {
            byte[] a2 = usa.a(usa.c.b());
            int b = usa.c.b();
            while (true) {
                urw a3 = usa.c.a(new urv(Byte.MIN_VALUE, (byte) 3, (byte) 0, (byte) 0, a2, b));
                if (!a3.c()) {
                    usa.a(a3.a);
                    try {
                        if (usa.f.available() > 0) {
                            continue;
                        }
                    } catch (IOException e) {
                    }
                    if (a3.a.length <= 0) {
                        return;
                    }
                } else {
                    jjt.a((Closeable) usa);
                    return;
                }
            }
        } catch (IOException e2) {
            anih anih = (anih) ulh.a.c();
            anih.a((Throwable) e2);
            ((anih) anih.a("usa", "d", 122, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("NearFieldCommunicationSocket encountered an error when sending DATA command.");
            jjt.a((Closeable) usa);
        }
    }
}
