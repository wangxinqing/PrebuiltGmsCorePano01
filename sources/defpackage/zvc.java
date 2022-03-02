package defpackage;

import java.util.concurrent.Executor;

/* renamed from: zvc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zvc {
    private static zvc b;
    private final Executor a = jfm.b(9);

    private zvc() {
    }

    public static synchronized zvc a() {
        zvc zvc;
        synchronized (zvc.class) {
            if (b == null) {
                b = new zvc();
            }
            zvc = b;
        }
        return zvc;
    }

    public final void a(Runnable runnable) {
        this.a.execute(runnable);
    }
}
