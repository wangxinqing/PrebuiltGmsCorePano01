package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: asjh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asjh extends asis {
    public static final /* synthetic */ int g = 0;
    public final asjb a;
    public final String b;
    public final arwg c;
    final asit d;
    final arwm e = new asjf(this, "SOPStop");
    public boolean f;
    private final Executor h;
    private final Callable i;
    private ashq n;

    public asjh(asjb asjb, arwg arwg, Executor executor) {
        this.a = asjb;
        this.b = asjb.getClass().getSimpleName();
        this.c = arwg;
        this.h = executor;
        this.f = false;
        this.n = null;
        asgs a2 = a((Class) asjb.c().getClass());
        this.i = new asjc(asjb, a2);
        this.d = new asit(this.b, new asjg("SOPOnStatusUpdate", a2, asjb));
    }

    public final void a() {
        this.c.b();
        if (this.d.g()) {
            this.d.a();
            try {
                this.n = (ashq) this.i.call();
                this.d.b();
                ashq ashq = this.n;
                if (ashq == null) {
                    this.c.c(this.e);
                } else {
                    this.h.execute(new asjd(this, ashq));
                }
            } catch (Exception e2) {
                anih anih = (anih) asil.a.b();
                anih.a((Throwable) e2);
                ((anih) anih.a("asjh", "a", 97, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s ERROR starting operation!", (Object) this.b);
                this.f = true;
                this.d.e();
            }
        }
    }

    public final void b() {
        this.c.b();
        if (!this.d.h()) {
            return;
        }
        if (this.d.f()) {
            this.d.c();
            this.d.d();
        } else if (this.n != null) {
            this.d.c();
            try {
                this.n.a();
            } catch (Exception e2) {
                anih anih = (anih) asil.a.b();
                anih.a((Throwable) e2);
                ((anih) anih.a("asjh", "b", 141, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s ERROR in canceling!", (Object) this.b);
            }
        }
    }

    public final asfz d() {
        aucd o = asfz.d.o();
        String str = this.l;
        if (o.c) {
            o.c();
            o.c = false;
        }
        asfz asfz = (asfz) o.b;
        str.getClass();
        int i2 = asfz.a | 1;
        asfz.a = i2;
        asfz.b = str;
        asfz.c = this.d.a.j;
        asfz.a = i2 | 2;
        return (asfz) o.i();
    }

    public final String toString() {
        String str = this.b;
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.a);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 53 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("SynchronousOperationTask{name='");
        sb.append(str);
        sb.append("', state=");
        sb.append(valueOf);
        sb.append(", operation=");
        sb.append(valueOf2);
        sb.append('}');
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(ashq ashq) {
        try {
            jjg jjg = asil.a;
            ashq.run();
        } catch (Exception e2) {
            anih anih = (anih) asil.a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("asjh", "a", 113, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s ERROR in background job!", (Object) this.b);
            this.f = true;
        }
        this.c.c(this.e);
    }
}
