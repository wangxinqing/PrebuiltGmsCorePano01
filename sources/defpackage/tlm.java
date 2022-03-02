package defpackage;

import java.io.IOException;

/* renamed from: tlm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tlm implements Runnable {
    private final tlt a;
    private final String b;
    private final tlh c;

    public tlm(tlt tlt, String str, tlh tlh) {
        this.a = tlt;
        this.b = str;
        this.c = tlh;
    }

    public final void run() {
        tlt tlt = this.a;
        String str = this.b;
        tlh tlh = this.c;
        if (tlt.g.containsKey(str)) {
            ((anih) tky.a.d()).a("BandwidthUpgradeManager is ignoring bandwidth upgrade for endpoint %s because we're already upgrading bandwidth for that endpoint.", (Object) str);
        } else if (!tlt.a(tlt.a(tlh.n(str)))) {
            ((anih) tky.a.b()).a("BandwidthUpgradeManager cannot initiate bandwidth upgrade for endpoint %s because the current BandwidthUpgradeMedium cannot be deduced.", (Object) str);
        } else {
            tnm a2 = tlt.b.a(str);
            int i = 2;
            tlh.f.a(str, a2 != null ? a2.l() : asoe.UNKNOWN_MEDIUM, tlt.i, 2);
            if (a2 == null) {
                ((anih) tky.a.b()).a("BandwidthUpgradeManager couldn't complete the upgrade for endpoint %s because it couldn't find an existing EndpointChannel for it.", (Object) str);
                tlh.f.a(str, asnt.CHANNEL_ERROR, 3);
            } else if (tlt.i == a2.l()) {
                ((anih) tky.a.d()).a("BandwidthUpgradeManager ignoring the upgrade for endpoint %s because it is already connected over medium %s.", (Object) str, (Object) tlt.i.name());
                tlh.f.a(str, asnt.ALREADY_ON_MEDIUM_ERROR, 3);
            } else {
                try {
                    a2.a(((tlx) tlt.e.get(tlt.i)).a(tlh, str));
                    jjg jjg = tky.a;
                    tlt.g.put(str, tlh);
                } catch (tlu e) {
                    anih anih = (anih) tky.a.b();
                    anih.a((Throwable) e);
                    anih.a("BandwidthUpgradeManager couldn't complete the upgrade for endpoint %s because it failed to initialize the BANDWIDTH_UPGRADE_NEGOTIATION.UPGRADE_PATH_AVAILABLE OfflineFrame.", (Object) str);
                    aucd o = arzw.h.o();
                    asoe asoe = tlt.i;
                    asaa asaa = asaa.UNKNOWN_MEDIUM;
                    asoe asoe2 = asoe.UNKNOWN_MEDIUM;
                    asav asav = asav.UNKNOWN_FRAME_TYPE;
                    switch (asoe.ordinal()) {
                        case 1:
                            break;
                        case 2:
                            i = 3;
                            break;
                        case 3:
                            i = 4;
                            break;
                        case 4:
                            i = 5;
                            break;
                        case 5:
                            i = 6;
                            break;
                        case 6:
                            i = 7;
                            break;
                        case 7:
                            i = 8;
                            break;
                        case 8:
                            i = 9;
                            break;
                        case 9:
                            i = 10;
                            break;
                        default:
                            i = 1;
                            break;
                    }
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    arzw arzw = (arzw) o.b;
                    arzw.b = i - 1;
                    arzw.a |= 1;
                    tlt.b(tlh, str, (arzw) o.i());
                } catch (IOException e2) {
                    anih anih2 = (anih) tky.a.b();
                    anih2.a((Throwable) e2);
                    anih2.a("BandwidthUpgradeManager couldn't complete the upgrade for endpoint %s because it failed to write the BANDWIDTH_UPGRADE_NEGOTIATION.UPGRADE_PATH_AVAILABLE OfflineFrame.", (Object) str);
                    tlh.f.a(str, asnt.RESULT_IO_ERROR, 3);
                }
            }
        }
    }
}
