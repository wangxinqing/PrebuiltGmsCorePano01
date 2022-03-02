package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: pyv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pyv {
    public static final pyv a = new pyv("-", "-", "-");
    private static final Map e = new HashMap();
    public final String b;
    public final String c;
    public final String d;

    private pyv(String str, String str2, String str3) {
        iva.c(str);
        this.b = str;
        iva.c(str2);
        this.c = str2;
        iva.c(str3);
        this.d = str3;
    }

    public static synchronized pyv a(Context context, Account account) {
        synchronized (pyv.class) {
            iva.b("Should not call create() on the main thread.");
            iva.a((Object) context);
            iva.a((Object) account);
            if (e.containsKey(account)) {
                pyv pyv = (pyv) e.get(account);
                return pyv;
            }
            try {
                String f = eim.f(context, account.name);
                if (!TextUtils.isEmpty(f)) {
                    pyv pyv2 = new pyv(account.name, account.type, f);
                    e.put(account, pyv2);
                    return pyv2;
                }
                throw new eif("Invalid account id.");
            } catch (IOException e2) {
                throw new eif("Unable to get account id.");
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pyv) {
            pyv pyv = (pyv) obj;
            return TextUtils.equals(this.b, pyv.b) && TextUtils.equals(this.c, pyv.c) && TextUtils.equals(this.d, pyv.d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d});
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("name", this.b);
        a2.a("type", this.c);
        a2.a("account_id", this.d);
        return a2.toString();
    }

    public final Account a() {
        return new Account(this.b, this.c);
    }
}
