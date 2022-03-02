package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.apiservice.LifecycleSynchronizer;
import com.google.android.gms.smartdevice.directtransfer.DirectTransferOptions;

/* renamed from: acfd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acfd extends acfk implements niz, abvo {
    private static final acpz e = acqa.a("TargetDirectTransferService");
    public final Handler a;
    public final abvc b;
    public final acan c;
    public boolean d;
    private final long f = System.currentTimeMillis();
    private final nix g;

    public acfd(LifecycleSynchronizer lifecycleSynchronizer, abpn abpn, acab acab, Context context, Handler handler, String str, boolean z, boolean z2) {
        this.g = nix.a(context, lifecycleSynchronizer, acdx.a());
        this.a = handler;
        acan a2 = acab.a(context);
        this.c = a2;
        a2.a(str, z, z2);
        this.b = abpn.a(new abpo(context, handler, this.c, this));
    }

    public final void a() {
        int i = jhg.a;
        e.c("Completed", new Object[0]);
        this.c.b(true);
        b();
    }

    public final void b() {
        this.c.b(System.currentTimeMillis() - this.f);
        this.d = true;
    }

    public final void a(int i) {
        int i2 = jhg.a;
        e.e("error %d", Integer.valueOf(i));
        e.b("%s", abpp.g(i));
        acan acan = this.c;
        acan.b(false);
        acan.a(i);
        b();
    }

    public final void a(acfg acfg) {
        this.g.a(new acfa(acfg, this.b, this.a));
    }

    public final void a(acfg acfg, DirectTransferOptions directTransferOptions, ParcelFileDescriptor[] parcelFileDescriptorArr, abwu abwu) {
        this.g.a(new acfc(acfg, this.b, directTransferOptions, parcelFileDescriptorArr, abwu, this.a));
    }
}
