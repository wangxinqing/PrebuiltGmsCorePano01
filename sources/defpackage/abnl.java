package defpackage;

import android.os.Handler;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: abnl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abnl implements abst {
    public final Handler a;
    public D2DDevice b;
    public final aclv c;
    private final ScheduledExecutorService d;
    private final long e;
    private final abst f;
    private Future g;
    private boolean h = true;

    public abnl(Handler handler, long j, abst abst, aclv aclv) {
        jfc a2 = jfm.a(1, 10);
        this.a = handler;
        this.d = a2;
        this.e = j;
        this.f = abst;
        this.c = aclv;
    }

    public final void a() {
    }

    public final void b(D2DDevice d2DDevice) {
    }

    public final void a(int i) {
        this.b = null;
        Future future = this.g;
        if (future != null) {
            future.cancel(true);
            this.g = null;
        }
    }

    public final void a(D2DDevice d2DDevice) {
        if (!d2DDevice.equals(this.b)) {
            D2DDevice d2DDevice2 = this.b;
            if (d2DDevice2 != null || !this.h) {
                if (d2DDevice2 != null) {
                    this.f.a(d2DDevice2);
                    this.b = null;
                }
                Future future = this.g;
                if (future != null) {
                    future.cancel(true);
                    this.g = null;
                }
                this.f.a(d2DDevice);
                this.h = false;
                return;
            }
            this.b = d2DDevice;
            this.g = ((jfv) this.d).schedule((Runnable) new abnk(this), this.e, TimeUnit.MILLISECONDS);
        }
    }
}
