package defpackage;

import java.io.Closeable;

/* renamed from: quu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class quu implements Closeable {
    private static final quu a = new quu(false, (qux) null);
    private final boolean b;
    private final qux c;

    private quu(boolean z, qux qux) {
        this.b = z;
        this.c = qux;
    }

    public static quu a(boolean z, quw quw) {
        if (!z || quw == null || Thread.currentThread().isInterrupted()) {
            return a;
        }
        qux qux = new qux(quw.a);
        quu quu = new quu(true, qux);
        try {
            qux.f();
            return quu;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new quv(e);
        }
    }

    public final void close() {
        qux qux;
        if (this.b && (qux = this.c) != null && qux.a()) {
            this.c.b();
        }
    }
}
