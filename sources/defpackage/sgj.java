package defpackage;

import android.accounts.Account;
import java.util.concurrent.Executor;

/* renamed from: sgj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class sgj implements aoqb {
    private final sgp a;

    public sgj(sgp sgp) {
        this.a = sgp;
    }

    public final aorr a(Object obj) {
        sgp sgp = this.a;
        Account account = (Account) obj;
        return aooz.a(aopr.a((aorr) aoqw.c(account != null ? sgp.b.b(slq.PROFILE_SYNC, account) : sgp.b.d(slq.PROFILE_SYNC)), sgm.a, (Executor) aoqm.a), Exception.class, (amqy) new sgn(sgp), (Executor) aoqm.a);
    }
}
