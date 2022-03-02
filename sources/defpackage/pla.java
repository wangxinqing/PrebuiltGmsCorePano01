package defpackage;

import android.accounts.Account;
import android.content.Context;

/* renamed from: pla  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pla {
    private static final aukh a;

    static {
        aucd o = aukh.c.o();
        aucd o2 = aukv.e.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aukv aukv = (aukv) o2.b;
        int i = aukv.a | 1;
        aukv.a = i;
        aukv.b = 553;
        aukv.a = i | 2;
        aukv.c = 158511070;
        auku auku = auku.SYNC_LATEST_PER_SECONDARY_ID;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aukv aukv2 = (aukv) o2.b;
        aukv2.d = auku.e;
        aukv2.a |= 4;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aukh aukh = (aukh) o.b;
        aukv aukv3 = (aukv) o2.i();
        aukv3.getClass();
        aukh.b = aukv3;
        aukh.a = 2;
        a = (aukh) o.i();
    }

    public static void a() {
        if (pxb.a()) {
            pbx a2 = pbx.a();
            try {
                afeb afeb = (afeb) a2.h.a();
                affw affw = (affw) a2.l.a();
                qub a3 = qub.a((Context) a2.a.a());
                phw.g.c("Received privacy bit update request", new Object[0]);
                for (Account account : a3.b()) {
                    try {
                        if (afeb.b("com.google.android.gms", account, a) != null) {
                            affw.a(a, account, true, true);
                        }
                    } catch (afdm | afdy e) {
                        phw.g.e("Failed to notify about privacy bit update", new Object[0]);
                    }
                }
            } catch (RuntimeException e2) {
                pbu.a().a("Failed to notify sync", e2);
            }
        }
    }
}
