package defpackage;

import android.accounts.Account;
import android.content.Context;

/* renamed from: fim  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fim implements fcu {
    private final Context a;
    private final String b;
    private final Account c;

    public fim(Context context, String str, Account account) {
        iva.a((Object) context);
        this.a = context;
        iva.c(str);
        this.b = str;
        iva.a((Object) account);
        this.c = account;
    }

    public final aorr a(fde fde) {
        int i = jhg.i(this.a, this.b);
        if (i != -1) {
            gck a2 = pzx.a(this.a);
            qah a3 = qah.a(this.c, (Iterable) qah.a);
            a3.a(5);
            a3.a(this.b, i);
            a3.a(gda.GRANTED);
            if (gei.SUCCESS.equals(a2.a(a3.a()).b())) {
                return aorl.a((Object) null);
            }
            qbe a4 = qbf.a();
            a4.c = 28404;
            a4.a = "Failed to record grants on server";
            throw a4.a();
        }
        throw qbf.a(28442);
    }

    public final qbk a() {
        return qbk.AUTH_API_CREDENTIALS_INTERNAL_RECORD_GRANTS;
    }
}
