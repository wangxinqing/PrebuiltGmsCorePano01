package defpackage;

import android.accounts.Account;
import java.util.List;

/* renamed from: aexk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aexk extends awem {
    private final awef b;
    private final awef c;
    private final awef d;
    private final awef e;

    public aexk(bapu bapu, bapu bapu2, awef awef, awef awef2, awef awef3, awef awef4) {
        super(bapu2, awey.a(aexk.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
        this.d = aweu.a(awef3);
        this.e = aweu.a(awef4);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.b.b(), this.c.b(), this.d.b(), this.e.b());
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        aukv aukv;
        List list = (List) obj;
        boolean z = false;
        Account account = (Account) list.get(0);
        aukh aukh = (aukh) list.get(1);
        aevl aevl = (aevl) list.get(2);
        afgh afgh = (afgh) list.get(3);
        if (aukh.a == 2) {
            aukv = (aukv) aukh.b;
        } else {
            aukv = aukv.e;
        }
        auku a = auku.a(aukv.d);
        if (a == null) {
            a = auku.UNKNOWN;
        }
        if (a == auku.SYNC_FULL_SNAPSHOT) {
            z = true;
        }
        amrl.a(z, "Time series sync producer called for wrong %s sync variant.", (Object) a);
        aevm a2 = aevl.a(account, aukv.b, aukv.c);
        afgh.a(a2);
        return aorl.a((Object) a2);
    }
}
