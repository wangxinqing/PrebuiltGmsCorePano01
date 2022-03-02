package defpackage;

import java.util.concurrent.Executor;

/* renamed from: wkg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class wkg {
    public static jnl a;
    private static final wkg b = a();

    public wkg() {
        a = jnl.a();
    }

    public static wkg a() {
        wkg wkg = b;
        if (wkg != null) {
            return wkg;
        }
        if (jkr.e()) {
            return new wkk();
        }
        if (jkr.d()) {
            return new wkj();
        }
        if (jkr.c()) {
            return new wki();
        }
        if (jkr.b()) {
            return new wkh();
        }
        return new wkg();
    }

    public static Executor c() {
        return jnl.e;
    }

    public final int b() {
        return a.c();
    }

    public final boolean a(Object obj) {
        return a.a(obj);
    }
}
