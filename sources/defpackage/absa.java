package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;

/* renamed from: absa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class absa extends nis {
    public final abxe a;
    public final absf b;
    private final Handler c;

    public absa(abxe abxe, absf absf, Handler handler) {
        super(75, "StopScanOperation");
        this.a = abxe;
        this.b = absf;
        this.c = handler;
    }

    public final void a(Context context) {
        this.c.post(new abrz(this));
    }

    public final void a(Status status) {
        this.a.b(status);
    }
}
