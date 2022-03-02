package defpackage;

import android.accounts.AccountManager;
import android.content.Context;

/* renamed from: wwo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wwo {
    public static final Object a = new Object();
    public static wwo b;
    public final Context c;
    public final AccountManager d;

    public wwo() {
    }

    public wwo(Context context) {
        this.c = context;
        this.d = AccountManager.get(context);
    }
}
