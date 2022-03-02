package defpackage;

import java.io.Closeable;
import java.lang.reflect.Method;

/* renamed from: anmv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anmv implements anmw {
    static final anmv a = new anmv();
    static final Method b;

    static {
        Method method;
        try {
            method = Throwable.class.getMethod("addSuppressed", new Class[]{Throwable.class});
        } catch (Throwable th) {
            method = null;
        }
        b = method;
    }

    public final void a(Closeable closeable, Throwable th, Throwable th2) {
        if (th != th2) {
            try {
                b.invoke(th, new Object[]{th2});
            } catch (Throwable th3) {
                anmu.a.a(closeable, th, th2);
            }
        }
    }
}
