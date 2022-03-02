package defpackage;

import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: acug  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acug {
    public final ahhc a;
    public final amsv b = amta.a((amsv) new acue(this));
    public final amsv c = amta.a((amsv) new acuf(this));
    private final ahha d;

    private acug(ScheduledExecutorService scheduledExecutorService, ahhd ahhd, String str) {
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

    public static acug a(ScheduledExecutorService scheduledExecutorService, ahhd ahhd) {
        return new acug(scheduledExecutorService, ahhd, "gmscore_subscribedfeeds");
    }

    public final void a(long j) {
        ((ahhj) this.d).c = j;
    }
}
