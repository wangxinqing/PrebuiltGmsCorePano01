package defpackage;

import android.accounts.Account;

/* renamed from: aezq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aezq implements amqy {
    private final aezu a;
    private final aulm b;

    public aezq(aezu aezu, aulm aulm) {
        this.a = aezu;
        this.b = aulm;
    }

    public final Object a(Object obj) {
        Account account;
        aezu aezu = this.a;
        aulm aulm = this.b;
        Void voidR = (Void) obj;
        synchronized (aezu.f) {
            account = (Account) aezu.a.get(aulm);
        }
        return account;
    }
}
