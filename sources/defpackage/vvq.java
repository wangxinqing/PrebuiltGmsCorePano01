package defpackage;

import android.accounts.Account;
import android.content.Context;

/* renamed from: vvq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vvq {
    public final Context a;

    public vvq(Context context) {
        this.a = context;
    }

    public static acwa a(agqt agqt) {
        return thr.a(agqt.a(), ayni.h()).b(new vvp(agqt));
    }

    public static agqt a(Context context, Account account) {
        return vvs.a(context).a(account);
    }

    public final acwa a(Account account) {
        return a(a(this.a, account));
    }
}
