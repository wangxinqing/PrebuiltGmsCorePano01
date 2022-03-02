package defpackage;

import android.accounts.Account;
import java.util.List;

/* renamed from: afbq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afbq extends awem {
    private final awef b;
    private final awef c;

    public afbq(bapu bapu, bapu bapu2, awef awef, awef awef2) {
        super(bapu2, awey.a(afbq.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.b.b(), this.c.b());
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        List list = (List) obj;
        Account account = (Account) list.get(0);
        aezu aezu = (aezu) list.get(1);
        if (!aezu.e.r()) {
            aucd o = aulm.c.o();
            String str = account.name;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aulm aulm = (aulm) o.b;
            str.getClass();
            aulm.a = 1;
            aulm.b = str;
            return aorl.a((Object) (aulm) o.i());
        }
        synchronized (aezu.f) {
            aulm aulm2 = (aulm) aezu.b.get(account);
            if (aulm2 == null) {
                aorr a = aezu.a();
                return aopr.a(a, (amqy) new aezr(aezu, account), aezu.d);
            }
            aorr a2 = aorl.a((Object) aulm2);
            return a2;
        }
    }
}
