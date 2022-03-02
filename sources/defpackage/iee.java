package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: iee  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iee extends idk {
    public final ob a = new ob();
    private ifn f;

    private iee(ify ify) {
        super(ify);
        this.e.a("ConnectionlessLifecycleHelper", (LifecycleCallback) this);
    }

    public static void a(ify ify, ifn ifn, ida ida) {
        iee iee = (iee) ify.a("ConnectionlessLifecycleHelper", iee.class);
        if (iee == null) {
            iee = new iee(ify);
        }
        iee.f = ifn;
        iva.a((Object) ida, (Object) "ApiKey cannot be null");
        iee.a.add(ida);
        ifn.a(iee);
    }

    private final void g() {
        if (!this.a.isEmpty()) {
            this.f.a(this);
        }
    }

    public final void b() {
        super.b();
        ifn ifn = this.f;
        synchronized (ifn.f) {
            if (ifn.m == this) {
                ifn.m = null;
                ifn.n.clear();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void c() {
        this.f.b();
    }

    public final void e() {
        g();
    }

    public final void a() {
        super.a();
        g();
    }

    /* access modifiers changed from: protected */
    public final void a(ConnectionResult connectionResult, int i) {
        this.f.b(connectionResult, i);
    }
}
