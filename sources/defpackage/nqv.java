package defpackage;

import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: nqv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nqv {
    public final ahhc a;
    public final amsv b = amta.a((amsv) new nqq(this));
    public final amsv c;
    private final ahha d;
    private final amsv e = amta.a((amsv) new nqp(this));
    private final amsv f;

    public nqv(ScheduledExecutorService scheduledExecutorService, ahhd ahhd, String str) {
        amta.a((amsv) new nqr(this));
        this.f = amta.a((amsv) new nqs(this));
        amta.a((amsv) new nqt(this));
        this.c = amta.a((amsv) new nqu(this));
        ahhc a2 = ahhc.a(str);
        this.a = a2;
        ahha ahha = a2.c;
        if (ahha != null) {
            this.d = ahha;
            ((ahhj) ahha).b = ahhd;
            return;
        }
        this.d = ahhj.a(ahhd, scheduledExecutorService, this.a, (Application) null);
    }

    public final void a(String str) {
        ((ahgz) this.e.a()).b(str);
    }

    public final void a(String str, String str2, boolean z) {
        ((ahgz) this.f.a()).b(str, str2, Boolean.valueOf(z));
    }
}
