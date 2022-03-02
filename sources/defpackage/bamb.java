package defpackage;

import java.io.IOException;
import java.net.Socket;

/* renamed from: bamb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bamb implements batz {
    public final Object a = new Object();
    public final batd b = new batd();
    public final bamc c;
    public boolean d = false;
    public boolean e = false;
    public batz f;
    public Socket g;
    private final balc h;
    private boolean i = false;

    public bamb(balc balc, bamc bamc) {
        amrl.a((Object) balc, (Object) "executor");
        this.h = balc;
        amrl.a((Object) bamc, (Object) "exceptionHandler");
        this.c = bamc;
    }

    public final void a(batd batd, long j) {
        amrl.a((Object) batd, (Object) "source");
        if (!this.i) {
            int i2 = bapg.a;
            synchronized (this.a) {
                this.b.a(batd, j);
                if (!this.d && !this.e && this.b.d() > 0) {
                    this.d = true;
                    this.h.execute(new balx(this));
                    return;
                }
                return;
            }
        }
        throw new IOException("closed");
    }

    public final bauc bu() {
        return bauc.f;
    }

    public final void close() {
        if (!this.i) {
            this.i = true;
            this.h.execute(new balz(this));
        }
    }

    public final void flush() {
        if (!this.i) {
            int i2 = bapg.a;
            synchronized (this.a) {
                if (!this.e) {
                    this.e = true;
                    this.h.execute(new baly(this));
                    return;
                }
                return;
            }
        }
        throw new IOException("closed");
    }
}
