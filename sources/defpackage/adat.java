package defpackage;

import android.accounts.Account;
import android.content.Context;
import java.util.Collections;
import java.util.Set;

/* renamed from: adat  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adat {
    private static final anax c = anax.a((Object) 2, (Object) 15);
    public final Account a;
    public final iby b;
    private final Context d;

    public adat(Context context, Account account) {
        iby iby = new iby(context, (short[]) null);
        this.d = context;
        this.a = account;
        this.b = iby;
    }

    public static atyt a(atzo atzo, boolean z, boolean z2, boolean z3) {
        int i;
        aucd o = atyt.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atyt atyt = (atyt) o.b;
        atyt.c = 1;
        int i2 = atyt.a | 2;
        atyt.a = i2;
        int i3 = atzo.l;
        int i4 = i2 | 1;
        atyt.a = i4;
        atyt.b = i3;
        if (!z) {
            i = 4;
        } else {
            i = 3;
        }
        atyt.d = i - 1;
        atyt.a = i4 | 4;
        aucd o2 = atyq.e.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        atyq atyq = (atyq) o2.b;
        int i5 = 1 | atyq.a;
        atyq.a = i5;
        atyq.b = z2;
        int i6 = i5 | 2;
        atyq.a = i6;
        atyq.c = false;
        atyq.a = 4 | i6;
        atyq.d = z3;
        if (o.c) {
            o.c();
            o.c = false;
        }
        atyt atyt2 = (atyt) o.b;
        atyq atyq2 = (atyq) o2.i();
        atyq2.getClass();
        atyt2.e = atyq2;
        atyt2.a |= 8;
        return (atyt) o.i();
    }

    private final boolean b() {
        return azrh.c() && !jix.a(this.d);
    }

    /* access modifiers changed from: package-private */
    public final Set a() {
        return !b() ? Collections.EMPTY_SET : c;
    }

    public final boolean a(Set set) {
        if (b() && set != null && (set.contains(2) || set.contains(15))) {
            return true;
        }
        return false;
    }
}
