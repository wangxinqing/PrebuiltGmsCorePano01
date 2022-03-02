package defpackage;

import android.accounts.Account;

/* renamed from: eyw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class eyw implements ow {
    private final ezb a;

    public eyw(ezb ezb) {
        this.a = ezb;
    }

    public final Object a() {
        ezb ezb = this.a;
        fsj fsj = ezb.h;
        eze eze = ezb.b;
        fsj.a(eze.c, (Account) eze.h.b(), ezb.b.d.c);
        return fce.b(qct.UPDATE_DEFAULT_GOOGLE_ACCOUNT);
    }
}
