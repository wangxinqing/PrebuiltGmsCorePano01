package defpackage;

import android.accounts.Account;
import android.content.Context;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* renamed from: ekz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ekz {
    private final Context a;

    public ekz(Context context) {
        this.a = context;
    }

    public final avpn a(Account account, String str) {
        try {
            avpo a2 = emi.a(this.a, account);
            aucd o = avpm.c.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            avpm avpm = (avpm) o.b;
            a2.getClass();
            avpm.b = a2;
            avpm.a |= 1;
            try {
                return (avpn) gjn.a().a("post", str, (avpm) o.i(), avpn.c).get();
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException("Unable to query account state", e);
            }
        } catch (emh e2) {
            throw new IOException("Couldn't create ClientAuthInfo", e2);
        }
    }

    public final void b(Account account, String str) {
        new ekj(this.a).a(account, new Account(str, account.type));
    }
}
