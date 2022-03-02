package defpackage;

import android.accounts.Account;
import java.util.Arrays;

/* renamed from: hid  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hid implements ibh {
    private final Account a;

    public hid(hic hic) {
        this.a = hic.a;
    }

    public static hic a() {
        return new hic();
    }

    public final Account b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hid) {
            return amqx.a(this.a, ((hid) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
