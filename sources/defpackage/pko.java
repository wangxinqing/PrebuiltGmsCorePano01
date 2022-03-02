package defpackage;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.icing.mdh.service.MobileDataHubListenerChimeraService;
import com.google.android.gms.mdh.LatestFootprintFilter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: pko  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pko extends sar implements niz {
    private static final int a = aulx.d.a();
    private final MobileDataHubListenerChimeraService b;
    private final String c;
    private final nix d;
    private final WeakHashMap e = new WeakHashMap();

    public pko(MobileDataHubListenerChimeraService mobileDataHubListenerChimeraService, String str, nix nix) {
        this.b = mobileDataHubListenerChimeraService;
        this.c = str;
        this.d = nix;
    }

    private final sah a(sae sae) {
        WeakReference weakReference = (WeakReference) this.e.get(sae.a);
        if (weakReference != null) {
            return (sah) weakReference.get();
        }
        return null;
    }

    public final void b(ifu ifu, Account account, int i, int i2, saw saw) {
        ifu ifu2 = ifu;
        if (pba.e()) {
            try {
                String str = this.c;
                pgs pgs = (pgs) this.b.a.h().a.a();
                phr.a(pgs, 1);
                phr.a(account, 2);
                phr.a(saw, 5);
                phr.a(ifu, 6);
                a((nis) new pjr(164, "UnregisterTimeSeriesFootprintsListenerAsyncOperationDelegate", str, new phq(pgs, account, i, i2, saw, ifu), this.b.a));
            } catch (RuntimeException e2) {
                pbu.a().a("Unexpected RuntimeException in MDH.", e2);
                ifu.a(new Status(8, "Unexpected RuntimeException in MDH."));
            }
        } else {
            ifu.a(new Status(8, "Time Series Footprints API is disabled."));
        }
    }

    private final void a(nis nis) {
        this.d.a(nis);
    }

    public final void a(ifu ifu, Account account, int i, int i2, LatestFootprintFilter latestFootprintFilter, sah sah) {
        ifu ifu2 = ifu;
        try {
            String str = this.c;
            phl e2 = this.b.a.e();
            String str2 = this.c;
            pgm pgm = (pgm) e2.a.a();
            phl.a(pgm, 1);
            phl.a(str2, 2);
            phl.a(account, 3);
            phl.a(latestFootprintFilter, 6);
            phl.a(sah, 7);
            phl.a(ifu2, 8);
            phk phk = new phk(pgm, str2, account, i, i2, latestFootprintFilter, sah, ifu);
            a((nis) new pjr(164, "RegisterLatestFootprintListenerAsyncOperationDelegate", str, phk, this.b.a));
        } catch (RuntimeException e3) {
            pbu.a().a("Unexpected RuntimeException in MDH.", e3);
            ifu2.a(new Status(8, "Unexpected RuntimeException in MDH."));
        }
    }

    public final void a(ifu ifu, Account account, int i, int i2, sah sah) {
        try {
            a((nis) new pjr(164, "UnregisterLatestFootprintListenerAsyncOperationDelegate", this.c, this.b.a.f().a(account, i, i2, sah, ifu), this.b.a));
        } catch (RuntimeException e2) {
            pbu.a().a("Unexpected RuntimeException in MDH.", e2);
            ifu ifu2 = ifu;
            ifu.a(new Status(8, "Unexpected RuntimeException in MDH."));
        }
    }

    public final void a(ifu ifu, Account account, int i, int i2, saw saw) {
        ifu ifu2 = ifu;
        if (pba.e()) {
            try {
                String str = this.c;
                phn g = this.b.a.g();
                String str2 = this.c;
                pgs pgs = (pgs) g.a.a();
                phn.a(pgs, 1);
                phn.a(str2, 2);
                phn.a(account, 3);
                phn.a(saw, 6);
                phn.a(ifu2, 7);
                phm phm = new phm(pgs, str2, account, i, i2, saw, ifu);
                a((nis) new pjr(164, "RegisterTimeSeriesFootprintsListenerAsyncOperationDelegate", str, phm, this.b.a));
            } catch (RuntimeException e2) {
                pbu.a().a("Unexpected RuntimeException in MDH.", e2);
                ifu2.a(new Status(8, "Unexpected RuntimeException in MDH."));
            }
        } else {
            ifu2.a(new Status(8, "Time Series Footprints API is disabled."));
        }
    }

    public final void a(ifu ifu, Account account, int i, sae sae) {
        sah sah;
        ifu ifu2 = ifu;
        sae sae2 = sae;
        try {
            synchronized (this.e) {
                sah a2 = a(sae2);
                if (a2 == null) {
                    byte[] bytes = String.valueOf(i).getBytes(amqn.c);
                    awdn awdn = (awdn) this.b.a.j().a.a();
                    pge.a(awdn, 1);
                    pge.a(sae2, 2);
                    sah = new pgd(awdn, sae2, i, (byte[]) pge.a(bytes, 4));
                    this.e.put(sae2.a, new WeakReference(sah));
                } else {
                    int i2 = i;
                    sah = a2;
                }
            }
            String str = this.c;
            phj i3 = this.b.a.i();
            String str2 = this.c;
            pgm pgm = (pgm) i3.a.a();
            phj.a(pgm, 1);
            phj.a(str2, 2);
            phj.a(account, 3);
            phj.a(sah, 5);
            phj.a(ifu2, 6);
            a((nis) new pjr(164, "RegisterFootprintsRecordingSettingsListenerAsyncOperationDelegate", str, new phi(pgm, str2, account, i, sah, ifu), this.b.a));
        } catch (RuntimeException e2) {
            pbu.a().a("Unexpected RuntimeException in MDH.", e2);
            ifu2.a(new Status(8, "Unexpected RuntimeException in MDH."));
        }
    }

    public final void a(ifu ifu, Account account, sae sae) {
        sah a2;
        synchronized (this.e) {
            a2 = a(sae);
        }
        if (a2 != null) {
            try {
                a((nis) new pjr(164, "UnregisterLatestFootprintListenerAsyncOperationDelegate", this.c, this.b.a.f().a(account, 553, a, a2, ifu), this.b.a));
            } catch (RuntimeException e2) {
                pbu.a().a("Unexpected RuntimeException in MDH.", e2);
                ifu.a(new Status(8, "Unexpected RuntimeException in MDH."));
            }
        } else {
            ifu.a(new Status(0));
        }
    }
}
