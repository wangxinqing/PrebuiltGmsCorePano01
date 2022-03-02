package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: c  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class c extends f {
    public static final Executor b = new a();
    public static final Executor c = new b();
    private static volatile c d;
    public final f a;
    private final f e;

    private c() {
        e eVar = new e();
        this.e = eVar;
        this.a = eVar;
    }

    public static c a() {
        if (d == null) {
            synchronized (c.class) {
                if (d == null) {
                    d = new c();
                }
            }
        }
        return d;
    }

    public final void a(Runnable runnable) {
        f fVar = this.a;
        e eVar = (e) fVar;
        if (eVar.c == null) {
            synchronized (eVar.a) {
                if (((e) fVar).c == null) {
                    ((e) fVar).c = e.a(Looper.getMainLooper());
                }
            }
        }
        eVar.c.post(runnable);
    }
}
