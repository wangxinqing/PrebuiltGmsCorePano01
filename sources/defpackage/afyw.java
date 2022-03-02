package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;

/* renamed from: afyw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afyw {
    public final agzs a;
    private final Context b;
    private final String c;

    public afyw(Context context, agzs agzs, String str) {
        this.b = context;
        this.a = agzs;
        this.c = str;
    }

    public final Uri a() {
        agzz a2 = ahaa.a(this.b);
        a2.a(this.c);
        return a2.a();
    }

    public final Uri a(Account account) {
        agzz a2 = ahaa.a(this.b);
        a2.a(this.c);
        a2.a(account);
        return a2.a();
    }
}
