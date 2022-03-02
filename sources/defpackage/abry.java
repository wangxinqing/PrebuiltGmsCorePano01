package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;

/* renamed from: abry  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abry extends nis {
    public final abxe a;
    public final abxk b;
    public final absf c;
    private final Handler d;

    public abry(abxe abxe, abxk abxk, absf absf, Handler handler) {
        super(75, "StartScanOperation");
        this.b = abxk;
        this.a = abxe;
        this.c = absf;
        this.d = handler;
    }

    public final void a(Context context) {
        this.d.post(new abrx(this));
    }

    public final void a(Status status) {
        this.a.a(status);
    }
}
