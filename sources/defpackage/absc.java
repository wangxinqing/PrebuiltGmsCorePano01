package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;

/* renamed from: absc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class absc extends nis {
    public final abxe a;
    public final absf b;
    public final BootstrapConfigurations c;
    private final Handler d;

    public absc(abxe abxe, BootstrapConfigurations bootstrapConfigurations, absf absf, Handler handler) {
        super(75, "UpdateBootstrapConfigurationOperation");
        this.a = abxe;
        this.b = absf;
        this.c = bootstrapConfigurations;
        this.d = handler;
    }

    public final void a(Context context) {
        this.d.post(new absb(this));
    }

    public final void a(Status status) {
        this.a.h(status);
    }
}
