package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.ManagedAccountSetupInfo;
import java.util.concurrent.Executor;

/* renamed from: abut  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abut extends nis {
    public final abxq a;
    private final abzy b;
    private final Handler c;

    public abut(abxq abxq, abzy abzy, Handler handler) {
        super(76, "GetManagedAccountSetupInfoOperation");
        this.b = abzy;
        this.c = handler;
        this.a = abxq;
    }

    public final void a(Context context) {
        this.b.b().a((Executor) new jls(this.c), (acvp) new abus(this));
    }

    public final void a(Status status) {
        this.a.a(status, (ManagedAccountSetupInfo) null);
    }
}
