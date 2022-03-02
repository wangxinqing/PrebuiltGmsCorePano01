package defpackage;

import java.io.Closeable;
import java.nio.charset.Charset;
import java.util.Set;

/* renamed from: trr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class trr implements tlx, tpb {
    public static final /* synthetic */ int a = 0;
    private static final Charset b = Charset.forName("UTF-8");
    private final tph c;
    private final tlw d;
    private final Set e = new ob();

    public trr(tph tph, tlw tlw) {
        this.c = tph;
        this.d = tlw;
    }

    public final tnm a(tlh tlh, String str, arzw arzw) {
        uvy uvy;
        arzs arzs = arzw.f;
        if (arzs == null) {
            arzs = arzs.e;
        }
        tfw q = tlh.q(str);
        aosh f = aosh.f();
        if (!this.c.a(arzs.b, (toz) new trq(arzs, f))) {
            ((anih) tky.a.b()).a("Failed to start scanning for Wifi Aware device %s", (Object) tky.a(arzs.c.k()));
            uvy = null;
        } else {
            Exception exc = new Exception("Future cancelled.");
            q.a(new trp(f, exc));
            if (q.b()) {
                f.a((Throwable) exc);
            }
            try {
                uvy = (uvy) thr.c("WifiAwareBandwidthUpgradeMedium.discover", f, aymi.a.a().bn() * 1000);
            } finally {
                this.c.i(arzs.b);
            }
        }
        if (uvy != null) {
            jjg jjg = tky.a;
            uvz a2 = this.c.a(uvy, arzs.d, tlh.q(str));
            this.c.j(arzs.b);
            if (a2 != null) {
                trs a3 = trs.a(a2);
                if (a3 != null) {
                    return a3;
                }
                jjt.a((Closeable) a2);
                throw new tlu(asnt.MEDIUM_ERROR, 6, String.format("WifiAwareBandwidthUpgradeMedium failed to create new EndpointChannel for outgoing socket to endpoint %s, aborting upgrade.", new Object[]{str}));
            }
            throw new tlu(asnt.MEDIUM_ERROR, 24, String.format("WifiAwareBandwidthUpgradeMedium couldn't initiate WIFI_AWARE upgrade for endpoint %s because we failed to connect.", new Object[]{str}));
        }
        this.c.j(arzs.b);
        throw new tlu(asnt.MEDIUM_ERROR, 23, String.format("WifiAwareBandwidthUpgradeMedium couldn't initiate WIFI_AWARE upgrade for endpoint %s because we failed to discover the remote device.", new Object[]{str}));
    }

    public final void a() {
        for (String str : this.e) {
            this.c.h(str);
            this.c.g(str);
            this.c.j(str);
        }
        this.e.clear();
        jjg jjg = tky.a;
    }

    public final void a(uvz uvz) {
        this.d.a(new tlv(trs.a(uvz), uvz));
    }

    public final byte[] a(tlh tlh, String str) {
        String a2 = ulu.a(28);
        byte[] bytes = ulu.a(28).getBytes(b);
        String a3 = ulu.a(12);
        if (this.c.a(a2, a3, (tpb) this)) {
            jjg jjg = tky.a;
            if (this.c.a(a2, bytes)) {
                this.e.add(a2);
                aucd o = arzs.e.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                arzs arzs = (arzs) o.b;
                a2.getClass();
                arzs.a |= 1;
                arzs.b = a2;
                auay a4 = auay.a(bytes);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                arzs arzs2 = (arzs) o.b;
                a4.getClass();
                int i = arzs2.a | 2;
                arzs2.a = i;
                arzs2.c = a4;
                if (a3 != null) {
                    a3.getClass();
                    arzs2.a = i | 4;
                    arzs2.d = a3;
                }
                aucd o2 = arzw.h.o();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                arzw arzw = (arzw) o2.b;
                arzw.b = 6;
                arzw.a |= 1;
                arzs arzs3 = (arzs) o.i();
                arzs3.getClass();
                arzw.f = arzs3;
                arzw.a |= 16;
                return tpk.a((arzw) o2.i());
            }
            this.c.g(a2);
            throw new tlu(asnt.MEDIUM_ERROR, 22, String.format("WifiAwareBandwidthUpgradeMedium couldn't complete the Wifi Aware upgrade for endpoint %s because it failed to publish a Wifi Aware advertisement.", new Object[]{str}));
        }
        throw new tlu(asnt.MEDIUM_ERROR, 21, String.format("WifiAwareBandwidthUpgradeMedium couldn't complete the Wifi Aware upgrade for endpoint %s because it failed to listen for incoming Wifi Aware connections.", new Object[]{str}));
    }
}
