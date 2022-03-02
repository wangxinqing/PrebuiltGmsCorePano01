package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;

/* renamed from: abun  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abun extends nis {
    public final BootstrapOptions a;
    public final abxn b;
    public final abvc c;
    public final abxq d;
    private final Handler e;

    public abun(abxq abxq, abvc abvc, BootstrapOptions bootstrapOptions, abxn abxn, Handler handler) {
        super(76, "EnableTargetModeOperation");
        this.a = bootstrapOptions;
        this.b = abxn;
        this.c = abvc;
        this.d = abxq;
        this.e = handler;
    }

    public final void a(Context context) {
        this.e.post(new abum(this));
    }

    public final void a(Status status) {
        this.d.a(status);
    }
}
