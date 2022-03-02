package defpackage;

import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/* renamed from: tlp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tlp implements Runnable {
    private final tlt a;
    private final asai b;
    private final tlh c;
    private final String d;
    private final asoe e;

    public tlp(tlt tlt, asai asai, tlh tlh, String str, asoe asoe) {
        this.a = tlt;
        this.b = asai;
        this.c = tlh;
        this.d = str;
        this.e = asoe;
    }

    public final void run() {
        arzw arzw;
        tnm tnm;
        String str;
        tlt tlt = this.a;
        asai asai = this.b;
        tlh tlh = this.c;
        String str2 = this.d;
        asoe asoe = this.e;
        asaw asaw = asai.c;
        if (asaw == null) {
            asaw = asaw.j;
        }
        arzx arzx = asaw.f;
        if (arzx == null) {
            arzx = arzx.e;
        }
        int b2 = arzo.b(arzx.b);
        int i = 1;
        if (b2 == 0) {
            b2 = 1;
        }
        int i2 = b2 - 1;
        int i3 = 2;
        if (i2 == 1) {
            arzw arzw2 = arzx.c;
            if (arzw2 != null) {
                arzw = arzw2;
            } else {
                arzw = arzw.h;
            }
            int a2 = arzr.a(arzw.b);
            if (a2 == 0) {
                a2 = 1;
            }
            if (!tlt.a(tpk.a(a2))) {
                anih anih = (anih) tky.a.c();
                int a3 = arzr.a(arzw.b);
                if (a3 != 0) {
                    i = a3;
                }
                switch (i) {
                    case 1:
                        str = "UNKNOWN_MEDIUM";
                        break;
                    case 2:
                        str = "MDNS";
                        break;
                    case 3:
                        str = "BLUETOOTH";
                        break;
                    case 4:
                        str = "WIFI_HOTSPOT";
                        break;
                    case 5:
                        str = "BLE";
                        break;
                    case 6:
                        str = "WIFI_LAN";
                        break;
                    case 7:
                        str = "WIFI_AWARE";
                        break;
                    case 8:
                        str = "NFC";
                        break;
                    case 9:
                        str = "WIFI_DIRECT";
                        break;
                    default:
                        str = "WEB_RTC";
                        break;
                }
                anih.a("BandwidthUpgradeManager failed to process incoming BANDWIDTH_UPGRADE_NEGOTIAION.UPGRADE_PATH_AVAILABLE for Medium %s because we were unable to set the bandwidth upgrade medium.", (Object) str);
                tlt.a(tlh, str2, arzw);
                return;
            }
            tlh.f.a(str2, asoe, tlt.i, 3);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                tnm = ((tlx) tlt.e.get(tlt.i)).a(tlh, str2, arzw);
                try {
                    String c2 = tlh.c();
                    aucd o = arzm.c.o();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    arzm arzm = (arzm) o.b;
                    c2.getClass();
                    arzm.a |= 1;
                    arzm.b = c2;
                    arzm arzm2 = (arzm) o.i();
                    aucd o2 = arzx.e.o();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    arzx arzx2 = (arzx) o2.b;
                    arzx2.b = 4;
                    int i4 = 1 | arzx2.a;
                    arzx2.a = i4;
                    arzm2.getClass();
                    arzx2.d = arzm2;
                    arzx2.a = i4 | 4;
                    tnm.a(tpk.a(asav.BANDWIDTH_UPGRADE_NEGOTIATION, (audx) o2.i()).k());
                    jjg jjg = tky.a;
                    tnm.b();
                    tnm.a(tlh.f, str2);
                } catch (IOException e2) {
                    tnm.g();
                    anih anih2 = (anih) tky.a.b();
                    anih2.a((Throwable) e2);
                    anih2.a("BandwidthUpgradeManager failed to write BANDWIDTH_UPGRADE_NEGOTIATION.CLIENT_INTRODUCTION OfflineFrame to newly-created EndpointChannel %s, aborting upgrade.", (Object) tnm.b());
                    tlh.f.a(str2, asnt.RESULT_IO_ERROR, 2);
                    tnm = null;
                }
            } catch (tlu e3) {
                anih anih3 = (anih) tky.a.b();
                anih3.a((Throwable) e3);
                anih3.a("BandwidthUpgradeManager failed to create an endpoint channel to endpoint %s, aborting upgrade.", (Object) str2);
                tlh.f.a(str2, e3.a, e3.b);
                tnm = null;
            }
            if (tnm == null) {
                if (!tlh.q(str2).b()) {
                    i3 = 3;
                } else {
                    i3 = 4;
                }
            }
            tlh.f.a(str2, 3, tlt.i, i3, SystemClock.elapsedRealtime() - elapsedRealtime);
            if (tnm == null) {
                tlt.a(tlh, str2, arzw);
            } else {
                tlt.a(tlh, str2, tnm);
            }
        } else if (i2 == 2) {
            tlt.b(tlh, str2);
        } else if (i2 == 3) {
            tnm tnm2 = (tnm) tlt.f.remove(str2);
            if (tnm2 == null) {
                ((anih) tky.a.c()).a("BandwidthUpgradeManager received a BANDWIDTH_UPGRADE_NEGOTIATION.SAFE_TO_CLOSE_PRIOR_CHANNEL OfflineFrame for unknown endpoint %s, can't complete the upgrade protocol.", (Object) str2);
                return;
            }
            jjg jjg2 = tky.a;
            tnm2.c();
            try {
                tnm2.a(tpk.a());
            } catch (IOException e4) {
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new jfx(9, new tlq(tnm2, countDownLatch)).start();
            thr.a("processSafeToClosePriorChannelEvent", countDownLatch, aymi.a.a().aC());
            tnm2.a(5);
            tnm2.a();
            tlh.f.b(str2, tlt.i);
            tlh.f.g(str2);
            tnm a4 = tlt.b.a(str2);
            if (a4 == null) {
                ((anih) tky.a.c()).a("BandwidthUpgradeManager attempted to resume the current EndpointChannel with endpoint %s, but none was found", (Object) str2);
                return;
            }
            a4.j();
            tlh.a(str2, a4.l());
        } else if (i2 != 5) {
            anih anih4 = (anih) tky.a.c();
            int b3 = arzo.b(arzx.b);
            if (b3 != 0) {
                i = b3;
            }
            anih4.a("BandwidthUpgradeManager can't process unknown incoming OfflineFrame of type %s, ignoring it.", (Object) arzo.a(i));
        } else {
            arzw arzw3 = arzx.c;
            if (arzw3 == null) {
                arzw3 = arzw.h;
            }
            tlt.b(tlh, str2, arzw3);
        }
    }
}
