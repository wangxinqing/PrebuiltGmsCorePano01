package defpackage;

import android.content.Context;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: adml  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adml extends adlm implements adnz {
    private static final iwd e = adnt.e("NonStreamingDownloadAction");
    private static final adro f = new adro("file_path", "");
    private static final adrk g = new adrk("downloaded_bytes", 0L);
    private static final adrg h = new adrg("network_error_attempts", 0);
    private static final adrb i = new adrb("progress", Double.valueOf(-1.0d));
    private final Context j;
    private final adkm k = ((adkm) adkm.c.b());
    private final adla l = ((adla) adla.h.b());
    private final adns m;
    private final adle n;
    private final adog o;
    private final AtomicReference p;
    private final aoqc q;

    public adml(Context context, adre adre) {
        super("non-streaming-download", adre);
        adog adog;
        this.j = context;
        this.m = adns.a(context);
        this.n = (adle) adle.c.b();
        if (adjx.a()) {
            adog = adoi.a(context, adjx.b(), ayou.i(), ayou.g(), ayou.h());
        } else {
            adog = adoh.a(context, ayou.g());
        }
        this.o = adog;
        this.p = new AtomicReference(ampu.a);
        this.q = new aoqc(((Double) a(i)).doubleValue());
    }

    private final adrd e() {
        amri amri = (amri) this.p.get();
        adrd b = a().b();
        b.a(i, Double.valueOf(this.q.a()));
        if (amri.a()) {
            b.a(g, Long.valueOf(((adoc) amri.b()).d()));
            b.a(f, ((admv) ((adoc) amri.b()).a).a());
        }
        return b;
    }

    private final adll f() {
        adrd e2 = e();
        adrg adrg = h;
        e2.a(adrg, Integer.valueOf(((Integer) a(adrg)).intValue() + 1));
        adre a = e2.a();
        adma f2 = admb.f();
        f2.a(ayou.d(), ayou.e());
        f2.a(ayou.f());
        f2.a(((Integer) a(h)).intValue());
        f2.a("non-streaming-download", a);
        return f2.b();
    }

    private final amri g() {
        if (amrk.a(this.l.d().a)) {
            this.l.a(0, -1.0d);
            return amri.b(new adll("finished-execution", adre.a(new adrc[0])));
        }
        try {
            adjv a = adjx.a(this.j, this.o.a(), this.l.d());
            this.l.a(a.a, this.q.a());
            int i2 = a.a;
            if (i2 == 2) {
                return ampu.a;
            }
            if (i2 == 2059) {
                this.n.c();
            }
            if (a.a == 2315) {
                this.k.c();
            }
            admd f2 = adme.f();
            f2.a(a.b);
            f2.a("non-streaming-download", a());
            return amri.b(f2.b());
        } catch (adju e2) {
            e.e("Unable to continue due to invalid config.", e2, new Object[0]);
            this.l.a(774, -1.0d);
            return amri.b(new adll("finished-execution", adre.a(new adrc[0])));
        }
    }

    public final void a(long j2, long j3) {
        amri amri = (amri) this.p.get();
        if (amri.a()) {
            adrc[] adrcArr = {f.b(((admv) ((adoc) amri.b()).a).a()), g.b(Long.valueOf(((adoc) amri.b()).d()))};
            synchronized (this.b) {
                adrd b = this.d.b();
                b.a(adrcArr);
                this.d = b.a();
                if (this.c.a()) {
                    adre adre = this.d;
                    ((adln) this.c.b()).a.d.a(adls.c.b(adre));
                }
            }
        }
        aoqc aoqc = this.q;
        double d = (double) j3;
        double d2 = (double) j2;
        Double.isNaN(d);
        Double.isNaN(d2);
        aoqc.a(d / d2);
        this.l.a(2, this.q.a());
    }

    public final void b() {
        amri amri = (amri) this.p.get();
        if (amri.a()) {
            ((adoc) amri.b()).e();
        }
    }

    public final adll c() {
        adll adll;
        String str;
        this.k.d();
        this.n.d();
        this.l.a(false);
        amri g2 = g();
        if (g2.a()) {
            return (adll) g2.b();
        }
        try {
            this.o.c();
            try {
                this.k.a();
                this.n.a();
                try {
                    amri g3 = g();
                    if (g3.a()) {
                        adll = (adll) g3.b();
                    } else {
                        Context context = this.j;
                        if (!((Boolean) adke.h.a()).booleanValue()) {
                            str = "update.zip";
                        } else {
                            str = "update_s.zip";
                        }
                        admv a = admv.a(context, str, (String) a(f), adjx.c());
                        try {
                            adod adod = (adod) this.o.a().c();
                            if (adod != null) {
                                int intValue = ((Integer) ((adrn) adrn.a.b()).a((adri) adls.e).b).intValue();
                                adnu a2 = adoc.a(this.j);
                                a2.a = this.l.d().a;
                                a2.c = ((Long) a(g)).longValue();
                                a2.h = admw.a();
                                a2.b = a;
                                a2.i = adod;
                                a2.f = admx.a(this.j);
                                a2.g = intValue;
                                adoc a3 = a2.a();
                                synchronized (a3.b) {
                                    a3.c = this;
                                }
                                this.p.set(amri.b(a3));
                                a3.a();
                                adrd a4 = adre.a();
                                a4.a(admm.e, a.a());
                                adll = new adll("non-streaming-process-package", a4.a());
                            } else {
                                throw new adnw("No network available");
                            }
                        } catch (adnx e2) {
                            e.e("Unable to create the file.", e2, new Object[0]);
                            this.l.a(518, this.q.a());
                            admd f2 = adme.f();
                            f2.a(ayou.c());
                            f2.a("non-streaming-download", e().a());
                            adll = f2.b();
                        } catch (adnw e3) {
                            e.e("Failed to download: %s", e3, amrk.b(e3.getMessage()));
                            this.l.a(262, this.q.a());
                            adll = f();
                        } catch (adnv e4) {
                            e.e("Download cancelled.", e4, new Object[0]);
                            adll = new adll("non-streaming-download", e().a());
                        }
                    }
                    return adll;
                } finally {
                    this.k.b();
                    this.n.b();
                }
            } finally {
                this.o.b();
            }
        } catch (IOException e5) {
            e.e("Failed to acquire network.", e5, new Object[0]);
            this.l.a(262, this.q.a());
            return f();
        } finally {
            this.m.a(admf.a(this.j, this.o));
        }
    }

    public final boolean d() {
        try {
            if (adjx.a(this.j, this.o.a(), this.l.d()).a != 2) {
                b();
            }
            return true;
        } catch (adju e2) {
            return true;
        }
    }
}
