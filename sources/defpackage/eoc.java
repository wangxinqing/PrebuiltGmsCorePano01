package defpackage;

import android.accounts.Account;
import android.content.Context;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: eoc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eoc implements enu {
    private final Set a = new HashSet(Arrays.asList(new enx[]{eqb.a, eqb.d, eqb.o}));
    private final ekl b;

    public eoc(Context context) {
        ekl ekl = new ekl(context);
        this.b = ekl;
    }

    public final void a(eny eny, Account account, enx enx, Object obj) {
        if (this.a.contains(enx)) {
            ekl.a.c("OnDataChanged check: %s", iwd.a((Object) account));
            this.b.a(eny, account);
        }
    }
}
