package defpackage;

import android.accounts.Account;
import java.util.Arrays;

/* renamed from: eku  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eku {
    public final Account a;
    public final String b;
    public final String c;

    public eku(Account account, String str, String str2) {
        this.a = account;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eku) {
            eku eku = (eku) obj;
            if (!ius.a(this.a, eku.a) || !ius.a(this.b, eku.b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
