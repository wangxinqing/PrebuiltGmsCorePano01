package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import com.google.android.gms.smartdevice.d2d.SourceDeviceServiceController$BluetoothPairingHelper;

/* renamed from: abra  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abra implements abnn {
    public static final iwd a = acqa.a("D2D", "SourceDeviceServiceController");
    public static final boolean b;
    public final abpo c;
    public final acah d;
    public final acqi e;
    public final abob f;
    public final abvs g;
    public final abqg h;
    public D2DDevice i;
    public abst j;
    public abqd k;
    public abwy l;
    public boolean m;
    private final Context n;
    private SourceDeviceServiceController$BluetoothPairingHelper o;

    static {
        boolean z = false;
        if (!jkr.b()) {
            int i2 = Build.VERSION.SDK_INT;
            z = true;
        }
        b = z;
    }

    public static void a(abxe abxe, Status status) {
        try {
            abxe.a(status);
        } catch (RemoteException e2) {
            a.a((Throwable) e2);
        }
    }

    public static void b(abxe abxe, Status status) {
        try {
            abxe.b(status);
        } catch (RemoteException e2) {
            a.a((Throwable) e2);
        }
    }

    public static void c(abxe abxe, Status status) {
        try {
            abxe.c(status);
        } catch (RemoteException e2) {
            a.a((Throwable) e2);
        }
    }

    public static void d(abxe abxe, Status status) {
        try {
            abxe.d(status);
        } catch (RemoteException e2) {
            a.a((Throwable) e2);
        }
    }

    public static void e(abxe abxe, Status status) {
        try {
            abxe.h(status);
        } catch (RemoteException e2) {
            a.a((Throwable) e2);
        }
    }

    public static void f(abxe abxe, Status status) {
        try {
            abxe.e(status);
        } catch (RemoteException e2) {
            a.a((Throwable) e2);
        }
    }

    public static void g(abxe abxe, Status status) {
        try {
            abxe.f(status);
        } catch (RemoteException e2) {
            a.a((Throwable) e2);
        }
    }

    public static void h(abxe abxe, Status status) {
        try {
            abxe.g(status);
        } catch (RemoteException e2) {
            a.a((Throwable) e2);
        }
    }

    public final void c() {
        this.j = null;
    }

    public abra(abpo abpo) {
        abpx abpx = new abpx(new abqo(abpo.a, abpo.b), new abqw(acec.a(abpo.a), abpo));
        acqi b2 = acec.b(abpo.a);
        abob abob = abob.a;
        abvs a2 = abvs.a(abpo.a);
        this.c = abpo;
        this.n = abpo.a;
        this.d = (acah) abpo.c;
        this.e = b2;
        this.h = abpx;
        this.f = abob;
        this.g = a2;
    }

    public final void a() {
        a.a("resetState()", new Object[0]);
        this.l = null;
        e();
        c();
        a.a("resetBootstrapController()", new Object[0]);
        abqd abqd = this.k;
        if (abqd != null) {
            abqd.e();
            this.k = null;
        }
        a.a("resetTargetDevice()", new Object[0]);
        this.i = null;
        b();
    }

    public final void b() {
        a.a("resetBluetoothController()", new Object[0]);
        this.e.b();
    }

    public final void d() {
        if (this.o == null) {
            this.o = new SourceDeviceServiceController$BluetoothPairingHelper(this.n);
        }
        SourceDeviceServiceController$BluetoothPairingHelper sourceDeviceServiceController$BluetoothPairingHelper = this.o;
        sourceDeviceServiceController$BluetoothPairingHelper.a.registerReceiver(sourceDeviceServiceController$BluetoothPairingHelper, sourceDeviceServiceController$BluetoothPairingHelper.b);
        this.m = true;
    }

    public final void e() {
        if (this.m) {
            SourceDeviceServiceController$BluetoothPairingHelper sourceDeviceServiceController$BluetoothPairingHelper = this.o;
            sourceDeviceServiceController$BluetoothPairingHelper.a.unregisterReceiver(sourceDeviceServiceController$BluetoothPairingHelper);
            this.m = false;
        }
    }

    public final void a(int i2) {
        this.c.d.a(i2);
    }

    public final void a(BootstrapCompletionResult bootstrapCompletionResult) {
        abwy abwy = this.l;
        if (abwy != null) {
            try {
                abwy.b();
            } catch (RemoteException e2) {
                a.a((Throwable) e2);
            }
        }
        this.c.d.a();
    }

    public final void a(String str) {
        abwy abwy = this.l;
        if (abwy != null) {
            try {
                abwy.a(str);
            } catch (RemoteException e2) {
                a.a((Throwable) e2);
            }
        }
    }

    public final boolean a(BootstrapProgressResult bootstrapProgressResult) {
        abwy abwy = this.l;
        if (abwy == null) {
            return false;
        }
        try {
            abwy.a(bootstrapProgressResult);
            return false;
        } catch (RemoteException e2) {
            a.a((Throwable) e2);
            return false;
        }
    }
}
