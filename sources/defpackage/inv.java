package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: inv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class inv implements inx {
    public final Context a;
    private acwa b = null;

    public inv(Context context) {
        this.a = context;
    }

    private final synchronized acwa b() {
        if (this.b == null) {
            acwa a2 = acws.a((Executor) jfm.b(10), (Callable) new ins(this));
            this.b = a2;
            a2.a((Executor) aoqm.a, inu.a);
        }
        return this.b;
    }

    public final void a(aogx aogx) {
        if (!awyw.a.a().o()) {
            return;
        }
        if (awyw.a.a().n() || aogx.d.size() != 0) {
            synchronized (this) {
                b().a((Executor) aoqm.a, (acvf) new inr(aogx));
            }
        }
    }

    public final boolean a() {
        return false;
    }
}
