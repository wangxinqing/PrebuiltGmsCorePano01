package defpackage;

import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: addc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class addc {
    public final ahhc a;
    public final amsv b = amta.a((amsv) new adcw(this));
    public final amsv c = amta.a((amsv) new adcx(this));
    public final amsv d;
    private final ahha e;
    private final amsv f;

    public addc(ScheduledExecutorService scheduledExecutorService, ahhd ahhd, String str) {
        amta.a((amsv) new adcy(this));
        this.d = amta.a((amsv) new adcz(this));
        this.f = amta.a((amsv) new adda(this));
        amta.a((amsv) new addb(this));
        ahhc a2 = ahhc.a(str);
        this.a = a2;
        ahha ahha = a2.c;
        if (ahha != null) {
            this.e = ahha;
            ((ahhj) ahha).b = ahhd;
            return;
        }
        this.e = ahhj.a(ahhd, scheduledExecutorService, this.a, (Application) null);
    }

    public final void a() {
        ((ahgz) this.f.a()).b(true);
    }
}
