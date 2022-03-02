package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;

/* renamed from: aces  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aces extends nis {
    public final acfg a;
    public final absf b;
    private final Handler c;

    public aces(acfg acfg, absf absf, Handler handler) {
        super(210, "AbortDirectTransferOperation");
        this.a = acfg;
        this.b = absf;
        this.c = handler;
    }

    public final void a(Context context) {
        this.c.post(new acer(this));
    }

    public final void a(Status status) {
        this.a.a(status);
    }
}
