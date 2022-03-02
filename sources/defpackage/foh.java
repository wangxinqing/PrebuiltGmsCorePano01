package defpackage;

import android.accounts.Account;
import android.content.Context;
import java.util.concurrent.ExecutorService;

/* renamed from: foh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class foh implements fcu {
    public final flq a;
    public final Account b;
    public final String c;
    public final String d;
    public final String e;
    private final aoru f = aosd.a((ExecutorService) jfm.b(9));

    public foh(Context context, Account account, String str, String str2, String str3) {
        this.a = flq.a(context);
        this.b = account;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final aorr a(fde fde) {
        return this.f.b(new fog(this));
    }

    public final qbk a() {
        return qbk.AUTH_API_CREDENTIALS_REQUEST_ID_TOKEN;
    }
}
