package defpackage;

import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: zsa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zsa {
    public final ahhc a;
    public final amsv b = amta.a((amsv) new zrv(this));
    public final amsv c = amta.a((amsv) new zrw(this));
    public final amsv d = amta.a((amsv) new zrx(this));
    public final amsv e = amta.a((amsv) new zry(this));
    public final amsv f = amta.a((amsv) new zrz(this));
    private final ahha g;

    public zsa(ScheduledExecutorService scheduledExecutorService, ahhd ahhd, Application application, String str) {
        ahhc a2 = ahhc.a(str);
        this.a = a2;
        ahha ahha = a2.c;
        if (ahha != null) {
            this.g = ahha;
            ((ahhj) ahha).b = ahhd;
            return;
        }
        this.g = ahhj.a(ahhd, scheduledExecutorService, this.a, application);
    }
}
