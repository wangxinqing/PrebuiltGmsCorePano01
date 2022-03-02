package defpackage;

import android.content.Context;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: adms  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adms extends adlm {
    private static final iwd e = adnt.e("StreamingDownloadAction");
    private static final adrg f = new adrg("downloaded_files", 0);
    private static final adrg g = new adrg("network_error_attempts", 0);
    private static final anax h = anax.a("care_map.pb", "care_map.txt", "compatibility.zip", "metadata", "payload_properties.txt");
    private final Context i;
    private final adkm j = ((adkm) adkm.c.b());
    private final adla k = ((adla) adla.h.b());
    private final adle l = ((adle) adle.c.b());
    private final adog m;
    private final AtomicReference n;

    private adms(Context context, adre adre) {
        super("streaming-download", adre);
        adog adog;
        this.i = context;
        if (adjx.a()) {
            adog = adoi.a(context, adjx.b(), ayou.i(), ayou.g(), ayou.h());
        } else {
            adog = adoh.a(context, ayou.g());
        }
        this.m = adog;
        this.n = new AtomicReference(ampu.a);
    }

    private final adll a(int i2) {
        adrd b = a().b();
        b.a(f, Integer.valueOf(i2));
        adrg adrg = g;
        b.a(adrg, Integer.valueOf(((Integer) a(adrg)).intValue() + 1));
        adre a = b.a();
        adma f2 = admb.f();
        f2.a(ayou.d(), ayou.e());
        f2.a(ayou.f());
        f2.a(((Integer) a(g)).intValue());
        f2.a("streaming-download", a);
        return f2.b();
    }

    private final amri e() {
        if (amrk.a(this.k.d().a)) {
            this.k.a(0, -1.0d);
            return amri.b(new adll("finished-execution", adre.a(new adrc[0])));
        }
        try {
            adjv a = adjx.a(this.i, this.m.a(), this.k.d());
            this.k.a(a.a, -1.0d);
            int i2 = a.a;
            if (i2 == 2) {
                return ampu.a;
            }
            if (i2 == 2059) {
                this.l.c();
            }
            if (a.a == 2315) {
                this.j.c();
            }
            admd f2 = adme.f();
            f2.a(a.b);
            f2.a("streaming-download", a());
            return amri.b(f2.b());
        } catch (adju e2) {
            e.e("Unable to continue due to invalid config.", e2, new Object[0]);
            this.k.a(774, -1.0d);
            return amri.b(new adll("finished-execution", adre.a(new adrc[0])));
        }
    }

    public final void b() {
        amri amri = (amri) this.n.get();
        if (amri.a()) {
            ((adoc) amri.b()).e();
        }
    }

    public final adll c() {
        adll adll;
        int intValue;
        this.j.d();
        this.l.d();
        this.k.a(true);
        amri e2 = e();
        if (e2.a()) {
            return (adll) e2.b();
        }
        try {
            this.m.c();
            try {
                this.j.a();
                this.l.a();
                try {
                    String str = (String) adke.i.a();
                    if (amrk.a(str)) {
                        e.e("Unable to continue due to empty streamingPropertyFiles flag.", new Object[0]);
                        adll = new adll("non-streaming-download", adre.a(new adrc[0]));
                    } else {
                        try {
                            List a = adkd.a(str);
                            amri e3 = e();
                            if (!e3.a()) {
                                int size = a.size();
                                intValue = ((Integer) a(f)).intValue();
                                while (intValue < size) {
                                    adkc adkc = (adkc) a.get(intValue);
                                    if (h.contains(adkc.a)) {
                                        iwd iwd = e;
                                        String str2 = adkc.a;
                                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 37);
                                        sb.append(intValue + 1);
                                        sb.append("/");
                                        sb.append(size);
                                        sb.append(": Downloading ");
                                        sb.append(str2);
                                        iwd.b(sb.toString(), new Object[0]);
                                        adna a2 = adna.a(this.i, adkc.a, adjx.c());
                                        adod adod = (adod) this.m.a().c();
                                        if (adod != null) {
                                            adnu a3 = adoc.a(this.i);
                                            a3.a = this.k.d().a;
                                            a3.d = adkc.b;
                                            a3.e = adkc.c;
                                            a3.h = admw.a();
                                            a3.f = admx.a(this.i);
                                            a3.b = a2;
                                            a3.i = adod;
                                            adoc a4 = a3.a();
                                            this.n.set(amri.b(a4));
                                            a4.a();
                                        } else {
                                            throw new adnw("No network available");
                                        }
                                    } else {
                                        e.b("%d/%d: %s is to be streamed; skipped.", Integer.valueOf(intValue + 1), Integer.valueOf(size), adkc.a);
                                    }
                                    intValue++;
                                }
                                adrd a5 = adre.a();
                                a5.a(admu.e, admy.a().getAbsolutePath());
                                adll = new adll("streaming-process-package", a5.a());
                            } else {
                                adll = (adll) e3.b();
                            }
                        } catch (IOException e4) {
                            e.e("Unable to continue due to invalid streamingPropertyFiles flag.", e4, new Object[0]);
                            adll = new adll("non-streaming-download", adre.a(new adrc[0]));
                        }
                    }
                } catch (adnx e5) {
                    e.e("Unable to create the file.", e5, new Object[0]);
                    this.k.a(518, -1.0d);
                    adrd b = a().b();
                    b.a(f, Integer.valueOf(intValue));
                    adre a6 = b.a();
                    admd f2 = adme.f();
                    f2.a(ayou.c());
                    f2.a("streaming-download", a6);
                    adll = f2.b();
                } catch (adnw e6) {
                    e.e("Failed to download.", e6, new Object[0]);
                    this.k.a(262, -1.0d);
                    adll = a(intValue);
                } catch (adnv e7) {
                    e.e("Download cancelled.", e7, new Object[0]);
                    adrd b2 = a().b();
                    b2.a(f, Integer.valueOf(intValue));
                    adll = new adll("streaming-download", b2.a());
                } catch (Throwable th) {
                    this.j.b();
                    this.l.b();
                    throw th;
                }
                this.j.b();
                this.l.b();
                return adll;
            } finally {
                this.m.b();
            }
        } catch (IOException e8) {
            e.e("Failed to request for the network.", e8, new Object[0]);
            this.k.a(262, -1.0d);
            return a(((Integer) a(f)).intValue());
        }
    }

    public final boolean d() {
        try {
            if (adjx.a(this.i, this.m.a(), this.k.d()).a != 2) {
                b();
            }
            return true;
        } catch (adju e2) {
            return true;
        }
    }

    public static adms a(Context context, adre adre) {
        iva.a(adjw.a());
        iva.a(jkr.c());
        return new adms(context, adre);
    }
}
