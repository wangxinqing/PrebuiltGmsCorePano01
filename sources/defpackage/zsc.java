package defpackage;

import android.accounts.Account;
import android.content.Context;

/* renamed from: zsc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zsc {
    final zsd a;

    static {
        zsg.a("DasherAccountLookup");
    }

    public zsc(Context context) {
        if (!azec.a.a().c()) {
            this.a = new zsh();
        } else {
            this.a = new zse(qub.a(context));
        }
    }

    public final boolean a(Context context) {
        for (Account account : zrr.a(context)) {
            if (account != null && a(account.name)) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(String str) {
        return this.a.a(str);
    }
}
