package defpackage;

import android.accounts.Account;
import android.content.SharedPreferences;
import android.text.TextUtils;

/* renamed from: qlc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qlc {
    private static final qfn b = new qfn("AccountPreferences");
    public final SharedPreferences a;
    private final qub c;

    public qlc(qub qub, SharedPreferences sharedPreferences) {
        this.c = qub;
        this.a = sharedPreferences;
    }

    public final Account a() {
        String string = this.a.getString("accountName", (String) null);
        if (!TextUtils.isEmpty(string)) {
            for (Account account : d()) {
                if (string.equals(account.name)) {
                    return account;
                }
            }
            b();
            b.a("Opted-in account removed from device. Starting fresh", new Object[0]);
        }
        return null;
    }

    public final void b() {
        this.a.edit().remove("accountName").apply();
    }

    public final Account c() {
        Account a2 = a();
        if (a2 != null) {
            return a2;
        }
        Account[] d = d();
        if (d == null || d.length <= 0) {
            return null;
        }
        return d[0];
    }

    public final Account[] d() {
        return this.c.a("com.google");
    }

    public final void a(String str) {
        this.a.edit().putString("accountName", str).apply();
    }
}
