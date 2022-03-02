package defpackage;

import android.content.Context;
import com.google.android.gms.clearcut.service.ClearcutLoggerChimeraService;
import com.google.android.gms.common.api.Status;

/* renamed from: htn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class htn extends nis {
    private final hsx a;
    private final String b;

    public htn(hsx hsx, String str) {
        super(40, "GetCollectForDebugExpiryTimeOperation");
        this.a = hsx;
        this.b = str;
    }

    public final void a(Context context) {
        if (ClearcutLoggerChimeraService.a(this.b)) {
            this.a.b(Status.a, hpo.b(context).c);
            return;
        }
        throw new nja(31001, "Debug operation disallowed");
    }

    public final void a(Status status) {
        this.a.b(status, 0);
    }
}
