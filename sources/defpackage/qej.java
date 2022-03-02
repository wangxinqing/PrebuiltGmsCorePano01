package defpackage;

import android.accounts.Account;
import com.google.android.gms.common.internal.ClientContext;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: qej  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qej implements qer {
    final /* synthetic */ byte[] a;
    final /* synthetic */ avwm b;
    final /* synthetic */ Collection c;
    final /* synthetic */ Account d;
    final /* synthetic */ qen e;

    public qej(qen qen, byte[] bArr, avwm avwm, Collection collection, Account account) {
        this.e = qen;
        this.a = bArr;
        this.b = avwm;
        this.c = collection;
        this.d = account;
    }

    public final /* bridge */ /* synthetic */ audx a() {
        this.e.d.b();
        qez a2 = this.e.d.a();
        aucd o = arar.j.o();
        qen qen = this.e;
        arbd a3 = qen.a(a2, qlm.a(qen.b));
        if (o.c) {
            o.c();
            o.c = false;
        }
        a3.getClass();
        ((arar) o.b).b = a3;
        auay a4 = auay.a(this.a);
        if (o.c) {
            o.c();
            o.c = false;
        }
        arar arar = (arar) o.b;
        a4.getClass();
        arar.a = a4;
        arar.d = true;
        boolean a5 = this.e.a();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((arar) o.b).c = a5;
        boolean b2 = this.e.b();
        if (o.c) {
            o.c();
            o.c = false;
        }
        arar arar2 = (arar) o.b;
        arar2.e = b2;
        arar2.f = true;
        boolean b3 = axvw.b();
        if (o.c) {
            o.c();
            o.c = false;
        }
        arar arar3 = (arar) o.b;
        arar3.h = b3;
        arar3.g = this.b.a();
        Collection collection = this.c;
        if (o.c) {
            o.c();
            o.c = false;
        }
        arar arar4 = (arar) o.b;
        if (!arar4.i.a()) {
            arar4.i = aucj.a(arar4.i);
        }
        auab.a((Iterable) collection, (List) arar4.i);
        arar arar5 = (arar) o.i();
        try {
            String a6 = this.e.g.a(this.d);
            if (a6 != null) {
                this.e.f.a("auth_token", a6);
                this.e.c();
                qev a7 = this.e.c.a();
                try {
                    qen qen2 = this.e;
                    qeo qeo = qen2.e;
                    ClientContext clientContext = qen2.f;
                    if (qeo.e == null) {
                        qeo.e = baaj.a(baai.UNARY, "google.internal.play.atoms.api.v1.WhApiService/GetDomainFilter", baoq.a(arar.j), baoq.a(araw.m));
                    }
                    araw araw = (araw) qeo.a.a(qeo.e, clientContext, arar5, (long) qeo.b, TimeUnit.MILLISECONDS);
                    a7.a("RouterBackendClient.getDomainFilter.success");
                    return araw;
                } catch (eif e2) {
                    a7.a("RouterBackendClient.getDomainFilter.authFailure");
                    throw new babk(babj.j);
                }
            } else {
                throw new babk(babj.j);
            }
        } catch (qep e3) {
            throw new babk(babj.j);
        }
    }
}
