package defpackage;

import android.accounts.Account;
import java.util.Arrays;

/* renamed from: grb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class grb implements ibj, ibl {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public final Account f;

    public grb(String str, int i, String str2, String str3, int i2, Account account) {
        iva.a((Object) str, (Object) "moduleId must not be null");
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = i2;
        this.f = account;
    }

    public static grb a(String str, Account account) {
        iva.c(str);
        return new grb(str, 1, (String) null, (String) null, -1, account);
    }

    public static grb b(String str, Account account) {
        iva.c(str);
        return new grb(str, 0, (String) null, (String) null, -1, account);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            grb grb = (grb) obj;
            return this.b == grb.b && this.e == grb.e && ius.a(this.a, grb.a) && ius.a(this.c, grb.c) && ius.a(this.d, grb.d) && ius.a(this.f, grb.f);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), this.f});
    }
}
