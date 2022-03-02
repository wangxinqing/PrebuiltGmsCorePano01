package defpackage;

import android.os.RemoteException;
import com.google.android.gms.smartdevice.d2d.D2DDevice;

/* renamed from: absu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class absu implements abst {
    private static final iwd a = acqa.a("D2D", "SourceDeviceScanController");
    private final abxk b;

    public absu(abxk abxk) {
        iva.a((Object) abxk);
        this.b = abxk;
    }

    public final void a() {
        try {
            this.b.b();
        } catch (RemoteException e) {
            a.e("Error invoking callback.", e, new Object[0]);
        }
    }

    public final void b(D2DDevice d2DDevice) {
        try {
            this.b.b(d2DDevice);
        } catch (RemoteException e) {
            a.a((Throwable) e);
        }
    }

    public final void a(int i) {
        try {
            this.b.a(i);
        } catch (RemoteException e) {
            a.e("Error invoking callback.", e, new Object[0]);
        }
    }

    public final void a(D2DDevice d2DDevice) {
        try {
            this.b.a(d2DDevice);
        } catch (RemoteException e) {
            a.e("Error invoking callback.", e, new Object[0]);
        }
    }
}
