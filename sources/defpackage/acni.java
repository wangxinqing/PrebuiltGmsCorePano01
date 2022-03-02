package defpackage;

import android.accounts.Account;
import java.util.Arrays;

/* renamed from: acni  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acni {
    public final Account a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;

    public acni(Account account, int i, int i2, int i3, boolean z) {
        this.a = account;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof acni) {
            acni acni = (acni) obj;
            if (this.b == acni.b && this.c == acni.c && this.d == acni.d && this.e == acni.e && amqx.a(this.a, acni.a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e)});
    }
}
