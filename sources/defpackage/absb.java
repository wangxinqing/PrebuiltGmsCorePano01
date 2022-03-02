package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;

/* renamed from: absb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class absb implements Runnable {
    final /* synthetic */ absc a;

    public absb(absc absc) {
        this.a = absc;
    }

    public final void run() {
        absc absc = this.a;
        absf absf = absc.b;
        abxe abxe = absc.a;
        BootstrapConfigurations bootstrapConfigurations = absc.c;
        iva.a(absf.c);
        absf.b.e(2);
        acaj.a(absf.b, 9);
        abra abra = absf.d;
        if (abra.k == null) {
            abra.a.e("No connection established. Before bootstrapping, you should connect to the device", new Object[0]);
            abra.d(abxe, new Status(10567));
            return;
        }
        Status status = new Status(8);
        try {
            abqd abqd = abra.k;
            abqd.d.a("Updating BootstrapConfigurations.", new Object[0]);
            iva.a((Object) bootstrapConfigurations, (Object) "bootstrapConfigurations cannot be null.");
            abqd.g = bootstrapConfigurations;
            abqd.a(bootstrapConfigurations, true);
            status = new Status(0);
        } finally {
            abra.e(abxe, status);
        }
    }
}
