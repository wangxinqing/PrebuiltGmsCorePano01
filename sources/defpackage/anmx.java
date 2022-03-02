package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: anmx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anmx implements Closeable {
    private static final anmw c = (anmv.b != null ? anmv.a : anmu.a);
    final anmw a;
    public Throwable b;
    private final Deque d = new ArrayDeque(4);

    public anmx(anmw anmw) {
        amrl.a((Object) anmw);
        this.a = anmw;
    }

    public static anmx a() {
        return new anmx(c);
    }

    public final void close() {
        Throwable th = this.b;
        while (!this.d.isEmpty()) {
            Closeable closeable = (Closeable) this.d.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th2) {
                if (th != null) {
                    this.a.a(closeable, th, th2);
                } else {
                    th = th2;
                }
            }
        }
        if (this.b == null && th != null) {
            amtb.b(th, IOException.class);
            throw new AssertionError(th);
        }
    }

    public final RuntimeException a(Throwable th) {
        amrl.a((Object) th);
        this.b = th;
        amtb.b(th, IOException.class);
        throw new RuntimeException(th);
    }

    public final void a(Closeable closeable) {
        if (closeable != null) {
            this.d.addFirst(closeable);
        }
    }
}
