package defpackage;

import android.accounts.Account;
import android.content.Context;

/* renamed from: fir  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fir implements fcu {
    private final Context a;
    private final String b;
    private final Account c;

    public fir(Context context, String str, Account account) {
        iva.a((Object) context);
        this.a = context;
        iva.c(str);
        this.b = str;
        iva.a((Object) account);
        this.c = account;
    }

    public final aorr a(fde fde) {
        if (awon.a.a().a()) {
            jgu.a(this.a, this.b, this.c);
        }
        return aorl.a((Object) null);
    }

    public final qbk a() {
        return qbk.AUTH_API_CREDENTIALS_INTERNAL_UPDATE_DEFAULT_ACCOUNT;
    }
}
