package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.net.InetAddress;

/* renamed from: try  reason: invalid class name and default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class Ctry implements tlx, tpe {
    private final tph a;
    private final tlw b;
    private final String c = ulu.a(10);

    public Ctry(tph tph, tlw tlw) {
        this.a = tph;
        this.b = tlw;
    }

    public final tnm a(tlh tlh, String str, arzw arzw) {
        uwh uwh;
        arzv arzv = arzw.d;
        if (arzv == null) {
            arzv = arzv.d;
        }
        try {
            InetAddress byAddress = InetAddress.getByAddress(arzv.b.k());
            jjg jjg = tky.a;
            tph tph = this.a;
            int i = arzv.c;
            tfw q = tlh.q(str);
            synchronized (tph.g) {
                uwh = null;
                if (tph.a()) {
                    if (tph.b.c.a()) {
                        uwh = tph.b.h.a(byAddress, i, q);
                    }
                }
            }
            if (uwh != null) {
                byAddress.toString();
                trz a2 = trz.a(uwh);
                if (a2 != null) {
                    return a2;
                }
                jjt.a((Closeable) uwh);
                throw new tlu(asnt.MEDIUM_ERROR, 6, String.format("WifiLanBandwidthUpgradeMedium failed to create new EndpointChannel for outgoing socket %s, aborting upgrade.", new Object[]{uwh}));
            }
            throw new tlu(asnt.MEDIUM_ERROR, 16, String.format("WifiLanBandwidthUpgradeMedium failed to join available wifi LAN socket (%s, %d) on endpoint %s, aborting upgrade.", new Object[]{byAddress, Integer.valueOf(arzv.c), str}));
        } catch (IOException e) {
            throw new tlu(asnt.MEDIUM_ERROR, 15, String.format("WifiLanBandwidthUpgradeMedium couldn't initiate WIFI_LAN upgrade for endpoint %s because the IP address is invalid.", new Object[]{str}), e);
        }
    }

    public final void a() {
        this.a.f(this.c);
        jjg jjg = tky.a;
    }

    public final void a(uwh uwh) {
        this.b.a(new tlv(trz.a(uwh), uwh));
    }

    public final byte[] a(tlh tlh, String str) {
        uou c2;
        if (!this.a.e(this.c)) {
            if (this.a.a(this.c, (tpe) this)) {
                jjg jjg = tky.a;
            } else {
                throw new tlu(asnt.MEDIUM_ERROR, 14, String.format("WifiLanBandwidthUpgradeMedium couldn't initiate the WIFI_LAN upgrade for endpoint %s because it failed to start listening for incoming Wifi connections.", new Object[]{str}));
            }
        }
        tph tph = this.a;
        String str2 = this.c;
        synchronized (tph.g) {
            c2 = tph.b.h.c(str2);
        }
        if (c2 != null) {
            byte[] address = c2.a().getAddress();
            int b2 = c2.b();
            aucd o = arzv.d.o();
            auay a2 = auay.a(address);
            if (o.c) {
                o.c();
                o.c = false;
            }
            arzv arzv = (arzv) o.b;
            a2.getClass();
            int i = arzv.a | 1;
            arzv.a = i;
            arzv.b = a2;
            arzv.a = i | 2;
            arzv.c = b2;
            arzv arzv2 = (arzv) o.i();
            aucd o2 = arzw.h.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arzw arzw = (arzw) o2.b;
            arzw.b = 5;
            int i2 = arzw.a | 1;
            arzw.a = i2;
            arzv2.getClass();
            arzw.d = arzv2;
            arzw.a = i2 | 4;
            return tpk.a((arzw) o2.i());
        }
        throw new tlu(asnt.MEDIUM_ERROR, 14, String.format("WifiLanBandwidthUpgradeMedium couldn't initiate the WIFI_LAN upgrade for endpoint %s because the Wifi LAN credentials were unable to be obtained.", new Object[]{str}));
    }
}
