package defpackage;

import android.content.Context;
import com.google.android.gms.clearcut.CollectForDebugParcelable;
import com.google.android.gms.clearcut.service.ClearcutLoggerChimeraService;
import com.google.android.gms.common.api.Status;

/* renamed from: hto  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hto extends nis {
    private final hsx a;
    private final String b;

    public hto(hsx hsx, String str) {
        super(40, "GetCollectForDebugParcelableOperation");
        this.a = hsx;
        this.b = str;
    }

    public final void a(Context context) {
        if (ClearcutLoggerChimeraService.a(this.b)) {
            this.a.b(Status.a, hpo.b(context));
            return;
        }
        throw new nja(31001, "Debug operation disallowed");
    }

    public final void a(Status status) {
        this.a.b(status, (CollectForDebugParcelable) null);
    }
}
