package defpackage;

import android.accounts.Account;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* renamed from: sac  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sac {
    public final Executor a;
    public final Executor b;
    public final sbb c;
    public final sbe d;
    public final Account e;
    public final int f;
    public final int g;
    public final Deque h = new ArrayDeque();
    public final WeakHashMap i = new WeakHashMap();

    public sac(Executor executor, Executor executor2, sbb sbb, sbe sbe, Account account, int i2, int i3) {
        this.a = executor;
        this.b = executor2;
        this.c = sbb;
        this.d = sbe;
        this.e = account;
        this.f = i2;
        this.g = i3;
    }

    public static void a(acwd acwd, acwa acwa) {
        if (acwa.b()) {
            acwd.b(acwa.d());
        } else {
            acwd.b(acwa.e());
        }
    }

    public final void a(rzx rzx) {
        synchronized (this.h) {
            if (!this.h.isEmpty()) {
                rzz rzz = (rzz) this.h.getLast();
                rzz.a.add(rzx);
                if (!rzz.b && rzz == rzz.d.h.getFirst()) {
                    rzz.a();
                }
            } else {
                rzx.a();
            }
        }
    }
}
