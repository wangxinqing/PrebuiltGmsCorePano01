package defpackage;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.MdhBroadcastListenerKey;

/* renamed from: pcw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pcw implements pjn {
    private final aepw a;
    private final Account b;
    private final aukh c;
    private final ifu d;

    public pcw(aepx aepx, MdhBroadcastListenerKey mdhBroadcastListenerKey, String str, ifu ifu) {
        try {
            aeps a2 = pct.a(str, mdhBroadcastListenerKey);
            aepp aepp = (aepp) aepx.a.a();
            aepx.a(aepp, 1);
            aepx.a(a2, 2);
            this.a = new aepw(aepp, a2);
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
