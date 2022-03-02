package defpackage;

import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;

/* renamed from: acev  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acev implements Runnable {
    final /* synthetic */ BootstrapConfigurations a;
    final /* synthetic */ acew b;

    public acev(acew acew, BootstrapConfigurations bootstrapConfigurations) {
        this.b = acew;
        this.a = bootstrapConfigurations;
    }

    public final void run() {
        acew acew = this.b;
        absf absf = acew.b;
        absr absr = new absr(acew.a);
        BootstrapConfigurations bootstrapConfigurations = this.a;
        acew acew2 = this.b;
        absf.a(absr, bootstrapConfigurations, acew2.c, acew2.d);
    }
}
