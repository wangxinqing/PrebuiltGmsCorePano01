package defpackage;

import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: abna  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abna {
    public final ahhc a;
    public final amsv b = amta.a((amsv) new abmt(this));
    public final amsv c = amta.a((amsv) new abmu(this));
    public final amsv d = amta.a((amsv) new abmv(this));
    public final amsv e = amta.a((amsv) new abmw(this));
    public final amsv f = amta.a((amsv) new abmy(this));
    public final amsv g = amta.a((amsv) new abmz(this));
    private final ahha h;
    private final amsv i = amta.a((amsv) new abms(this));
    private final amsv j = amta.a((amsv) new abmx(this));

    public abna(ScheduledExecutorService scheduledExecutorService, ahhd ahhd, Application application, String str) {
        ahhc a2 = ahhc.a(str);
        this.a = a2;
        ahha ahha = a2.c;
        if (ahha != null) {
            this.h = ahha;
            ((ahhj) ahha).b = ahhd;
            return;
        }
        this.h = ahhj.a(ahhd, scheduledExecutorService, this.a, application);
    }

    public final void a() {
        ((ahgz) this.i.a()).b(new Object[0]);
    }

    public final void a(int i2) {
        ((ahgz) this.j.a()).b(Integer.valueOf(i2));
    }
}
