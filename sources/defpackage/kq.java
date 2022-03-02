package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: kq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class kq {
    private static Handler a;
    public final FutureTask c = new ko(this, new kn(this));
    final AtomicBoolean d = new AtomicBoolean();
    final AtomicBoolean e = new AtomicBoolean();
    public volatile int f = 1;

    /* access modifiers changed from: protected */
    public abstract Object a();

    /* access modifiers changed from: protected */
    public void a(Object obj) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void b(Object obj) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final void c(Object obj) {
        if (!this.e.get()) {
            d(obj);
        }
    }

    /* access modifiers changed from: package-private */
    public final void d(Object obj) {
        Handler handler;
        synchronized (kq.class) {
            if (a == null) {
                a = new Handler(Looper.getMainLooper());
            }
            handler = a;
        }
        handler.post(new kp(this, obj));
    }

    public final boolean b() {
        return this.d.get();
    }
}
