package defpackage;

/* renamed from: acwd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acwd {
    public final acwi a = new acwi();

    public final void a(Exception exc) {
        this.a.a(exc);
    }

    public final void b(Exception exc) {
        acwi acwi = this.a;
        iva.a((Object) exc, (Object) "Exception must not be null");
        synchronized (acwi.a) {
            if (!acwi.c) {
                acwi.c = true;
                acwi.f = exc;
                acwi.b.a((acwa) acwi);
            }
        }
    }

    public final void a(Object obj) {
        this.a.a(obj);
    }

    public final boolean b(Object obj) {
        acwi acwi = this.a;
        synchronized (acwi.a) {
            if (acwi.c) {
                return false;
            }
            acwi.c = true;
            acwi.e = obj;
            acwi.b.a((acwa) acwi);
            return true;
        }
    }
}
