package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.D2DDevice;

/* renamed from: abrf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abrf implements Runnable {
    final /* synthetic */ abrg a;

    public abrf(abrg abrg) {
        this.a = abrg;
    }

    public final void run() {
        abrg abrg = this.a;
        absf absf = abrg.b;
        abxe abxe = abrg.a;
        D2DDevice d2DDevice = abrg.c;
        BootstrapConfigurations bootstrapConfigurations = abrg.d;
        abwy abwy = abrg.e;
        iva.a(absf.c);
        int i = 2;
        absf.b.e(2);
        acaj.a(absf.b, 5);
        abra abra = absf.d;
        if (!azjt.e()) {
            iva.a((Object) d2DDevice, (Object) "device should not be null.");
        }
        iva.a((Object) abwy, (Object) "bootstrapListener should not be null.");
        if (abra.k == null) {
            abra.a.e("No connection established. Before bootstrapping, you should connect to the device", new Object[0]);
            abra.d(abxe, new Status(10567));
        } else if (abra.l != null) {
            abra.a.e("Bootstrap already in progress.", new Object[0]);
            abra.d(abxe, new Status(10561));
        } else {
            if (!azjt.e() || d2DDevice != null) {
                iva.a((Object) abra.i, (Object) "mTargetDevice should not be null!");
                if (!ius.a(d2DDevice.d, abra.i.d)) {
                    abra.a.e("Device that should be bootstrapped does not match device we're currently connected to.", new Object[0]);
                    abra.d(abxe, new Status(10568));
                    return;
                }
            }
            Status status = new Status(8);
            try {
                abra.l = abwy;
                if (!azjt.e()) {
                    abra.k.a(bootstrapConfigurations, d2DDevice.b);
                } else {
                    D2DDevice d2DDevice2 = abra.i;
                    if (d2DDevice2 != null) {
                        i = d2DDevice2.b;
                    }
                    abra.k.a(bootstrapConfigurations, i);
                }
                status = new Status(0);
            } finally {
                abra.d(abxe, status);
            }
        }
    }
}
