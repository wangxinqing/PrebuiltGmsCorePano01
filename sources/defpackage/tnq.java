package defpackage;

import java.io.IOException;

/* renamed from: tnq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tnq {
    private final tph a;
    private final tnp b = new tnp();

    public tnq(tph tph) {
        this.a = tph;
    }

    private static void a(String str, tnm tnm, aurx aurx) {
        ((anih) tky.a.d()).a("EndpointChannelManager encrypted channel of type %s to endpoint %s", (Object) tnm.a(), (Object) str);
        tnm.a(aurx);
    }

    private final void c(tlh tlh, String str, tnm tnm) {
        if (this.b.a(str) != null) {
            a(str, tnm, this.b.a(str));
        }
        tnm.a(tlh.f, str);
        tnp tnp = this.b;
        tno tno = (tno) tnp.a.get(str);
        if (tno == null) {
            tno = new tno();
        }
        tno.a = tnm;
        tnp.a.put(str, tno);
    }

    public final synchronized int b() {
        return ((ou) this.b.a).h;
    }

    public final synchronized tnm b(tlh tlh, String str, tnm tnm) {
        tnm b2 = this.b.b(str);
        if (b2 != null) {
            c(tlh, str, tnm);
            ((anih) tky.a.d()).a("EndpointChannelManager replaced endpoint %s's channel from type %s to type %s.", (Object) str, (Object) b2.a(), (Object) tnm.a());
            return b2;
        }
        ((anih) tky.a.d()).a("EndpointChannelManager failed to replace endpoint %s's channel with type %s because the endpoint has no existing channel.", (Object) str, (Object) tnm.a());
        return null;
    }

    public final synchronized tnm a(String str) {
        return this.b.b(str);
    }

    public final tnm a(uwf uwf) {
        try {
            return new trx(this.a, uwf);
        } catch (IOException e) {
            return null;
        }
    }

    public final synchronized void a() {
        ((anih) tky.a.d()).a("Initiating shutdown of EndpointChannelManager.");
        tnp tnp = this.b;
        while (!tnp.a.isEmpty()) {
            String str = (String) tnp.a.keySet().iterator().next();
            ((anih) tky.a.d()).a("EndpointChannelManager found an unexpected lingering entry for endpoint %s while shutting down.", (Object) str);
            tnp.a(str, 6);
        }
        ((anih) tky.a.d()).a("EndpointChannelManager has shut down.");
    }

    public final synchronized boolean b(String str) {
        boolean z;
        if (this.b.a(str, 2)) {
            ((anih) tky.a.d()).a("EndpointChannelManager unregistered endpoint %s", (Object) str);
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final synchronized void a(String str, aurx aurx) {
        tnm b2 = this.b.b(str);
        if (b2 != null) {
            a(str, b2, aurx);
            tnp tnp = this.b;
            tno tno = (tno) tnp.a.get(str);
            if (tno == null) {
                tno = new tno();
            }
            tno.b = aurx;
            tnp.a.put(str, tno);
            return;
        }
        ((anih) tky.a.d()).a("EndpointChannelManager failed to encrypt endpoint %s's channel because the endpoint has no existing channel.", (Object) str);
    }

    public final synchronized void a(tlh tlh, String str, tnm tnm) {
        b(str);
        c(tlh, str, tnm);
        ((anih) tky.a.d()).a("EndpointChannelManager registered channel of type %s to endpoint %s", (Object) tnm.a(), (Object) str);
    }
}
