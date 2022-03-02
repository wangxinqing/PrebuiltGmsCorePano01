package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;

/* renamed from: acfa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acfa extends nis {
    public final abvc a;
    public final acfg b;
    private final Handler c;

    public acfa(acfg acfg, abvc abvc, Handler handler) {
        super(211, "AbortDirectTransferOperation");
        this.a = abvc;
        this.b = acfg;
        this.c = handler;
    }

    public final void a(Context context) {
        this.c.post(new acez(this));
    }

    public final void a(Status status) {
        this.b.a(status);
    }
}
