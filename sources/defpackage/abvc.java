package defpackage;

import android.os.Handler;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;

/* renamed from: abvc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abvc {
    private static final iwd c = acqa.a("D2D", "TargetDeviceServiceImpl");
    public final acan a;
    public final abug b;
    private final Handler d;
    private final abvn e;

    public abvc(abpo abpo) {
        this.a = (acan) abpo.c;
        this.d = abpo.b;
        this.b = new abug(abpo);
        this.e = new abvn(abpo);
        this.d.post(new abvb(this, abpo));
    }

    public final void a() {
        c.a("Destroying target device API service.", new Object[0]);
        abug abug = this.b;
        abug.a.a("cleanup()", new Object[0]);
        abtz abtz = abug.g;
        if (abtz != null && abug.j) {
            abtz.a();
        }
        abug.a();
        abug.e.b();
        abvn abvn = this.e;
        abvn.a.a("cleanup()", new Object[0]);
        abvi abvi = abvn.b;
        if (abvi != null) {
            abvi.f();
        }
        abvn.b = null;
    }

    public final void a(abvm abvm) {
        this.a.c(3);
        acal.a(this.a, 16);
        this.e.a(abvm);
    }

    public final void a(abvm abvm, BootstrapOptions bootstrapOptions, ParcelFileDescriptor[] parcelFileDescriptorArr, abwu abwu) {
        this.a.c(3);
        acal.a(this.a, 15);
        this.e.a(abvm, bootstrapOptions, parcelFileDescriptorArr, abwu);
    }
}
