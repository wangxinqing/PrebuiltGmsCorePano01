package defpackage;

import android.accounts.Account;
import java.util.concurrent.Executor;

/* renamed from: sgx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class sgx implements aoqb {
    private final shb a;

    public sgx(shb shb) {
        this.a = shb;
    }

    public final aorr a(Object obj) {
        String str;
        shb shb = this.a;
        afus afus = (afus) obj;
        aqvr aqvr = afus.b;
        if (aqvr == null) {
            aqvr = aqvr.b;
        }
        amgp a2 = afxn.a(aqvr);
        if (a2 != null) {
            str = a2.e;
        } else {
            str = "";
        }
        afvj afvj = shb.b;
        Account account = shb.a;
        afva afva = (afva) afvj;
        aflk aflk = afva.a;
        afki e = afkj.e();
        e.a(true);
        return aopr.a(aopr.a(afva.a(aflk.a(e.a()), "File group search failed"), (aoqb) new afut(afva, account, str), (Executor) aoqm.a), (amqy) new sha(afus), (Executor) aoqm.a);
    }
}
