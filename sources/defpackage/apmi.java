package defpackage;

import android.os.Handler;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* renamed from: apmi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apmi implements Executor, acvp {
    public final iby a;
    public final Queue b = new ArrayDeque();
    public int c = 0;
    private final Handler d;

    public apmi(iby iby) {
        this.a = iby;
        this.d = new qvr(iby.h);
    }

    public final void a(acwa acwa) {
        apmh apmh;
        boolean z;
        synchronized (this.b) {
            if (this.c == 2) {
                apmh = (apmh) this.b.peek();
                if (apmh != null) {
                    z = true;
                } else {
                    z = false;
                }
                iva.a(z);
            } else {
                apmh = null;
            }
            this.c = 0;
        }
        if (apmh != null) {
            apmh.a();
        }
    }

    public final void execute(Runnable runnable) {
        this.d.post(runnable);
    }
}
