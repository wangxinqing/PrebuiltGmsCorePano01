package defpackage;

import android.content.Context;
import com.google.android.gms.clearcut.service.ClearcutLoggerChimeraService;
import com.google.android.gms.common.api.Status;

/* renamed from: htv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class htv extends nis {
    private final hsx a;
    private final String b;

    public htv(hsx hsx, String str) {
        super(40, "StopCollectForDebugOperation");
        this.a = hsx;
        this.b = str;
    }

    public final void a(Context context) {
        if (ClearcutLoggerChimeraService.a(this.b)) {
            hpo.a(context);
            this.a.c(Status.a);
            return;
        }
        throw new nja(31001, "Debug operation disallowed");
    }

    public final void a(Status status) {
        this.a.c(status);
    }
}
