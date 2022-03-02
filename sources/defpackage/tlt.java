package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: tlt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tlt implements tny, tlw {
    public final tob a;
    public final tnq b;
    public final ScheduledExecutorService c = tid.a();
    public final aoru d = tid.b();
    public final Map e = new nz();
    public final Map f = new nz();
    public final Map g = new nz();
    public final Set h = new ob();
    public asoe i;
    private final tph j;
    private final Map k = new nz();

    public final asoe a(List list) {
        List a2 = this.j.a(list);
        ArrayList arrayList = new ArrayList();
        int size = a2.size();
        for (int i2 = 0; i2 < size; i2++) {
            asoe asoe = (asoe) a2.get(i2);
            if (this.e.containsKey(asoe)) {
                arrayList.add(asoe);
            }
        }
        if (this.i == asoe.UNKNOWN_MEDIUM) {
            if (!arrayList.isEmpty()) {
                return (asoe) arrayList.get(0);
            }
            ((anih) tky.a.d()).a("Current upgrade medium is unset, but there are no common supported upgrade mediums.");
        } else if (arrayList.contains(this.i)) {
            return this.i;
        } else {
            anih anih = (anih) tky.a.d();
            String name = this.i.name();
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(((asoe) arrayList.get(i3)).name());
            }
            anih.a("Current upgrade medium %s is not supported by the remote endpoint (supported mediums: %s)", (Object) name, (Object) arrayList2);
        }
        return asoe.UNKNOWN_MEDIUM;
    }

    public final void b(tlh tlh, String str) {
        tnm tnm = (tnm) this.f.get(str);
        if (tnm == null) {
            ((anih) tky.a.c()).a("BandwidthUpgradeManager received a BANDWIDTH_UPGRADE_NEGOTIATION.LAST_WRITE_TO_PRIOR_CHANNEL OfflineFrame for unknown endpoint %s, can't complete the upgrade protocol.", (Object) str);
            this.h.add(str);
            return;
        }
        jjg jjg = tky.a;
        try {
            aucd o = arzx.e.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            arzx arzx = (arzx) o.b;
            arzx.b = 3;
            arzx.a |= 1;
            tnm.a(tpk.a(asav.BANDWIDTH_UPGRADE_NEGOTIATION, (audx) o.i()).k());
        } catch (IOException e2) {
            tnm.a(4);
            this.f.remove(str);
            anih anih = (anih) tky.a.b();
            anih.a((Throwable) e2);
            anih.a("BandwidthUpgradeManager failed to write BANDWIDTH_UPGRADE_NEGOTIATION.SAFE_TO_CLOSE_PRIOR_CHANNEL OfflineFrame to endpoint %s, short-circuiting the upgrade protocol.", (Object) str);
            tlh.f.a(str, asnt.RESULT_IO_ERROR, 5);
        }
    }

    public tlt(tph tph, tob tob, tnq tnq) {
        this.j = tph;
        this.a = tob;
        this.b = tnq;
        if (aymi.a.a().bB()) {
            this.e.put(asoe.WIFI_HOTSPOT, new trw(this.j, this.b, this));
        }
        if (aymi.a.a().bK()) {
            this.e.put(asoe.WIFI_LAN, new Ctry(this.j, this));
        }
        if (aymi.a.a().z()) {
            this.e.put(asoe.BLUETOOTH, new tnc(this.j, this));
        }
        if (aymi.a.a().bm()) {
            this.e.put(asoe.WIFI_AWARE, new trr(this.j, this));
        }
        if (aymi.a.a().bv()) {
            this.e.put(asoe.WIFI_DIRECT, new tru(this.j, this));
        }
        if (aymi.a.a().aX()) {
            this.e.put(asoe.WEB_RTC, new trn());
        }
        this.i = asoe.UNKNOWN_MEDIUM;
        tob.a(asav.BANDWIDTH_UPGRADE_NEGOTIATION, (tny) this);
    }

    public final void a() {
        ArrayList arrayList = new ArrayList(this.k.keySet());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            a((String) arrayList.get(i2));
        }
    }

    public final void a(asai asai, String str, tlh tlh, asoe asoe) {
        a((Runnable) new tlp(this, asai, tlh, str, asoe));
    }

    public final void a(asnt asnt, int i2) {
        Map map = this.g;
        if (((ou) map).h == 1) {
            Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
            String str = (String) entry.getKey();
            this.g.clear();
            a();
            ((tlh) entry.getValue()).f.a(str, asnt, i2);
            anih anih = (anih) tky.a.d();
            String a2 = asnr.a(i2);
            if (i2 != 0) {
                anih.a("BandwidthUpgradeManager removing endpoint %s from inProgressUpgrades, since we got error %s at stage %s and this is the only endpoint we're trying to upgrade.", (Object) str, (Object) asnt, (Object) a2);
            } else {
                throw null;
            }
        }
        anih anih2 = (anih) tky.a.d();
        String a3 = asnr.a(i2);
        if (i2 != 0) {
            anih2.a("BandwidthUpgradeManager got error %s at stage %s, but we don't know which endpoint was trying to connect to us, so skipping analytics for this error.", (Object) asnt, (Object) a3);
            return;
        }
        throw null;
    }

    public final void b(tlh tlh, String str, arzw arzw) {
        this.g.remove(str);
        int i2 = 1;
        if (this.b.b() > 1) {
            ((anih) tky.a.d()).a("BandwidthUpgradeManager failed to attempt a new bandwidth upgrade for endpoint %s because we have other connected endpoints and can't try a new upgrade medium.", (Object) str);
            tlh.f.a(str, asnt.CHANNEL_ERROR, 3);
            return;
        }
        if (this.i != asoe.UNKNOWN_MEDIUM) {
            ((tlx) this.e.get(this.i)).a();
            this.i = asoe.UNKNOWN_MEDIUM;
        }
        int a2 = arzr.a(arzw.b);
        if (a2 != 0) {
            i2 = a2;
        }
        asoe a3 = tpk.a(i2);
        ArrayList arrayList = new ArrayList(tlh.n(str));
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            asoe asoe = (asoe) arrayList2.get(i3);
            arrayList.remove(asoe);
            i3++;
            if (asoe == a3) {
                break;
            }
        }
        a(tlh, str, (List) arrayList);
    }

    /* access modifiers changed from: package-private */
    public final void a(Runnable runnable) {
        this.d.execute(runnable);
    }

    public final void a(String str) {
        Object obj;
        oq oqVar = (oq) this.k.remove(str);
        if (oqVar != null && (obj = oqVar.a) != null) {
            ((tfu) obj).b();
        }
    }

    public final void a(tlh tlh, String str) {
        a((Runnable) new tlm(this, str, tlh));
    }

    public final void a(tlh tlh, String str, arzw arzw) {
        tnm a2 = this.b.a(str);
        if (a2 != null) {
            try {
                aucd o = arzx.e.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                arzx arzx = (arzx) o.b;
                arzx.b = 5;
                int i2 = arzx.a | 1;
                arzx.a = i2;
                arzw.getClass();
                arzx.c = arzw;
                arzx.a = i2 | 2;
                a2.a(tpk.a(asav.BANDWIDTH_UPGRADE_NEGOTIATION, (audx) o.i()).k());
                if (this.i != asoe.UNKNOWN_MEDIUM) {
                    ((tlx) this.e.get(this.i)).a();
                    this.i = asoe.UNKNOWN_MEDIUM;
                }
                ((anih) tky.a.d()).a("BandwidthUpgradeManager has informed endpoint %s that the bandwidth upgrade failed.", (Object) str);
            } catch (IOException e2) {
                a2.a(4);
                anih anih = (anih) tky.a.b();
                anih.a((Throwable) e2);
                anih.a("BandwidthUpgradeManager failed to write BANDWIDTH_UPGRADE_NEGOTIATION.UPGRADE_FAILURE OfflineFrame to endpoint %s, short-circuiting the upgrade protocol.", (Object) str);
                tlh.f.a(str, asnt.RESULT_IO_ERROR, 3);
            }
        } else {
            ((anih) tky.a.d()).a("BandwidthUpgradeManager didn't find a previous EndpointChannel for %s when sending an upgrade failure frame, short-circuiting the upgrade protocol.", (Object) str);
            tlh.f.a(str, asnt.CHANNEL_ERROR, 3);
        }
    }

    public final void a(tlh tlh, String str, List list) {
        Object obj;
        asoe a2 = a(list);
        tnm a3 = this.b.a(str);
        asoe l = a3 != null ? a3.l() : asoe.UNKNOWN_MEDIUM;
        if (tlh.a(l) != 3 && (a2 == l || a2 == asoe.UNKNOWN_MEDIUM || list.isEmpty())) {
            oq oqVar = (oq) this.k.get(str);
            long b2 = aymi.a.a().b();
            if (!(oqVar == null || (obj = oqVar.b) == null)) {
                b2 += ((Long) obj).longValue();
            }
            long min = Math.min(b2, aymi.a.a().c());
            a(str);
            tlr tlr = new tlr(this, tlh, str);
            jjg jjg = tky.a;
            this.k.put(str, new oq(tfu.b(tlr, min, this.c), Long.valueOf(min)));
            ((anih) tky.a.d()).a("Retry bandwidth upgrade after %s ms", min);
        } else if (!a(a2)) {
            ((anih) tky.a.d()).a("BandwidthUpgradeManager failed to attempt a new bandwidth upgrade for endpoint %s because we couldn't set a new bandwidth upgrade medium.", (Object) str);
            tlh.f.a(str, asnt.CHANNEL_ERROR, 3);
        } else {
            ((anih) tky.a.d()).a("BandwidthUpgradeManager is attempting to upgrade endpoint %s again with a new bandwidth upgrade medium.", (Object) str);
            a(tlh, str);
        }
    }

    public final void a(tlh tlh, String str, CountDownLatch countDownLatch) {
        a((Runnable) new tll(this, str, countDownLatch));
    }

    public final void a(tlh tlh, String str, tnm tnm) {
        tnm.h();
        tnm b2 = this.b.b(tlh, str, tnm);
        if (b2 == null) {
            ((anih) tky.a.d()).a("BandwidthUpgradeManager didn't find a previous EndpointChannel for %s when registering the new EndpointChannel, short-circuiting the upgrade protocol.", (Object) str);
            tlh.f.a(str, asnt.CHANNEL_ERROR, 7);
            tnm.a(7);
            return;
        }
        jjg jjg = tky.a;
        try {
            aucd o = arzx.e.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            arzx arzx = (arzx) o.b;
            arzx.b = 2;
            arzx.a |= 1;
            b2.a(tpk.a(asav.BANDWIDTH_UPGRADE_NEGOTIATION, (audx) o.i()).k());
            this.f.put(str, b2);
            if (this.h.remove(str)) {
                b(tlh, str);
            }
        } catch (IOException e2) {
            b2.a(4);
            anih anih = (anih) tky.a.b();
            anih.a((Throwable) e2);
            anih.a("BandwidthUpgradeManager failed to write BANDWIDTH_UPGRADE_NEGOTIATION.LAST_WRITE_TO_PRIOR_CHANNEL OfflineFrame to endpoint %s, short-circuiting the upgrade protocol.", (Object) str);
            tlh.f.a(str, asnt.RESULT_IO_ERROR, 4);
        }
    }

    public final void a(tlv tlv) {
        a((Runnable) new tln(this, tlv));
    }

    public final boolean a(asoe asoe) {
        if (!this.e.containsKey(asoe)) {
            ((anih) tky.a.d()).a("Unable to upgrade to unknown upgrade medium %s", (Object) asoe.name());
            return false;
        }
        asoe asoe2 = this.i;
        if (asoe2 == asoe) {
            ((anih) tky.a.d()).a("The currentBandwidthUpgradeMedium is staying the same (upgrade medium %s)", (Object) asoe.name());
            return true;
        } else if (asoe2 != asoe.UNKNOWN_MEDIUM) {
            ((anih) tky.a.d()).a("Unable to switch the currentBandwidthUpgradeMedium to upgrade medium %s. Medium %s has already been locked in.", (Object) asoe.name(), (Object) this.i.name());
            return false;
        } else {
            this.i = asoe;
            ((anih) tky.a.d()).a("The currentBandwidthUpgradeMedium is set to upgrade medium %s", (Object) asoe.name());
            return true;
        }
    }
}
