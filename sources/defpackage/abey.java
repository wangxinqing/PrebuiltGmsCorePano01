package defpackage;

import android.accounts.Account;
import java.util.Arrays;

/* renamed from: abey  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abey {
    private final Account a;
    private final String b;

    public abey(String str, Account account) {
        this.b = str;
        this.a = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof abey) {
            abey abey = (abey) obj;
            if (!amqx.a(this.a, abey.a) || !amqx.a(this.b, abey.b)) {
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
