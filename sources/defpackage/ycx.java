package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.chimera.FragmentTransaction;

/* renamed from: ycx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ycx {
    public static anax a(Context context) {
        anax c = c(context);
        return c == null ? anfv.a : c;
    }

    public static anax b(Context context) {
        anax d = d(context);
        return d == null ? anfv.a : d;
    }

    public static synchronized anax c(Context context) {
        anax anax;
        synchronized (ycx.class) {
            anax<Account> d = d(context);
            if (d != null) {
                anav j = anax.j();
                for (Account account : d) {
                    j.b(account.name);
                }
                anax = j.a();
            } else {
                anax = null;
            }
        }
        return anax;
    }

    public static synchronized anax d(Context context) {
        anax a;
        synchronized (ycx.class) {
            a();
            anav j = anax.j();
            for (Account account : qub.a(context).a("com.google")) {
                if (!TextUtils.isEmpty(account.name)) {
                    j.b(account);
                }
            }
            a = j.a();
        }
        return a;
    }

    public static synchronized Account a(Context context, String str) {
        synchronized (ycx.class) {
            a();
            for (Account account : qub.a(context).a("com.google")) {
                if (!TextUtils.isEmpty(account.name) && TextUtils.equals(str, account.name)) {
                    return account;
                }
            }
            return null;
        }
    }

    private static void a() {
        if (aywv.c() && ycm.f.nextDouble() < aywv.d()) {
            aucd o = xod.c.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            xod xod = (xod) o.b;
            xod.b = 2;
            xod.a |= 1;
            xod xod2 = (xod) o.i();
            aucd o2 = xol.w.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            xol xol = (xol) o2.b;
            xod2.getClass();
            xol.p = xod2;
            xol.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
            wmm.a();
            wmm.a((String) null, o2);
        }
    }
}
