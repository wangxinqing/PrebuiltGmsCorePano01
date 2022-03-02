package defpackage;

import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.directtransfer.DirectTransferOptions;

/* renamed from: acfb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acfb implements Runnable {
    final /* synthetic */ acfc a;

    public acfb(acfc acfc) {
        this.a = acfc;
    }

    public final void run() {
        acfc acfc = this.a;
        abvc abvc = acfc.c;
        abvm abvm = new abvm(acfc.d);
        DirectTransferOptions directTransferOptions = this.a.a;
        abod abod = new abod();
        abod.a = directTransferOptions.a;
        abod.c = azjz.a.a().d();
        if (abod.a >= 0) {
            BootstrapOptions bootstrapOptions = new BootstrapOptions();
            bootstrapOptions.b(abod.a);
            bootstrapOptions.a(0);
            bootstrapOptions.e(abod.b);
            bootstrapOptions.a(false);
            bootstrapOptions.b(abod.c);
            bootstrapOptions.c(0);
            bootstrapOptions.d(hxj.b);
            bootstrapOptions.a(-1);
            bootstrapOptions.f();
            acfc acfc2 = this.a;
            abvc.a(abvm, bootstrapOptions, acfc2.b, acfc2.e);
            return;
        }
        throw new IllegalArgumentException("Must set flow type before building the DirectBuilder.");
    }
}
