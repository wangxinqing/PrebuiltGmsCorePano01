package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.D2DDevice;

/* renamed from: abrg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abrg extends nis {
    public final abxe a;
    public final absf b;
    public final D2DDevice c;
    public final BootstrapConfigurations d;
    public final abwy e;
    private final Handler f;

    public abrg(abxe abxe, D2DDevice d2DDevice, BootstrapConfigurations bootstrapConfigurations, abwy abwy, absf absf, Handler handler) {
        super(75, "BootstrapOperation");
        this.a = abxe;
        this.b = absf;
        this.c = d2DDevice;
        this.d = bootstrapConfigurations;
        this.e = abwy;
        this.f = handler;
    }

    public final void a(Context context) {
        this.f.post(new abrf(this));
    }

    public final void a(Status status) {
        this.a.d(status);
    }
}
