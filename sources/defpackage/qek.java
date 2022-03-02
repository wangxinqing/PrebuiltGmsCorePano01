package defpackage;

import android.accounts.Account;
import com.google.android.gms.common.internal.ClientContext;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: qek  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qek implements qer {
    final /* synthetic */ Collection a;
    final /* synthetic */ Account b;
    final /* synthetic */ qen c;

    public qek(qen qen, Collection collection, Account account) {
        this.c = qen;
        this.a = collection;
        this.b = account;
    }

    public final /* bridge */ /* synthetic */ audx a() {
        this.c.d.b();
        qez a2 = this.c.d.a();
        aucd o = arax.e.o();
        qen qen = this.c;
        arbd a3 = qen.a(a2, qlm.a(qen.b));
        if (o.c) {
            o.c();
            o.c = false;
        }
        a3.getClass();
        ((arax) o.b).a = a3;
        boolean a4 = this.c.a();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((arax) o.b).b = a4;
        boolean b2 = this.c.b();
        if (o.c) {
            o.c();
            o.c = false;
        }
        arax arax = (arax) o.b;
        arax.d = b2;
        Collection collection = this.a;
        if (!arax.c.a()) {
            arax.c = aucj.a(arax.c);
        }
        auab.a((Iterable) collection, (List) arax.c);
        arax arax2 = (arax) o.i();
        try {
            String a5 = this.c.g.a(this.b);
            if (a5 != null) {
                this.c.f.a("auth_token", a5);
                this.c.c();
                qev a6 = this.c.c.a();
                try {
                    qen qen2 = this.c;
                    qeo qeo = qen2.e;
                    ClientContext clientContext = qen2.f;
                    if (qeo.f == null) {
                        qeo.f = baaj.a(baai.UNARY, "google.internal.play.atoms.api.v1.WhApiService/GetIntentFilter", baoq.a(arax.e), baoq.a(araz.c));
                    }
                    araz araz = (araz) qeo.a.a(qeo.f, clientContext, arax2, (long) qeo.b, TimeUnit.MILLISECONDS);
                    a6.a("RouterBackendClient.getIntentFilter.success");
                    return araz;
                } catch (eif e) {
                    a6.a("RouterBackendClient.getIntentFilter.authFailure");
                    throw new babk(babj.j);
                }
            } else {
                throw new babk(babj.j);
            }
        } catch (qep e2) {
            throw new babk(babj.j);
        }
    }
}
