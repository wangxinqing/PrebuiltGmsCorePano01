package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: lxp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lxp extends nis {
    private final ifu a;

    public lxp(ifu ifu) {
        super(184, "IsInDrivingModeOperation");
        this.a = ifu;
    }

    public final void a(Context context) {
        luv luv = new luv(context);
        try {
            this.a.a(new Status(0, Boolean.valueOf(luv.a.b()).toString()));
            luv.close();
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void a(Status status) {
        this.a.a(status);
    }
}
