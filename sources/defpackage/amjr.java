package defpackage;

import java.util.concurrent.Executor;

/* renamed from: amjr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amjr implements Runnable {
    public aoqa a;
    public Executor b;

    public amjr(aoqa aoqa, Executor executor) {
        amrl.a((Object) aoqa);
        this.a = aoqa;
        amrl.a((Object) executor);
        this.b = executor;
    }

    public final void run() {
        this.a = null;
        this.b = null;
    }
}
