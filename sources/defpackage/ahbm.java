package defpackage;

import java.io.Closeable;

/* renamed from: ahbm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahbm implements Closeable {
    public Closeable a;

    private ahbm(Closeable closeable) {
        this.a = closeable;
    }

    public static ahbm a(Closeable closeable) {
        return new ahbm(closeable);
    }

    public final Closeable a() {
        Closeable closeable = this.a;
        this.a = null;
        return closeable;
    }

    public final void close() {
        Closeable closeable = this.a;
        if (closeable != null) {
            closeable.close();
        }
    }
}
