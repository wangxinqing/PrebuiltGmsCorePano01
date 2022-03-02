package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.api.Status;

/* renamed from: aceu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aceu extends nis {
    public final acfg a;
    public final absf b;
    public final Bundle c;
    private final Handler d;

    public aceu(acfg acfg, Bundle bundle, absf absf, Handler handler) {
        super(210, "IsTransferInProgressOperation");
        this.a = acfg;
        this.b = absf;
        this.c = bundle;
        this.d = handler;
    }

    public final void a(Context context) {
        this.d.post(new acet(this));
    }

    public final void a(Status status) {
        this.a.a(status);
    }
}
