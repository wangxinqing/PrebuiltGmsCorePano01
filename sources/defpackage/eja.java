package defpackage;

import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: eja  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eja {
    public final ahhc a;
    public final amsv b = amta.a((amsv) new eix(this));
    public final amsv c = amta.a((amsv) new eiy(this));
    public final amsv d = amta.a((amsv) new eiz(this));
    private final ahha e;

    public eja(ScheduledExecutorService scheduledExecutorService, ahhd ahhd, Application application, String str) {
        ahhc a2 = ahhc.a(str);
        this.a = a2;
        ahha ahha = a2.c;
        if (ahha != null) {
            this.e = ahha;
            ((ahhj) ahha).b = ahhd;
            return;
        }
        this.e = ahhj.a(ahhd, scheduledExecutorService, this.a, application);
    }
}
