package defpackage;

import android.accounts.Account;

/* renamed from: aezy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aezy implements amqy {
    private final aulm a;
    private final aulu b;

    public aezy(aulm aulm, aulu aulu) {
        this.a = aulm;
        this.b = aulu;
    }

    public final Object a(Object obj) {
        aukh aukh;
        aulm aulm = this.a;
        aulu aulu = this.b;
        Account account = (Account) obj;
        aukh aukh2 = aulu.a;
        if (aukh2 != null) {
            aukh = aukh2;
        } else {
            aukh = aukh.c;
        }
        return new aezw(aulm, aukh, account, aulu.d, aulu.e);
    }
}
