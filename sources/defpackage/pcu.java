package defpackage;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.MdhBroadcastListenerKey;
import com.google.android.gms.mdh.MdhBroadcastListenerParams;

/* renamed from: pcu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pcu implements pjn {
    private final aepu a;
    private final Account b;
    private final aukh c;
    private final ifu d;

    public pcu(aepv aepv, MdhBroadcastListenerKey mdhBroadcastListenerKey, MdhBroadcastListenerParams mdhBroadcastListenerParams, String str, ifu ifu) {
        aept aept;
        try {
            aeps a2 = pct.a(str, mdhBroadcastListenerKey);
            LatestFootprintFilter latestFootprintFilter = mdhBroadcastListenerParams.a;
            if (latestFootprintFilter == null) {
                aept = aept.a((aukf) null);
            } else {
                aept = aept.a(aeuz.a(pga.a(latestFootprintFilter)));
            }
            aepp aepp = (aepp) aepv.a.a();
            aepv.a(aepp, 1);
            aepv.a(a2, 2);
            aepv.a(aept, 3);
            this.a = new aepu(aepp, a2, aept);
            this.b = mdhBroadcastListenerKey.b;
            this.c = a2.c();
            this.d = ifu;
        } catch (auda | NullPointerException e) {
            throw new aepg(3, "Exception occurred while parsing subscription key.", e);
        }
    }

    public final aukh a() {
        return this.c;
    }

    public final pcp b() {
        return pcp.READ;
    }

    public final Account c() {
        return this.b;
    }

    public final boolean d() {
        return true;
    }

    public final void e() {
        try {
            this.a.a();
            this.d.a(Status.a);
        } catch (aepg e) {
            this.d.a(pku.a(getClass().getSimpleName(), e));
        }
    }

    public final void a(Status status) {
        this.d.a(status);
    }
}
