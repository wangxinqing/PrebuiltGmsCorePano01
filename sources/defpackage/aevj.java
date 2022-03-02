package defpackage;

import android.accounts.Account;

/* renamed from: aevj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aevj implements aerj {
    private final awdn a;
    private final aeva b;
    private final aevl c;

    public aevj(awdn awdn, aeva aeva, aevl aevl) {
        this.a = awdn;
        this.b = aeva;
        this.c = aevl;
    }

    public final void a() {
        this.b.a();
        this.c.a();
    }

    public final void a(Account account, aukh aukh) {
        boolean z;
        aukv aukv;
        afdp b2;
        afdp b3;
        if (aukg.a(aukh.a) == aukg.FOOTPRINTS) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z);
        if (aukh.a == 2) {
            aukv = (aukv) aukh.b;
        } else {
            aukv = aukv.e;
        }
        auku auku = auku.UNKNOWN;
        auku a2 = auku.a(aukv.d);
        if (a2 == null) {
            a2 = auku.UNKNOWN;
        }
        int ordinal = a2.ordinal();
        if (ordinal == 1) {
            aevm a3 = this.c.a(account, aukv.b, aukv.c);
            try {
                b2 = a3.c().b();
                a3.b(b2);
                b2.b();
                b2.close();
                if (a3 != null) {
                    a3.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                if (a3 != null) {
                    try {
                        a3.close();
                    } catch (Throwable th2) {
                        apev.a(th, th2);
                    }
                }
                throw th;
            }
        } else if (ordinal != 2) {
            ((aetj) this.a.a()).a(10009, afgq.a(aukh));
            return;
        } else {
            aevc a4 = this.b.a(account, aukv.b, aukv.c);
            try {
                b3 = a4.c().b();
                a4.b(b3);
                b3.b();
                b3.close();
                if (a4 != null) {
                    a4.close();
                    return;
                }
                return;
            } catch (Throwable th3) {
                if (a4 != null) {
                    try {
                        a4.close();
                    } catch (Throwable th4) {
                        apev.a(th3, th4);
                    }
                }
                throw th3;
            }
        }
        throw th;
        throw th;
    }
}
