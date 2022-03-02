package defpackage;

import android.accounts.Account;

/* renamed from: acmq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acmq implements icm {
    final /* synthetic */ Account a;
    final /* synthetic */ acmr b;

    public acmq(acmr acmr, Account account) {
        this.b = acmr;
        this.a = account;
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        wla wla = (wla) icl;
        xfh b2 = wla.b();
        if (b2 != null) {
            if (b2.a() > 0) {
                this.b.a.c.put(this.a.name, wla.b().a(0).d());
                for (acmv a2 : this.b.a.e) {
                    a2.a();
                }
            }
            b2.c();
        }
    }
}
