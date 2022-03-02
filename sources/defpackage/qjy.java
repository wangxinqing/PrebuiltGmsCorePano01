package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: qjy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qjy extends jba {
    private static final qfn a = new qfn("DomainFilterUpdateOperation");
    private final qjt d;
    private final ifu e;
    private final avwm f;

    public qjy(qjt qjt, ifu ifu, avwm avwm) {
        super(121, "DomainFilterUpdateOperation");
        this.d = qjt;
        this.e = ifu;
        this.f = avwm;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        int a2 = this.d.a(this.f);
        if (a2 == 1) {
            this.e.a(Status.a);
            return;
        }
        a.c("Could not update domain filter immediately. Status: %d, domainFilterRequestType: %s", Integer.valueOf(a2), this.f.name());
        this.e.a(Status.e);
    }
}
