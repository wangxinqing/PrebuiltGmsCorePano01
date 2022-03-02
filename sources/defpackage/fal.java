package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.common.api.Status;

/* renamed from: fal  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fal implements Runnable {
    private final fbk a;

    public fal(fbk fbk) {
        this.a = fbk;
    }

    public final void run() {
        fbk fbk = this.a;
        fbk.a(new fbm(Status.a, amri.b(new AuthorizationResult(fbk.i, fbk.j, fbk.k, amym.a((Iterable) fbk.o).a(faz.a).b(), fbk.x, (PendingIntent) null))));
    }
}
