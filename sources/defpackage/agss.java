package defpackage;

import android.accounts.Account;
import java.util.HashMap;
import java.util.Map;

/* renamed from: agss  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agss {
    private final aekn a;
    private final amsv b;
    private final Map c = new HashMap();
    private final Map d = new HashMap();
    private final agop e;
    private final int f;

    public agss(int i, aekn aekn, agop agop, amsv amsv) {
        this.f = i;
        this.a = aekn;
        this.e = agop;
        this.b = amsv;
    }

    public final agos a(agny agny, Account account) {
        agos agos;
        amrj a2 = amrj.a(agny, account);
        synchronized (this.c) {
            agos = (agos) this.c.get(a2);
            if (agos == null) {
                long longValue = ((Long) this.b.a()).longValue();
                agny agny2 = agny;
                agos agos2 = new agos(agny2, this.f, new agoq(this.e, account), afjn.a(this.a, account.toString(), aoog.b(longValue)), false);
                this.c.put(a2, agos2);
                agos = agos2;
            }
        }
        return agos;
    }

    public final agos a(agny agny, Account account, boolean z) {
        agos agos;
        amrj a2 = amrj.a(agny, account);
        synchronized (this.d) {
            agos = (agos) this.d.get(a2);
            if (agos == null) {
                long longValue = ((Long) this.b.a()).longValue();
                agos = agos.a(agny, this.f, this.e, account, afjn.b(this.a, account.toString(), aoog.b(longValue)), z);
                this.d.put(a2, agos);
            }
        }
        return agos;
    }
}
