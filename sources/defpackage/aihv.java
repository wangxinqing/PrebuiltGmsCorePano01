package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.location.internal.DeviceOrientationRequestInternal;

/* renamed from: aihv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aihv implements IBinder.DeathRecipient, jio {
    private static final String[] e = new String[0];
    public final DeviceOrientationRequestInternal a;
    public final String b;
    public final int c;
    public final rdz d;
    private final aiib f;

    public aihv(int i, String str, DeviceOrientationRequestInternal deviceOrientationRequestInternal, aiib aiib, rdz rdz) {
        this.c = i;
        this.b = str;
        this.a = deviceOrientationRequestInternal;
        this.f = aiib;
        this.d = rdz;
        try {
            rdz.asBinder().linkToDeath(this, 0);
        } catch (RemoteException e2) {
            this.f.a(this.d);
        }
    }

    public final void a() {
        this.f.a(this.d);
    }

    public final void binderDied() {
        a();
    }

    public final int j() {
        return this.c;
    }

    public final String k() {
        return this.b;
    }

    public final String l() {
        return null;
    }

    public final String[] m() {
        return e;
    }
}
