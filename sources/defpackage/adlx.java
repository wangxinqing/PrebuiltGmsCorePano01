package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: adlx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adlx extends adlq {
    static final adro e = new adro("file_path", "");
    static final adro f = new adro("dir_path", "");
    static final adra g = new adra("payload_metadata_downloaded", false);
    static final adrg h = new adrg("network_error_attempts", 0);
    private final Context i;
    private final adla j = ((adla) adla.h.b());

    public adlx(Context context, adre adre) {
        super("ab-update-prep", adre);
        this.i = context;
    }

    private final adll e() {
        if (!ayox.i() || amrk.a((String) adke.i.a())) {
            adrd a = adre.a();
            a.a(admk.e.b((String) a().a((adri) e)));
            return new adll("non-streaming-ab-apply", a.a());
        }
        adrd a2 = adre.a();
        a2.a(admr.e, (String) a(f));
        return new adll("streaming-apply", a2.a());
    }

    public final adll c() {
        amri amri;
        amri amri2;
        if (!aypy.a.a().c() || !jkr.i()) {
            return e();
        }
        this.j.a(2323, -1.0d);
        boolean booleanValue = ((Boolean) a(g)).booleanValue();
        try {
            amrl.a(jkr.i(), (Object) "Attempt to cleanupAppliedPayload on unsupported platform version.");
            adnq.a.c("cleanupAppliedPayload()", new Object[0]);
            int cleanupAppliedPayload = ((adnq) adnq.b.b()).d.cleanupAppliedPayload();
            if (cleanupAppliedPayload == 1) {
                this.j.a(2067, -1.0d);
                admd f2 = adme.f();
                f2.a(aypy.a.a().b());
                f2.a("ab-update-prep", a().b().a());
                amri = amri.b(f2.b());
            } else if (cleanupAppliedPayload != 61) {
                amri = ampu.a;
            } else {
                this.j.a(24, -1.0d);
                amri = amri.b(new adll("finished-execution", adre.a(new adrc[0])));
            }
            if (amri.a()) {
                return (adll) amri.b();
            }
            if (!booleanValue) {
                booleanValue = admz.a(this.i, this.j.d().a);
            }
            if (booleanValue) {
                try {
                    amrl.a(jkr.i(), (Object) "Attempt to allocateSpace on unsupported platform version.");
                    amri amri3 = (amri) ((adrn) adrn.a.b()).b(adls.h);
                    amrl.a(amri3.a(), (Object) "Unable to allocate space due to missing AbPayloadSpec.");
                    File file = new File(admy.a().getAbsolutePath(), "payload_metadata.bin");
                    admy.a(file);
                    adnq.a.c("allocateSpace()", new Object[0]);
                    int errorCode = ((adnq) adnq.b.b()).d.allocateSpace(file.getAbsolutePath(), (String[]) anbs.a((Iterable) ((adqq) amri3.b()).b, String.class)).getErrorCode();
                    if (errorCode == 1) {
                        this.j.a(1811, -1.0d);
                        admd f3 = adme.f();
                        f3.a(aypy.b());
                        adrd b = a().b();
                        b.a(g.b(true));
                        f3.a("ab-update-prep", b.a());
                        amri2 = amri.b(f3.b());
                    } else if (errorCode != 60) {
                        amri2 = ampu.a;
                    } else {
                        this.j.a(1555, -1.0d);
                        admd f4 = adme.f();
                        f4.a(aypy.b());
                        adrd b2 = a().b();
                        b2.a(g.b(true));
                        f4.a("ab-update-prep", b2.a());
                        amri2 = amri.b(f4.b());
                    }
                    if (amri2.a()) {
                        return (adll) amri2.b();
                    }
                    return e();
                } catch (adnv | adnw | adnx e2) {
                    adrd b3 = a().b();
                    b3.a(g, Boolean.valueOf(booleanValue));
                    adrg adrg = h;
                    b3.a(adrg, Integer.valueOf(((Integer) a(adrg)).intValue() + 1));
                    adre a = b3.a();
                    this.j.a(2579, -1.0d);
                    adma f5 = admb.f();
                    f5.a(ayou.d(), ayou.e());
                    f5.a(ayou.f());
                    f5.a(((Integer) a(h)).intValue());
                    f5.a("ab-update-prep", a);
                    return f5.b();
                }
            } else {
                throw new adnw("Unable to download payload metadata.");
            }
        } catch (adnv | adnw | adnx e3) {
            adrd b32 = a().b();
            b32.a(g, Boolean.valueOf(booleanValue));
            adrg adrg2 = h;
            b32.a(adrg2, Integer.valueOf(((Integer) a(adrg2)).intValue() + 1));
            adre a2 = b32.a();
            this.j.a(2579, -1.0d);
            adma f52 = admb.f();
            f52.a(ayou.d(), ayou.e());
            f52.a(ayou.f());
            f52.a(((Integer) a(h)).intValue());
            f52.a("ab-update-prep", a2);
            return f52.b();
        }
    }
}
