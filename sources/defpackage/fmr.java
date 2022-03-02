package defpackage;

import android.accounts.Account;

/* renamed from: fmr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fmr implements amqy {
    private final fnb a;
    private final int b;

    public fmr(fnb fnb, int i) {
        this.a = fnb;
        this.b = i;
    }

    public final Object a(Object obj) {
        fnb fnb = this.a;
        return fnb.b.b(new fmu(fnb, (Account) obj, this.b));
    }
}
