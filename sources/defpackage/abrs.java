package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.api.Status;

/* renamed from: abrs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abrs extends nis {
    public final abxe a;
    public final absf b;
    public final Bundle c;
    private final Handler d;

    public abrs(abxe abxe, Bundle bundle, absf absf, Handler handler) {
        super(75, "IsTransferInProgressOperation");
        this.a = abxe;
        this.b = absf;
        this.c = bundle;
        this.d = handler;
    }

    public final void a(Context context) {
        this.d.post(new abrr(this));
    }

    public final void a(Status status) {
        this.a.k(status);
    }
}
