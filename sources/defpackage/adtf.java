package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: adtf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class adtf extends adso {
    private final adsv a;
    private final idg b;
    private final adsr c;

    public final void b(Status status) {
        if (!status.c()) {
            this.b.a((Object) status);
        } else {
            this.b.a((Object) Status.a);
        }
    }

    public final void c(Status status) {
        if (status.c()) {
            adsr adsr = this.c;
            if (adsr == null) {
                this.b.a((Object) Status.a);
            } else {
                this.a.a((adss) adsr, (adsp) this);
            }
        } else {
            this.b.a((Object) status);
        }
    }

    public adtf(adsv adsv, idg idg, adsr adsr) {
        this.a = adsv;
        this.b = idg;
        this.c = adsr;
    }
}
