package defpackage;

import android.accounts.Account;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: qem  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qem implements qer {
    final /* synthetic */ avwo a;
    final /* synthetic */ Account b;
    final /* synthetic */ qen c;

    public qem(qen qen, avwo avwo, Account account) {
        this.c = qen;
        this.a = avwo;
        this.b = account;
    }

    public final /* bridge */ /* synthetic */ audx a() {
        qez a2 = this.c.d.a();
        byte[] k = a2.a.k();
        if (k.length != 0 || !axuy.a.a().r()) {
            aucd o = arbh.f.o();
            auay a3 = auay.a(k);
            if (o.c) {
                o.c();
                o.c = false;
            }
            a3.getClass();
            ((arbh) o.b).d = a3;
            long a4 = jhg.a(this.c.b);
            if (o.c) {
                o.c();
                o.c = false;
            }
            ((arbh) o.b).c = a4;
            qen qen = this.c;
            arbd a5 = qen.a(a2, qlm.a(qen.b));
            if (o.c) {
                o.c();
                o.c = false;
            }
            a5.getClass();
            ((arbh) o.b).e = a5;
            aucd o2 = arbk.b.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            ((arbk) o2.b).a = true;
            if (o.c) {
                o.c();
                o.c = false;
            }
            arbk arbk = (arbk) o2.i();
            arbk.getClass();
            ((arbh) o.b).a = arbk;
            aucd o3 = arbj.b.o();
            avwo avwo = this.a;
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            ((arbj) o3.b).a = avwo.a();
            if (o.c) {
                o.c();
                o.c = false;
            }
            arbj arbj = (arbj) o3.i();
            arbj.getClass();
            ((arbh) o.b).b = arbj;
            arbh arbh = (arbh) o.i();
            new Object[1][0] = arbh;
            try {
                String a6 = this.c.g.a(this.b);
                if (a6 != null) {
                    this.c.f.a("auth_token", a6);
                    this.c.c();
                    qen qen2 = this.c;
                    qeo qeo = qen2.e;
                    ClientContext clientContext = qen2.f;
                    if (qeo.d == null) {
                        qeo.d = baaj.a(baai.UNARY, "google.internal.play.atoms.api.v1.WhApiService/UpdateUserPrefs", baoq.a(arbh.f), baoq.a(arbi.a));
                    }
                    return (arbi) qeo.a.a(qeo.d, clientContext, arbh, (long) qeo.b, TimeUnit.MILLISECONDS);
                }
                throw new babk(babj.j);
            } catch (eif | qep e) {
                qen.a.a(e, "updateUserPrefs failed", new Object[0]);
                throw new babk(babj.j);
            }
        } else {
            throw new IllegalArgumentException("Client cookie is empty");
        }
    }
}
