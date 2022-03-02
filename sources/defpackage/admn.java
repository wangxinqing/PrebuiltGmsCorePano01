package defpackage;

import com.google.android.gms.update.SystemUpdateStatus;

/* renamed from: admn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class admn extends adlq {
    private final adla e = ((adla) adla.h.b());

    public admn(adre adre) {
        super("pending", adre);
    }

    public final adll c() {
        SystemUpdateStatus d = this.e.d();
        if (amrk.a(d.a)) {
            this.e.a(0, -1.0d);
            return new adll("finished-execution", adre.a(new adrc[0]));
        } else if (!d.b) {
            return new adll("pre-download-validate", adre.a(new adrc[0]));
        } else {
            adrd a = adre.a();
            a.a(admm.e, d.a);
            return new adll("non-streaming-process-package", a.a());
        }
    }
}
