package defpackage;

import com.android.volley.VolleyError;
import java.util.Set;

/* renamed from: ldv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ldv {
    private static final ith a = new ith("AppDataFolderIdUpdater", "");
    private final kkf b;
    private final lnn c;

    public ldv(kkf kkf, lnn lnn) {
        iva.a((Object) kkf);
        this.b = kkf;
        iva.a((Object) lnn);
        this.c = lnn;
    }

    private final void b(khq khq) {
        try {
            String a2 = this.c.a(khq);
            iva.a((Object) a2);
            this.b.d();
            try {
                kmp a3 = this.b.a(khq);
                iva.a((Object) a3);
                iva.b(a3.ai());
                iva.b(a3.w());
                a3.c.b = a2;
                a3.m(false);
                kmd c2 = this.b.c(khq);
                iva.a((Object) c2);
                c2.b();
                c2.t();
                a3.m(true);
                this.b.f();
            } finally {
                this.b.e();
            }
        } catch (eif e) {
            a.b("AppDataFolderIdUpdater", String.format("Failed to retrieve app folder ID for app %s since app is not authorized.", new Object[]{khq.c.b}), (Throwable) e);
            this.b.b(khq.a.b, khq.b);
            throw e;
        }
    }

    public final void a(khq khq) {
        if (this.b.e(khq.a).contains(khq.b)) {
            b(khq);
        }
    }

    public final void a(kkz kkz) {
        Set<String> e = this.b.e(kkz);
        long j = kkz.b;
        for (String a2 : e) {
            try {
                b(this.b.a(j, a2));
            } catch (VolleyError | eif e2) {
            }
        }
    }
}
