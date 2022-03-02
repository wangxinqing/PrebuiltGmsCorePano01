package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;

/* renamed from: abux  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abux extends nis {
    public final abxn a;
    public final abvc b;
    public final abxq c;
    private final Handler d;

    public abux(abxq abxq, abvc abvc, abxn abxn, Handler handler) {
        super(76, "ResumeBootstrapOperation");
        this.a = abxn;
        this.b = abvc;
        this.c = abxq;
        this.d = handler;
    }

    public final void a(Context context) {
        this.d.post(new abuw(this));
    }

    public final void a(Status status) {
        this.c.b(status);
    }
}
