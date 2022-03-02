package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.TimingLogger;
import com.google.android.gms.icing.nativeindex.NativeIndex;

/* renamed from: ort  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ort extends ppr {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ anax c;
    final /* synthetic */ osf d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ort(osf osf, aonk aonk, boolean z, boolean z2, anax anax) {
        super(aonk);
        this.d = osf;
        this.a = z;
        this.b = z2;
        this.c = anax;
    }

    public final void b() {
        aojt aojt;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        TimingLogger timingLogger = new TimingLogger("Icing", "post-init");
        osf osf = this.d;
        prp prp = osf.g;
        Context context = osf.b;
        if (prp.e()) {
            qwq.a(context).a((qxx) aamd.a(false));
        }
        if (!this.a) {
            if (this.b) {
                osf osf2 = this.d;
                anhk i = osf2.b().c().listIterator();
                while (i.hasNext()) {
                    osz osz = (osz) i.next();
                    if (!osf2.n.a(osz.i, osz.b, osf.b(ozq.d(osz)))) {
                        osf2.r.a("add_all_active_corpora_failed");
                        oso.b("Add corpus from %s failed", (Object) osz.e);
                    }
                }
            }
            NativeIndex nativeIndex = this.d.n;
            if (this.b && !nativeIndex.a(ozy.a())) {
                oso.c("Failed to rebuild index.");
            }
            try {
                aojt = (aojt) aucj.a((aucj) aojt.c, NativeIndex.nativeRestoreIndex(nativeIndex.b, ozy.a().k()));
            } catch (auda e) {
                oso.a((Throwable) e, "Failed parsing index restoration stats response");
                aucd o = aojt.c.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aojt aojt2 = (aojt) o.b;
                aojt2.b = 4;
                aojt2.a |= 1;
                aojt = (aojt) o.i();
            }
            timingLogger.addSplit("index-restored");
            oyq oyq = this.d.r;
            long k = axrp.a.a().k();
            if (oyq.a(k)) {
                aucd o2 = aoji.R.o();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aoji aoji = (aoji) o2.b;
                aojt.getClass();
                aoji.H = aojt;
                aoji.b |= 2048;
                oyq.a(6012, o2, k);
            }
            if (System.currentTimeMillis() > prp.c() + ((Long) ozx.g.c()).longValue()) {
                oso.c("No maintenance for too long");
                oyq.a("no_maint_too_long");
                this.d.m();
                timingLogger.addSplit("forced-maintenance");
            }
            anax anax = this.c;
            if (anax != null && !anax.isEmpty()) {
                oso.c("%d corpora need re-polling", (Object) Integer.valueOf(this.c.size()));
                anhj a2 = this.c.iterator();
                while (a2.hasNext()) {
                    pao pao = (pao) a2.next();
                    ota b2 = this.d.b().b(pao);
                    if (b2 != null) {
                        otg otg = b2.c;
                        if (otg == null) {
                            otg = otg.h;
                        }
                        int a3 = otf.a(otg.c);
                        if (a3 == 0 || a3 == 1) {
                            osz osz2 = b2.b;
                            if (osz2 == null) {
                                osz2 = osz.s;
                            }
                            if (ozq.a(osz2)) {
                                this.d.o.a(pao);
                            }
                        }
                    }
                }
                owf owf = this.d.q;
                if (owf != null) {
                    owf.b();
                }
            }
            if (!nativeIndex.i()) {
                oso.c("Failed to delete usage reports.");
            }
            Context context2 = this.d.b;
            if (prp.f()) {
                opx.a(context2);
            }
        }
        this.d.a(aolt.POST_INIT, elapsedRealtime);
        timingLogger.dumpToLog();
        oso.c("Post-init done");
    }
}
