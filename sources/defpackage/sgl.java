package defpackage;

import android.accounts.Account;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: sgl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class sgl implements Callable {
    private final sgp a;
    private final String b;

    public sgl(sgp sgp, String str) {
        this.a = sgp;
        this.b = str;
    }

    public final Object call() {
        String str;
        Account account;
        sgp sgp = this.a;
        String str2 = this.b;
        shf shf = sgp.d;
        Iterator it = ((List) shf.a.a()).iterator();
        do {
            str = null;
            if (!it.hasNext()) {
                return null;
            }
            account = (Account) it.next();
            shg shg = shf.b;
            try {
                str = eim.f(shg.a, account.name);
            } catch (eif | IOException e) {
                anie b2 = shg.b.b();
                b2.a(e);
                ((anih) ((anih) b2).a("shg", "a", 43, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to convert account to obfuscated Gaia id!");
            } catch (RuntimeException e2) {
                anie c = shg.b.c();
                c.a((Throwable) e2);
                ((anih) ((anih) c).a("shg", "a", 46, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to convert account to obfuscated Gaia id!");
            }
        } while (!str2.equals(str));
        return account;
    }
}
