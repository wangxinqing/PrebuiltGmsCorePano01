package defpackage;

import com.android.volley.VolleyError;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: xuy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xuy extends xva {
    private Future d;

    public xuy(xuz xuz, String str) {
        super(xuz, str);
        c();
    }

    private final void c() {
        this.d = ycy.a.submit(new xux(this, this.b));
    }

    public final Object a() {
        b();
        try {
            Object obj = this.d.get();
            a(this.a.a(obj));
            if (!this.c) {
                c();
            }
            return obj;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof VolleyError) {
                throw ((VolleyError) cause);
            } else if (cause instanceof eif) {
                throw ((eif) cause);
            } else {
                throw new RuntimeException("Execution failed.", e);
            }
        }
    }
}
