package defpackage;

import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/* renamed from: qus  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class qus implements Closeable {
    protected final quz a;
    private int b = 0;

    public qus(quz quz) {
        this.a = quz;
    }

    public final synchronized boolean a() {
        return this.b > 0;
    }

    public final synchronized void b() {
        int i = this.b;
        if (i != 0) {
            if (i <= 1) {
                d();
                i = this.b;
            }
            this.b = i - 1;
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean b(long j, TimeUnit timeUnit);

    /* access modifiers changed from: protected */
    public abstract void c();

    public final void close() {
        b();
    }

    /* access modifiers changed from: protected */
    public abstract void d();

    public final synchronized void e() {
        int i = this.b;
        if (i <= 0) {
            c();
            i = this.b;
        }
        this.b = i + 1;
    }

    public final synchronized void finalize() {
        if (this.b > 0) {
            throw new IllegalStateException("Lock wasn't released correctly");
        }
    }

    public final synchronized boolean a(long j, TimeUnit timeUnit) {
        int i = this.b;
        if (i > 0) {
            this.b = i + 1;
            return true;
        } else if (!b(j, timeUnit)) {
            return false;
        } else {
            this.b++;
            return true;
        }
    }
}
