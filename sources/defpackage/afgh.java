package defpackage;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: afgh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afgh implements Closeable {
    private final anmx a = anmx.a();
    private boolean b = false;

    public final RuntimeException a(Throwable th, Class cls) {
        synchronized (this.a) {
            anmx anmx = this.a;
            amrl.a((Object) th);
            anmx.b = th;
            amtb.b(th, IOException.class);
            amtb.b(th, cls);
            throw new RuntimeException(th);
        }
    }

    public final void close() {
        synchronized (this.a) {
            this.a.close();
            this.b = true;
        }
    }

    public final void a(Closeable closeable) {
        amrl.a((Object) closeable, (Object) "Can't register null resource to AsyncCloser!");
        synchronized (this.a) {
            if (!this.b) {
                this.a.a(closeable);
            } else {
                try {
                    closeable.close();
                    e = null;
                } catch (IOException e) {
                    e = e;
                }
                throw new IOException("Can't register Closeable to already closed AsyncCloser!", e);
            }
        }
    }
}
