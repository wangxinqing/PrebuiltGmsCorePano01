package defpackage;

import android.os.SystemClock;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: tln  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tln implements Runnable {
    private final tlt a;
    private final tlv b;

    public tln(tlt tlt, tlv tlv) {
        this.a = tlt;
        this.b = tlv;
    }

    public final void run() {
        tfu b2;
        tlt tlt = this.a;
        tlv tlv = this.b;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        tnm tnm = tlv.a;
        if (tnm == null) {
            ((anih) tky.a.b()).a("BandwidthUpgradeManager failed to create new EndpointChannel for incoming socket %s", (Object) tlv);
            jjt.a((Closeable) tlv.b);
            tlt.a(asnt.MEDIUM_ERROR, 6);
            return;
        }
        jjg jjg = tky.a;
        try {
            b2 = tfu.b(new tlo(tnm), aymi.s(), tlt.c);
            int i = 1;
            asai a2 = tpk.a(tnm.e());
            b2.b();
            if (tpk.a(a2) == asav.BANDWIDTH_UPGRADE_NEGOTIATION) {
                asaw asaw = a2.c;
                if (asaw == null) {
                    asaw = asaw.j;
                }
                arzx arzx = asaw.f;
                if (arzx == null) {
                    arzx = arzx.e;
                }
                int b3 = arzo.b(arzx.b);
                if (b3 != 0) {
                    if (b3 == 5) {
                        asaw asaw2 = a2.c;
                        if (asaw2 == null) {
                            asaw2 = asaw.j;
                        }
                        arzx arzx2 = asaw2.f;
                        if (arzx2 == null) {
                            arzx2 = arzx.e;
                        }
                        arzm arzm = arzx2.d;
                        if (arzm == null) {
                            arzm = arzm.c;
                        }
                        String str = arzm.b;
                        tlh tlh = (tlh) tlt.g.remove(str);
                        tlt.a(str);
                        if (tlh == null) {
                            tnm.g();
                            ((anih) tky.a.c()).a("BandwidthUpgradeManager got an incoming connection for unexpected endpoint %s, short-circuiting", (Object) str);
                            return;
                        }
                        tlh.f.a(3, tnm.l(), 2, SystemClock.elapsedRealtime() - elapsedRealtime);
                        tnm.a(tlh.f, str);
                        tlt.a(tlh, str, tnm);
                        return;
                    }
                }
                asnt asnt = asnt.PROTOCOL_ERROR;
                Object[] objArr = new Object[1];
                asaw asaw3 = a2.c;
                if (asaw3 == null) {
                    asaw3 = asaw.j;
                }
                arzx arzx3 = asaw3.f;
                if (arzx3 == null) {
                    arzx3 = arzx.e;
                }
                int b4 = arzo.b(arzx3.b);
                if (b4 != 0) {
                    i = b4;
                }
                objArr[0] = arzo.a(i);
                throw new tlu(asnt, 2, String.format("In readClientIntroductionFrame, expected a CLIENT_INTRODUCTION v1 OfflineFrame but got a BandwidthUpgradeNegotiation frame with eventType %s instead", objArr));
            }
            throw new tlu(asnt.PROTOCOL_ERROR, 2, String.format("In readClientIntroductionFrame, expected a BANDWIDTH_UPGRADE_NEGOTIATION v1 OfflineFrame but got a %s frame instead", new Object[]{tpk.a(a2).name()}));
        } catch (IOException e) {
            throw new tlu(asnt.RESULT_IO_ERROR, 2, String.format("In readClientIntroductionFrame, attempted to read a ClientIntroductionFrame from EndpointChannel %s but was unable to obtain any OfflineFrame.", new Object[]{tnm.a()}), e);
        } catch (tlu e2) {
            tnm.g();
            anih anih = (anih) tky.a.b();
            anih.a((Throwable) e2);
            anih.a("BandwidthUpgradeManager failed to read BANDWIDTH_UPGRADE_NEGOTIATION.CLIENT_INTRODUCTION OfflineFrame from newly-created EndpointChannel %s, so the EndpointChannel was discarded.", (Object) tnm.b());
            tlt.a(e2.a, e2.b);
        } catch (Throwable th) {
            b2.b();
            throw th;
        }
    }
}
