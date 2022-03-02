package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: babr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class babr extends azyc {
    static final ThreadLocal a = new ThreadLocal();
    private static final Logger b = Logger.getLogger(babr.class.getName());

    public final azyd a() {
        azyd azyd = (azyd) a.get();
        return azyd == null ? azyd.b : azyd;
    }

    public final azyd a(azyd azyd) {
        azyd a2 = a();
        a.set(azyd);
        return a2;
    }

    public final void a(azyd azyd, azyd azyd2) {
        if (a() != azyd) {
            b.logp(Level.SEVERE, "io.grpc.ThreadLocalContextStorage", "detach", "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (azyd2 == azyd.b) {
            a.set((Object) null);
        } else {
            a.set(azyd2);
        }
    }
}
