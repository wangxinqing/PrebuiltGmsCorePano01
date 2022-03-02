package defpackage;

import android.accounts.Account;
import android.os.Bundle;

/* renamed from: epn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class epn implements igp {
    private final Account a;
    private final String b;
    private final Bundle c;

    public epn(Account account, String str, Bundle bundle) {
        this.a = account;
        this.b = str;
        this.c = bundle;
    }

    public final void a(Object obj, Object obj2) {
        ((eph) ((eoh) obj).x()).a(new epd((acwd) obj2), this.a, this.b, this.c);
    }
}
