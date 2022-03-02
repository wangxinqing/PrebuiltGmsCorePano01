package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: epw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class epw {
    public static final fzh a = new epv();
    public final SharedPreferences b;

    public epw(Context context) {
        this.b = context.getSharedPreferences("work_account_owner_uid_prefs", 0);
    }

    public final int a(Account account) {
        if ("com.google.work".equals(account.type)) {
            return this.b.getInt(account.name, -1);
        }
        throw new IllegalArgumentException("not a work account");
    }
}
