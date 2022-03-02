package defpackage;

import android.accounts.Account;

/* renamed from: aciy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aciy implements igp {
    private final Account[] a;

    public aciy(Account[] accountArr) {
        this.a = accountArr;
    }

    public final void a(Object obj, Object obj2) {
        Account[] accountArr = this.a;
        acix acix = (acix) obj;
        acjp acjp = new acjp((acwd) obj2, acjg.a);
        acix.w();
        ((acjv) acix.x()).a((acjs) new aciu(acjp), accountArr);
    }
}
