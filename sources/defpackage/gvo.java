package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.checkin.CheckinApiChimeraService;
import com.google.android.gms.common.api.Status;

/* renamed from: gvo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gvo extends gyh implements jbh {
    private final CheckinApiChimeraService a;
    private final jbf b;
    private final gxs c = ((gxs) gxs.a.b());

    public gvo(CheckinApiChimeraService checkinApiChimeraService, jbf jbf) {
        this.a = checkinApiChimeraService;
        this.b = jbf;
    }

    private final void b(Bundle bundle) {
        iva.a((Object) bundle);
        iva.a((Object) bundle.getString("com.google.android.gms.checkin.CHECKIN_SOURCE_PACKAGE"));
        jhg.c(this.a, amrk.b(bundle.getString("com.google.android.gms.checkin.CHECKIN_SOURCE_PACKAGE")));
    }

    private static Bundle a(Bundle bundle) {
        gvd gvd;
        if (jhg.b()) {
            gvd = gvc.a();
        } else {
            gvd = gvd.b();
        }
        return gvd.a(bundle);
    }

    public final void b(ifu ifu) {
        jbf jbf = this.b;
        CheckinApiChimeraService checkinApiChimeraService = this.a;
        jbf.a(checkinApiChimeraService, new gwj(checkinApiChimeraService, ifu));
    }

    public final void a(gyf gyf) {
        jbf jbf = this.b;
        CheckinApiChimeraService checkinApiChimeraService = this.a;
        jbf.a(checkinApiChimeraService, new gwh(checkinApiChimeraService, gyf));
    }

    public final void b(ifu ifu, Bundle bundle) {
        b(bundle);
        if (awrq.t()) {
            CheckinApiChimeraService checkinApiChimeraService = this.a;
            checkinApiChimeraService.startService(gyx.a(checkinApiChimeraService.getContainerService(), a(bundle)));
            ifu.a(new Status(21021));
            return;
        }
        new guy(this.a, this.b, ifu, a(bundle), false).a();
    }

    public final void a(ifu ifu) {
        if (!awrq.t()) {
            new guy(this.a, this.b, ifu, (Bundle) null, true).a();
        } else if (!((gyb) gyb.a.b()).c.get()) {
            ifu.a(new Status(21042));
        } else {
            this.c.a(new gxt(ifu), 0);
        }
    }

    public final void a(ifu ifu, Account account) {
        jbf jbf = this.b;
        CheckinApiChimeraService checkinApiChimeraService = this.a;
        jbf.a(checkinApiChimeraService, new gwi(checkinApiChimeraService, ifu, account));
    }

    public final void a(ifu ifu, Bundle bundle) {
        b(bundle);
        if (awrq.t()) {
            this.c.a(new gxt(ifu), SystemClock.elapsedRealtime());
            CheckinApiChimeraService checkinApiChimeraService = this.a;
            checkinApiChimeraService.startService(gyx.a(checkinApiChimeraService.getContainerService(), a(bundle)));
            return;
        }
        new guy(this.a, this.b, ifu, a(bundle), true).a();
    }
}
