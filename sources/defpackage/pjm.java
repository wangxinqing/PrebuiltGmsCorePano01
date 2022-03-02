package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: pjm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pjm extends nis {
    private final pjl a;
    private final pia b;

    public pjm(pia pia, pjl pjl, String str) {
        super(127, str);
        this.b = pia;
        this.a = pjl;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        if (!pbq.a()) {
            this.a.a(new Status(17, "Delegate aborted"));
        }
        if (!hxz.g(context)) {
            this.a.a(new Status(13, "Diagnostics API not enabled on this device."));
        } else {
            this.a.a();
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Status status) {
        this.b.e("%s#onFailure: %s", this.m, status);
        this.a.a(status);
    }
}
