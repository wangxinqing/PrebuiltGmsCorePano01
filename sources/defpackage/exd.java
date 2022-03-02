package defpackage;

import android.accounts.Account;
import android.os.Bundle;

/* renamed from: exd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class exd implements ax {
    private final exj a;

    public exd(exj exj) {
        this.a = exj;
    }

    public final void a(Object obj) {
        exj exj = this.a;
        pzd pzd = (pzd) obj;
        int i = pzd.a;
        if (i == -1) {
            Bundle extras = pzd.b.getExtras();
            if (extras == null) {
                return;
            }
            if (extras.containsKey("errorMessage")) {
                String string = extras.getString("errorMessage");
                exj.a.d(string, new Object[0]);
                exj.c.a(ezf.b(string));
            } else if (extras.getBoolean("pickedFromAccountChips", false)) {
                String string2 = extras.getString("authAccount");
                String string3 = extras.getString("accountType");
                eze eze = exj.c;
                eze.h.c(new Account(string2, string3));
            }
        } else if (i == 0) {
            exj.c.a(ezf.a());
        } else if (i == 10) {
            exj.a.d("No account was found and not allowed to add a new one", new Object[0]);
            exj.c.a(ezf.b("No account was found and not allowed to add a new one"));
        }
    }
}
