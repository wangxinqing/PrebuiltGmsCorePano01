package defpackage;

import android.accounts.Account;
import android.os.Bundle;

/* renamed from: acmr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acmr implements ica {
    final /* synthetic */ acmw a;

    public acmr(acmw acmw) {
        this.a = acmw;
    }

    public final void a(int i) {
        acmw.a.b("connection to people API suspended", new Object[0]);
    }

    public final void g(Bundle bundle) {
        acmw.a.b("connected to people API", new Object[0]);
        for (Account account : this.a.f.a("com.google")) {
            ibq ibq = wlt.a;
            xco.a(this.a.b, account.name, (String) null).a((icm) new acmq(this, account));
            xdh.b(this.a.b, account.name, 1, 0).a((icm) new acmu(this.a, account.name));
        }
    }
}
