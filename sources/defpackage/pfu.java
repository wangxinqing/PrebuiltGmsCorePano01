package defpackage;

import android.accounts.Account;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: pfu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pfu implements amsv {
    private static final byte[] b = "22".getBytes(amqn.c);
    private static final afhr c;
    public final aelh a;
    private final Executor d;
    private final afhs e;

    static {
        afhq b2 = afhr.b();
        b2.a(b, 1);
        c = b2.a();
    }

    public pfu(Executor executor, afif afif, Account account, aelh aelh) {
        aepj aepj;
        this.d = executor;
        this.a = aelh;
        afhs a2 = afif.a(account, 553, aulx.d);
        this.e = a2;
        if (pba.c()) {
            aepi i = aepj.i();
            aepl c2 = aepm.c();
            c2.a((int) axrs.a.a().i(), TimeUnit.SECONDS);
            i.a(c2.a());
            aepj = i.a();
        } else {
            aepj = aepj.i;
        }
        a2.a(aepj, c);
    }

    public final /* bridge */ /* synthetic */ Object a() {
        return aopr.a(afje.a(this.d, this.e.a(c), b), (amqy) new pft(this), this.d);
    }
}
