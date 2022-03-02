package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: sdf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sdf extends nis {
    public final ifu a;
    private final afqn b;

    public sdf(afqn afqn, ifu ifu) {
        super(152, "MaintenanceOperation");
        this.b = afqn;
        this.a = ifu;
    }

    public final void a(Context context) {
        aorl.a(this.b.c(), new sde(this), aoqm.a);
    }

    public final void a(Status status) {
        this.a.a(status);
    }
}
