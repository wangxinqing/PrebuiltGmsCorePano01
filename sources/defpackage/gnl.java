package defpackage;

import android.accounts.Account;
import android.content.Context;
import java.io.IOException;

/* renamed from: gnl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gnl extends gni {
    private static final iwd a = ehv.a("WebLoginCookieLoader");
    private final Account b;
    private final String[] c;
    private final eiw d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gnl(Context context, Account account, String[] strArr) {
        super(context);
        eiw a2 = eiw.a(context);
        iva.a((Object) account);
        this.b = account;
        this.c = (String[]) iva.a((Object) strArr);
        iva.a((Object) a2);
        this.d = a2;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        try {
            this.d.a(this.b, this.c);
            return true;
        } catch (eiv e) {
            iwd iwd = a;
            String valueOf = String.valueOf(e.a);
            iwd.c(valueOf.length() == 0 ? new String("Found recovery URL: ") : "Found recovery URL: ".concat(valueOf), new Object[0]);
            return false;
        } catch (eif | IOException e2) {
            a.a(e2);
            return false;
        }
    }
}
