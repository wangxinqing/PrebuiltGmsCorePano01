package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ashp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ashp extends asis {
    public static final /* synthetic */ int i = 0;
    public final ashj a;
    public final String b;
    public final asit c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final arwg e;
    final asiz f = new ashm(this);
    final asiz g = new ashn(this);
    public final arwm h = new asho(this, "AsynchronousOperation_checkStatusAndStop");
    private final Callable n;

    public ashp(ashj ashj, arwg arwg) {
        this.a = ashj;
        this.b = ashj.getClass().getSimpleName();
        asgs a2 = a((Class) ashj.a().getClass());
        this.e = arwg;
        this.n = new ashk(this, arwg, ashj, a2);
        this.c = new asit(this.b, new ashl(a2, ashj));
    }

    public final void a() {
        this.e.b();
        if (this.c.g()) {
            this.c.a();
            try {
                jjg jjg = asil.a;
                this.n.call();
            } catch (Exception e2) {
                anih anih = (anih) asil.a.b();
                anih.a((Throwable) e2);
                ((anih) anih.a("ashp", "a", 117, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s ERROR starting operation!", (Object) this.b);
                this.c.e();
            }
        }
    }

    public final void b() {
        this.e.b();
        if (!this.c.h()) {
            return;
        }
        if (this.c.f()) {
            this.c.c();
            this.c.d();
        } else if (this.d.get() == 0) {
            ((anih) ((anih) asil.a.c()).a("ashp", "b", 138, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s hasn't been active yet", (Object) this.b);
            c();
        } else {
            this.e.c(this.h);
        }
    }

    public final void c() {
        this.e.b();
        this.c.c();
        try {
            this.a.a(this.g);
        } catch (Exception e2) {
            anih anih = (anih) asil.a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("ashp", "c", 178, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s ERROR in canceling!", (Object) this.b);
            this.c.e();
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
        asfz.c = this.c.a.j;
        asfz.a = i2 | 2;
        return (asfz) o.i();
    }

    public final String toString() {
        String str = this.b;
        String valueOf = String.valueOf(this.c);
        int i2 = this.d.get();
        String str2 = i2 != 0 ? i2 != 1 ? i2 != 2 ? "START_STATE_UNKNOWN" : "START_COMPLETE" : "START_CALLED" : "START_NOT_CALLED";
        String valueOf2 = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 67 + String.valueOf(valueOf).length() + str2.length() + String.valueOf(valueOf2).length());
        sb.append("AsynchronousOperationTask{name='");
        sb.append(str);
        sb.append("', state=");
        sb.append(valueOf);
        sb.append(", hasStarted=");
        sb.append(str2);
        sb.append(", operation=");
        sb.append(valueOf2);
        sb.append('}');
        return sb.toString();
    }
}
