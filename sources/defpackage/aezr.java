package defpackage;

import android.accounts.Account;

/* renamed from: aezr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aezr implements amqy {
    private final aezu a;
    private final Account b;

    public aezr(aezu aezu, Account account) {
        this.a = aezu;
        this.b = account;
    }

    public final Object a(Object obj) {
        aulm aulm;
        aezu aezu = this.a;
        Account account = this.b;
        Void voidR = (Void) obj;
        synchronized (aezu.f) {
            aulm = (aulm) aezu.b.get(account);
        }
        return aulm;
    }
}
