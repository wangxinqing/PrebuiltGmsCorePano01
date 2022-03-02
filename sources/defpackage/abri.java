package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.internal.ConnectParams;

/* renamed from: abri  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abri extends nis {
    public final ConnectParams a;
    public final absf b;
    private final Handler c;

    public abri(ConnectParams connectParams, absf absf, Handler handler) {
        super(75, "Connect2Operation");
        this.a = connectParams;
        this.b = absf;
        this.c = handler;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        this.c.post(new abrh(this));
    }

    /* access modifiers changed from: protected */
    public final void a(Status status) {
        abxe abxe = this.a.a;
        if (abxe != null) {
            abxe.c(status);
        }
    }
}
