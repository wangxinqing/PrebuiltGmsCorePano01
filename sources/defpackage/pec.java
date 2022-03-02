package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: pec  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pec implements pjl {
    private final ifu a;
    private final aeqd b;

    public pec(ifu ifu, aeqd aeqd) {
        this.a = ifu;
        this.b = aeqd;
    }

    public final void a() {
        try {
            this.b.h = null;
            this.a.a(Status.a);
        } catch (Exception e) {
            this.a.a(pku.a("resetTesting", 8, "Failed to reset"));
        }
    }

    public final void a(Status status) {
        this.a.a(status);
    }
}
