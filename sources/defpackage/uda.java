package defpackage;

import android.accounts.Account;

/* renamed from: uda  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uda implements afht {
    final /* synthetic */ udb a;
    private final Account b;
    private boolean c;

    public uda(udb udb, Account account) {
        this.a = udb;
        this.b = account;
    }

    public final void a() {
        this.c = true;
    }

    public final void a(afhu afhu) {
        this.c = true;
    }

    public final void b() {
        this.c = true;
    }

    public final void c() {
        jjg jjg = tsp.a;
        if (!this.a.r && aymw.r()) {
            udb udb = this.a;
            jfm.b(10).execute(new tuw(udb.e, udb.g, this.b));
        }
        if (this.c) {
            udb udb2 = this.a;
            if (!udb2.a.b(udb2.u)) {
                String str = this.b.name;
                udb udb3 = this.a;
                udb3.a.a(udb3.u, aymt.u());
            } else {
                String str2 = this.b.name;
            }
            this.c = false;
            return;
        }
        String str3 = this.b.name;
    }
}
