package defpackage;

import android.accounts.Account;
import java.util.List;

/* renamed from: afbn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afbn extends awem {
    private final awef b;
    private final awef c;
    private final awef d;

    public afbn(bapu bapu, bapu bapu2, awef awef, awef awef2, awef awef3) {
        super(bapu2, awey.a(afbn.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
        this.d = aweu.a(awef3);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.b.b(), this.c.b(), this.d.b());
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        List list = (List) obj;
        Account account = (Account) list.get(0);
        Long l = (Long) list.get(2);
        amzt j = amzy.j();
        for (afdx afdx : ((afeb) list.get(1)).a()) {
            aump d2 = afdx.d();
            if (account.equals(afdx.b()) && d2 != null && afgu.a(d2)) {
                aucd o = aumc.d.o();
                aukh c2 = afdx.c();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aumc aumc = (aumc) o.b;
                c2.getClass();
                aumc.b = c2;
                int i = aumc.a | 1;
                aumc.a = i;
                int i2 = d2.e;
                aumc.a = i | 2;
                aumc.c = i2;
                j.c((aumc) o.i());
            }
        }
        return aorl.a((Object) j.a());
    }
}
