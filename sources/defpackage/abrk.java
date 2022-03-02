package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.D2DDevice;

/* renamed from: abrk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abrk extends nis {
    public final abxe a;
    public final absf b;
    public final D2DDevice c;
    public final String d;
    public final abxb e;
    private final Handler f;

    public abrk(abxe abxe, D2DDevice d2DDevice, String str, abxb abxb, absf absf, Handler handler) {
        super(75, "ConnectOperation");
        this.a = abxe;
        this.b = absf;
        this.c = d2DDevice;
        this.d = str;
        this.e = abxb;
        this.f = handler;
    }

    public final void a(Context context) {
        this.f.post(new abrj(this));
    }

    public final void a(Status status) {
        this.a.c(status);
    }
}
