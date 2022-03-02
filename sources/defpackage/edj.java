package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: edj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class edj implements ecg {
    public final InputStream a;
    public final egi b = new egi(ecf.class);
    private final int c;
    private final int d;
    private final Thread e;
    private boolean f = false;

    public edj(InputStream inputStream, int i, int i2) {
        this.a = inputStream;
        this.c = i;
        this.d = i2;
        Thread thread = new Thread(new edi(this), "AudioModemStreamReader");
        this.e = thread;
        thread.setPriority(-19);
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.d;
    }

    public final boolean c() {
        return this.f;
    }

    public final void d() {
        this.e.interrupt();
        f();
        this.f = false;
        try {
            this.a.close();
        } catch (IOException e2) {
            anih anih = (anih) edx.a.c();
            anih.a((Throwable) e2);
            ((anih) anih.a("edj", "d", 72, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Error closing audio InputStream");
        }
    }

    public final boolean e() {
        return !this.f;
    }

    public final void f() {
        for (ecf a2 : (ecf[]) this.b.a) {
            a2.a();
        }
    }

    public final void a(ecf ecf) {
        this.b.a((Object) ecf);
        if (!this.f) {
            this.f = true;
            this.e.start();
        }
    }

    public final void b(ecf ecf) {
        this.b.b(ecf);
    }
}
