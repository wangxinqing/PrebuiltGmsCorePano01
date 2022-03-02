package defpackage;

import java.util.concurrent.ExecutorService;

/* renamed from: ycy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ycy {
    public static final ExecutorService a = qvj.b.a();

    public static void a(Runnable runnable) {
        a.submit(runnable);
    }
}
