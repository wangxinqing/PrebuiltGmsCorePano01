package defpackage;

import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: aedi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aedi {
    public final ahhc a;
    private final ahha b;
    private final amsv c = amta.a((amsv) new aedh(this));

    private aedi(ScheduledExecutorService scheduledExecutorService, ahhd ahhd, Application application, String str) {
        amta.a((amsv) new aedf(this));
        amta.a((amsv) new aedg(this));
        ahhc a2 = ahhc.a(str);
        this.a = a2;
        ahha ahha = a2.c;
        if (ahha != null) {
            this.b = ahha;
            ((ahhj) ahha).b = ahhd;
            return;
        }
        this.b = ahhj.a(ahhd, scheduledExecutorService, this.a, application);
    }

    public static aedi a(ScheduledExecutorService scheduledExecutorService, ahhd ahhd, Application application) {
        return new aedi(scheduledExecutorService, ahhd, application, "gmscore_auth_api_account_transfer");
    }

    public final void a(String str, String str2) {
        ((ahgz) this.c.a()).b(str, str2);
    }
}
