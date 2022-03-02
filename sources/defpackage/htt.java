package defpackage;

import android.content.Context;
import com.google.android.gms.clearcut.CollectForDebugParcelable;
import com.google.android.gms.clearcut.service.ClearcutLoggerChimeraService;
import com.google.android.gms.common.api.Status;

/* renamed from: htt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class htt extends nis {
    private final hsx a;
    private final String b;
    private final hwn c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public htt(hsx hsx, String str) {
        super(40, "StartCollectForDebugOperation");
        hwn a2 = hwn.a();
        this.a = hsx;
        this.b = str;
        this.c = a2;
    }

    public final void a(Context context) {
        if (ClearcutLoggerChimeraService.a(this.b)) {
            CollectForDebugParcelable a2 = hpo.a(context, false);
            this.c.b();
            this.a.a(Status.a, a2.c);
            return;
        }
        throw new nja(31001, "Debug operation disallowed");
    }

    public final void a(Status status) {
        this.a.a(status, 0);
    }
}
