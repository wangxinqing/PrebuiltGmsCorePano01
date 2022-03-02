package defpackage;

import android.os.Process;

/* renamed from: nkr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class nkr implements Runnable {
    private final Runnable a;

    public nkr(Runnable runnable) {
        this.a = runnable;
    }

    public final void run() {
        Runnable runnable = this.a;
        Process.setThreadPriority(10);
        amkz amkz = nku.a;
        amkw a2 = amkz.a.a("common_PhantomFutures", amkz.b, 1, amkz.c);
        try {
            runnable.run();
            if (a2 != null) {
                a2.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
