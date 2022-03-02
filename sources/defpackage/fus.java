package defpackage;

import android.accounts.Account;
import android.content.Context;

/* renamed from: fus  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fus extends iby implements fsj {
    private static final ibq a = new ibq("Auth.Api.Identity.Internal.API", l, b);
    private static final ibg b = new ibg();
    private static final ibn l = new fum();

    public fus(Context context, fsi fsi) {
        super(context, a, (ibm) fsi, ibx.a);
    }

    public final void a(String str, Account account, String str2) {
        iva.c(str);
        iva.a((Object) account);
        iva.a((Object) str2);
        iha b2 = ihb.b();
        b2.a = new fud(str2, str, account);
        a(b2.a());
    }

    public final void b(String str, Account account, String str2) {
        iva.c(str);
        iva.a((Object) account);
        iva.a((Object) str2);
        iha b2 = ihb.b();
        b2.a = new fue(str2, str, account);
        a(b2.a());
    }
}
