package defpackage;

import java.util.concurrent.Executor;

/* renamed from: wro  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wro {
    private static wro b;
    private final Executor a = jfm.b(9);

    private wro() {
    }

    public static wro a() {
        synchronized (wro.class) {
            if (b == null) {
                b = new wro();
            }
        }
        return b;
    }

    public final void a(Runnable runnable) {
        this.a.execute(runnable);
    }
}
