package defpackage;

import android.accounts.Account;

/* renamed from: agtn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class agtn implements amsv {
    private final agtt a;
    private final agny b;
    private final Account c;

    public agtn(agtt agtt, agny agny, Account account) {
        this.a = agtt;
        this.b = agny;
        this.c = account;
    }

    public final Object a() {
        agtt agtt = this.a;
        agny agny = this.b;
        Account account = this.c;
        if (aygo.b()) {
            return agtt.d.a(agny, account, aygo.c());
        }
        return agtt.d.a(agny, account);
    }
}
