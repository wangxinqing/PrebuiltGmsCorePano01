package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: lxq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lxq extends nis {
    final int a;
    private final ifu b;

    public lxq(ifu ifu, int i) {
        super(184, "StartDrivingModeOperation");
        this.b = ifu;
        this.a = i;
    }

    public final void a(Context context) {
        luv luv = new luv(context);
        try {
            luv.a.c(lxg.a(this.a));
            this.b.a(Status.a);
            new lts(context).a(anxu.DRIVING_MODE, anxt.DRIVING_MODE_CLIENT_START_DRIVING_MODE);
            luv.close();
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void a(Status status) {
        this.b.a(status);
    }
}
