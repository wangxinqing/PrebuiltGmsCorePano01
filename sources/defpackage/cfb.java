package defpackage;

import com.google.android.gms.awareness.fence.AwarenessFence;
import com.google.android.gms.contextmanager.ContextData;

/* renamed from: cfb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cfb extends bva {
    final /* synthetic */ cfd a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cfb(cfd cfd, String str, Object... objArr) {
        super(str, objArr);
        this.a = cfd;
    }

    public final void a(Exception exc) {
        bxk.a(this.a.c, "getCurrCtxt: read latest (produced) context failed, status = %s", exc.getMessage());
        this.a.j();
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        jtk d = ((ick) obj).d();
        if (d != null) {
            try {
                if (d.a() != 0) {
                    int g = d.b(0).g();
                    cfd cfd = this.a;
                    if (g == cfd.f.c[0]) {
                        cfd.j = d.b(0);
                        new Object[1][0] = this.a.j;
                        d.c();
                        cfd cfd2 = this.a;
                        ContextData contextData = cfd2.j;
                        if (contextData != null) {
                            String d2 = contextData.d();
                            cfd cfd3 = this.a;
                            AwarenessFence a2 = cfd.a(d2, cfd3.c, cfd3.e);
                            if (a2 != null) {
                                new Object[1][0] = a2;
                                this.a.a(a2);
                                return;
                            }
                            this.a.j();
                            return;
                        }
                        cfd2.j();
                        return;
                    }
                }
            } catch (Throwable th) {
                if (d != null) {
                    d.c();
                }
                throw th;
            }
        }
        this.a.j();
        if (d != null) {
            d.c();
        }
    }
}
