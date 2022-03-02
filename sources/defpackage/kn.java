package defpackage;

import android.os.Binder;
import android.os.Process;
import java.util.concurrent.Callable;

/* renamed from: kn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kn implements Callable {
    final /* synthetic */ kq a;

    public kn(kq kqVar) {
        this.a = kqVar;
    }

    public final Object call() {
        Throwable th;
        Object obj;
        this.a.e.set(true);
        try {
            Process.setThreadPriority(10);
            obj = this.a.a();
            try {
                Binder.flushPendingCommands();
                this.a.d(obj);
                return obj;
            } catch (Throwable th2) {
                th = th2;
                try {
                    this.a.d.set(true);
                    throw th;
                } catch (Throwable th3) {
                    this.a.d(obj);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            obj = null;
            this.a.d.set(true);
            throw th;
        }
    }
}
