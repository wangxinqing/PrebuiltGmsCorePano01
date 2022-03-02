package defpackage;

import android.accounts.Account;
import android.content.Context;
import java.io.IOException;

/* renamed from: shg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class shg {
    public final Context a;
    public final afji b;

    public shg(Context context, afji afji) {
        this.a = context;
        this.b = afji;
    }

    public final String a(Account account) {
        try {
            return eim.f(this.a, account.name);
        } catch (eif | IOException e) {
            anie b2 = this.b.b();
            b2.a(e);
            ((anih) ((anih) b2).a("shg", "a", 43, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to convert account to obfuscated Gaia id!");
            return null;
        } catch (RuntimeException e2) {
            anie c = this.b.c();
            c.a((Throwable) e2);
            ((anih) ((anih) c).a("shg", "a", 46, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to convert account to obfuscated Gaia id!");
            return null;
        }
    }
}
