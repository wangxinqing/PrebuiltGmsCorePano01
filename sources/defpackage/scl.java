package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdd.OverrideFileGroupRequest;

/* renamed from: scl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class scl extends nis {
    public final sbw a;
    public final OverrideFileGroupRequest b;
    public final ifu c;
    private final afqn d;

    public scl(afqn afqn, sbw sbw, OverrideFileGroupRequest overrideFileGroupRequest, ifu ifu) {
        super(152, "DiagnosticsOverrideOperation");
        this.d = afqn;
        this.a = sbw;
        this.b = overrideFileGroupRequest;
        this.c = ifu;
    }

    public final void a(Context context) {
        aorl.a(this.d.a(), new sck(this), aoqm.a);
    }

    public final void a(Status status) {
        this.c.a(status);
    }
}
