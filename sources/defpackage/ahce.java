package defpackage;

import java.io.Closeable;

/* renamed from: ahce  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahce implements Closeable {
    private final Closeable a;
    private final Closeable b;
    private final Closeable c;

    public ahce(Closeable closeable, Closeable closeable2, Closeable closeable3) {
        this.a = closeable;
        this.b = closeable2;
        this.c = closeable3;
    }

    public final void close() {
        Closeable closeable = this.a;
        Closeable closeable2 = this.b;
        Closeable closeable3 = this.c;
        if (closeable3 != null) {
            try {
                closeable3.close();
            } catch (Throwable th) {
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (Throwable th2) {
                        apev.a(th, th2);
                    }
                }
                throw th;
            }
        }
        if (closeable2 != null) {
            closeable2.close();
        }
        if (closeable != null) {
            closeable.close();
            return;
        }
        return;
        throw th;
    }
}
