package defpackage;

import android.os.Looper;
import com.google.android.gms.smartdevice.d2d.CleanSharedSecretChimeraService;

/* renamed from: abog  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class abog implements Runnable {
    private final CleanSharedSecretChimeraService a;

    public abog(CleanSharedSecretChimeraService cleanSharedSecretChimeraService) {
        this.a = cleanSharedSecretChimeraService;
    }

    public final void run() {
        CleanSharedSecretChimeraService cleanSharedSecretChimeraService = this.a;
        if (CleanSharedSecretChimeraService.b()) {
            new abzy(cleanSharedSecretChimeraService, new qvr(Looper.getMainLooper())).b().a((acvv) new aboh(cleanSharedSecretChimeraService));
        }
        new abpg(cleanSharedSecretChimeraService).a().a((acvv) new aboi(cleanSharedSecretChimeraService));
        if (new aceb(cleanSharedSecretChimeraService).a() != null) {
            CleanSharedSecretChimeraService.b(cleanSharedSecretChimeraService);
        }
    }
}
