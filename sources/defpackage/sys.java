package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: sys  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sys extends sot {
    public Handler b;
    protected final syr c = new syr(this);
    protected final syq d = new syq(this);
    protected final syo e = new syo(this);

    public sys(svv svv) {
        super(svv);
    }

    public final boolean a(boolean z, boolean z2, long j) {
        return this.d.a(z, z2, j);
    }

    /* access modifiers changed from: protected */
    public final boolean n() {
        return false;
    }

    public final void o() {
        h();
        if (this.b == null) {
            this.b = new qvr(Looper.getMainLooper());
        }
    }
}
