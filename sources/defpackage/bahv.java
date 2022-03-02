package defpackage;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: bahv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bahv implements azyw, bals {
    public final baho a;
    public final ScheduledExecutorService b;
    public final azyv c;
    public final azxj d;
    public final babq e;
    public final bahp f;
    public volatile List g;
    public final amsn h;
    public babp i;
    public final Collection j = new ArrayList();
    public final baha k = new bahc(this);
    public baep l;
    public volatile bajo m;
    public volatile azya n = azya.a(azxz.IDLE);
    public babj o;
    public bagd p;
    private final azyx q;
    private final String r;
    private final String s;
    private final baek t;
    private final bads u;

    public bahv(List list, String str, String str2, baek baek, ScheduledExecutorService scheduledExecutorService, babq babq, baho baho, azyv azyv, bads bads, badu badu, azyx azyx, azxj azxj) {
        amrl.a((Object) list, (Object) "addressGroups");
        amrl.a(!list.isEmpty(), (Object) "addressGroups is empty");
        a(list, "addressGroups contains null entry");
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.g = unmodifiableList;
        this.f = new bahp(unmodifiableList);
        this.r = str;
        this.s = str2;
        this.t = baek;
        this.b = scheduledExecutorService;
        this.h = amsn.a();
        this.e = babq;
        this.a = baho;
        this.c = azyv;
        this.u = bads;
        amrl.a((Object) badu, (Object) "channelTracer");
        amrl.a((Object) azyx, (Object) "logId");
        this.q = azyx;
        amrl.a((Object) azxj, (Object) "channelLogger");
        this.d = azxj;
    }

    public static final String b(babj babj) {
        StringBuilder sb = new StringBuilder();
        sb.append(babj.r);
        if (babj.s != null) {
            sb.append("(");
            sb.append(babj.s);
            sb.append(")");
        }
        return sb.toString();
    }

    public final azyx b() {
        return this.q;
    }

    public final void c() {
        boolean z;
        azyp azyp;
        this.e.b();
        if (this.i == null) {
            z = true;
        } else {
            z = false;
        }
        amrl.b(z, (Object) "Should have no reconnectTask scheduled");
        bahp bahp = this.f;
        if (bahp.b == 0 && bahp.c == 0) {
            amsn amsn = this.h;
            amsn.c();
            amsn.d();
        }
        SocketAddress b2 = this.f.b();
        if (b2 instanceof azyp) {
            azyp azyp2 = (azyp) b2;
            azyp = azyp2;
            b2 = azyp2.b;
        } else {
            azyp = null;
        }
        bahp bahp2 = this.f;
        azxa azxa = ((azyj) bahp2.a.get(bahp2.b)).c;
        String str = (String) azxa.a(azyj.a);
        baej baej = new baej();
        if (str == null) {
            str = this.r;
        }
        amrl.a((Object) str, (Object) "authority");
        baej.a = str;
        amrl.a((Object) azxa, (Object) "eagAttributes");
        baej.b = azxa;
        baej.c = this.s;
        baej.d = azyp;
        bahu bahu = new bahu();
        bahu.a = this.q;
        bahn bahn = new bahn(this.t.a(b2, baej, bahu), this.u);
        bahu.a = bahn.b();
        azyv.a(this.c.e, bahn);
        this.l = bahn;
        this.j.add(bahn);
        Runnable a2 = bahn.a((bajn) new baht(this, bahn));
        if (a2 != null) {
            this.e.a(a2);
        }
        this.d.a(2, "Started transport {0}", bahu.a);
    }

    public final void d() {
        this.e.execute(new bahi(this));
    }

    public final void e() {
        this.e.b();
        babp babp = this.i;
        if (babp != null) {
            babp.a();
            this.i = null;
            this.p = null;
        }
    }

    public final String toString() {
        amrg a2 = amrh.a((Object) this);
        a2.a("logId", this.q.a);
        a2.a("addressGroups", (Object) this.g);
        return a2.toString();
    }

    public static void a(List list, String str) {
        for (Object a2 : list) {
            amrl.a(a2, (Object) str);
        }
    }

    public final baei a() {
        bajo bajo = this.m;
        if (bajo != null) {
            return bajo;
        }
        this.e.execute(new bahe(this));
        return null;
    }

    public final void a(azxz azxz) {
        this.e.b();
        a(azya.a(azxz));
    }

    public final void a(azya azya) {
        boolean z;
        this.e.b();
        if (this.n.a != azya.a) {
            if (this.n.a != azxz.SHUTDOWN) {
                z = true;
            } else {
                z = false;
            }
            String valueOf = String.valueOf(azya);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
            sb.append("Cannot transition out of SHUTDOWN to ");
            sb.append(valueOf);
            amrl.b(z, (Object) sb.toString());
            this.n = azya;
            baho baho = this.a;
            baji baji = baho.a.i;
            if (azya.a == azxz.TRANSIENT_FAILURE || azya.a == azxz.IDLE) {
                baji.k();
            }
            amrl.b(true, (Object) "listener is null");
            baho.b.a(azya);
        }
    }

    public final void a(babj babj) {
        this.e.execute(new bahh(this, babj));
    }

    public final void a(baep baep, boolean z) {
        this.e.execute(new bahj(this, baep, z));
    }
}
