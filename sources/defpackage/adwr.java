package defpackage;

import android.accounts.Account;
import java.util.Arrays;

/* renamed from: adwr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adwr implements ibh {
    public final int a;
    public final int b;
    public final Account c;
    final boolean d;

    public adwr() {
        this(new adwq());
    }

    public final Account b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof adwr)) {
            return false;
        }
        adwr adwr = (adwr) obj;
        if (!ius.a(Integer.valueOf(this.a), Integer.valueOf(adwr.a)) || !ius.a(Integer.valueOf(this.b), Integer.valueOf(adwr.b))) {
            return false;
        }
        Account account = adwr.c;
        return ius.a((Object) null, (Object) null) && ius.a(Boolean.valueOf(this.d), Boolean.valueOf(adwr.d));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), null, Boolean.valueOf(this.d)});
    }

    public adwr(adwq adwq) {
        this.a = adwq.a;
        this.b = 1;
        this.d = true;
        this.c = null;
    }
}
