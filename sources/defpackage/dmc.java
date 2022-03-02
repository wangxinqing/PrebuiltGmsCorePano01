package defpackage;

import java.lang.Thread;

/* renamed from: dmc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dmc implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ dmd a;

    public dmc(dmd dmd) {
        this.a = dmd;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        dpk dpk = this.a.e;
        if (dpk != null) {
            dpk.e("Job execution failed", th);
        }
    }
}
