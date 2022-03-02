package defpackage;

import android.accounts.Account;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: bsz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bsz {
    public static final bsz a = new bsz("@@ContextManagerNullAccount@@");
    private static bsy c = null;
    public final String b;

    public bsz(String str) {
        iva.c(str);
        this.b = str;
    }

    static synchronized void a(bsy bsy) {
        synchronized (bsz.class) {
            c = bsy;
        }
    }

    public final boolean b() {
        return "@@ContextManagerNullAccount@@".equals(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bsz) {
            return TextUtils.equals(this.b, ((bsz) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }

    public final String toString() {
        return c != null ? bsx.a(this.b) : "#account#";
    }

    public final Account a() {
        return new Account(this.b, "com.google");
    }
}
