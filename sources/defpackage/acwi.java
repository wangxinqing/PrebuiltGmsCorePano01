package defpackage;

import android.app.Activity;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: acwi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acwi extends acwa {
    public final Object a = new Object();
    public final acwc b = new acwc();
    public boolean c;
    public volatile boolean d;
    public Object e;
    public Exception f;

    private final void h() {
        iva.a(!this.c, (Object) "Task is already complete");
    }

    public final acwa a(acvf acvf) {
        return a(acwg.a, acvf);
    }

    public final acwa b(acvf acvf) {
        return b(acwg.a, acvf);
    }

    public final boolean c() {
        return this.d;
    }

    public final Object d() {
        Object obj;
        synchronized (this.a) {
            iva.a(this.c, (Object) "Task is not yet complete");
            if (!this.d) {
                Exception exc = this.f;
                if (exc == null) {
                    obj = this.e;
                } else {
                    throw new acvy(exc);
                }
            } else {
                throw new CancellationException("Task is already canceled.");
            }
        }
        return obj;
    }

    public final Exception e() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    public final void f() {
        synchronized (this.a) {
            if (this.c) {
                this.b.a((acwa) this);
            }
        }
    }

    public final void g() {
        synchronized (this.a) {
            if (!this.c) {
                this.c = true;
                this.d = true;
                this.b.a((acwa) this);
            }
        }
    }

    public final acwa a(acvz acvz) {
        return a(acwg.a, acvz);
    }

    public final acwa b(Executor executor, acvf acvf) {
        acwi acwi = new acwi();
        this.b.a((acwb) new acvj(acwl.a(executor), acvf, acwi));
        f();
        return acwi;
    }

    public final acwa a(Executor executor, acvf acvf) {
        acwi acwi = new acwi();
        this.b.a((acwb) new acvh(acwl.a(executor), acvf, acwi));
        f();
        return acwi;
    }

    public final boolean b() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.c && !this.d && this.f == null) {
                z = true;
            }
        }
        return z;
    }

    public final acwa a(Executor executor, acvz acvz) {
        acwi acwi = new acwi();
        this.b.a((acwb) new acvx(acwl.a(executor), acvz, acwi));
        f();
        return acwi;
    }

    public final void a(acvm acvm) {
        a(acwg.a, acvm);
    }

    public final void a(acvp acvp) {
        a(acwg.a, acvp);
    }

    public final void a(acvs acvs) {
        a(acwg.a, acvs);
    }

    public final void a(acvv acvv) {
        a(acwg.a, acvv);
    }

    public final void a(Activity activity, acvp acvp) {
        acvo acvo = new acvo(acwl.a(acwg.a), acvp);
        this.b.a((acwb) acvo);
        acwh.b(activity).a((acwb) acvo);
        f();
    }

    public final void a(com.google.android.chimera.Activity activity, acvs acvs) {
        acvr acvr = new acvr(acwl.a(acwg.a), acvs);
        this.b.a((acwb) acvr);
        acwh.b(activity).a((acwb) acvr);
        f();
    }

    public final void a(com.google.android.chimera.Activity activity, acvv acvv) {
        acvu acvu = new acvu(acwl.a(acwg.a), acvv);
        this.b.a((acwb) acvu);
        acwh.b(activity).a((acwb) acvu);
        f();
    }

    public final void a(Exception exc) {
        iva.a((Object) exc, (Object) "Exception must not be null");
        synchronized (this.a) {
            h();
            this.c = true;
            this.f = exc;
        }
        this.b.a((acwa) this);
    }

    public final void a(Object obj) {
        synchronized (this.a) {
            h();
            this.c = true;
            this.e = obj;
        }
        this.b.a((acwa) this);
    }

    public final void a(Executor executor, acvm acvm) {
        this.b.a((acwb) new acvl(acwl.a(executor), acvm));
        f();
    }

    public final void a(Executor executor, acvp acvp) {
        this.b.a((acwb) new acvo(acwl.a(executor), acvp));
        f();
    }

    public final void a(Executor executor, acvs acvs) {
        this.b.a((acwb) new acvr(acwl.a(executor), acvs));
        f();
    }

    public final void a(Executor executor, acvv acvv) {
        this.b.a((acwb) new acvu(acwl.a(executor), acvv));
        f();
    }

    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }
}
