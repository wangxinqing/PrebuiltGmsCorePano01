package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.apiservice.LifecycleSynchronizer;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;

/* renamed from: abva  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abva extends abxs implements niz, abvo {
    public static final acpz a = acqa.a("TargetServiceDelegate");
    public final abvc b;
    private final Handler c;
    private final acan d;
    private final abzy e;
    private final abpg f;
    private final long g = System.currentTimeMillis();
    private boolean h;
    private final nix i;

    public abva(LifecycleSynchronizer lifecycleSynchronizer, abpn abpn, acab acab, Context context, Handler handler, String str, boolean z, boolean z2) {
        this.i = nix.a(context, lifecycleSynchronizer, acdx.a());
        this.c = handler;
        acan a2 = acab.a(context);
        this.d = a2;
        a2.a(str, z, z2);
        this.e = new abzy(context, handler);
        this.f = new abpg(context);
        this.b = abpn.a(new abpo(context, handler, this.d, this));
    }

    private final void c() {
        this.d.b(System.currentTimeMillis() - this.g);
        this.h = true;
    }

    public final String a(BootstrapOptions bootstrapOptions) {
        abvc abvc = this.b;
        abvc.a.c(2);
        acal.a(abvc.a, 13);
        abug abug = abvc.b;
        iva.a((Object) bootstrapOptions);
        if (abug.l) {
            return abug.k;
        }
        throw new RuntimeException("getAdvertisedDeviceName should only be called after resources have been initialized");
    }

    public final void a(acgz acgz) {
    }

    public final void a(acgz acgz, HandshakeData handshakeData) {
    }

    public final void b() {
        if (!this.h) {
            c();
        }
        if (!jhg.a()) {
            this.d.a();
        }
        this.c.post(new abuh(this));
    }

    public final void b(acgz acgz) {
    }

    public final void b(acgz acgz, HandshakeData handshakeData) {
    }

    public final void d(abxq abxq) {
        this.i.a(new abuj(abxq, this.b, this.c));
    }

    public final void e(abxq abxq) {
        acan acan = this.d;
        acal.a(acan, 23);
        acan.c(4);
        this.i.a(new abut(abxq, this.e, this.c));
    }

    public final void f(abxq abxq) {
        acan acan = this.d;
        acal.a(acan, 22);
        acan.c(5);
        this.i.a(new abur(abxq, this.f, this.c));
    }

    public final void c(abxq abxq) {
        this.i.a(new abup(abxq, this.b, this.c));
    }

    public final void b(abxq abxq) {
        this.i.a(new abuv(abxq, this.b, this.c));
    }

    public final void a() {
        int i2 = jhg.a;
        a.c("Completed", new Object[0]);
        this.d.b(true);
        c();
    }

    public final void a(int i2) {
        int i3 = jhg.a;
        a.e("error %d", Integer.valueOf(i2));
        a.b("%s", abpp.g(i2));
        acan acan = this.d;
        acan.b(false);
        acan.a(i2);
        c();
    }

    public final void a(abxq abxq) {
        this.i.a(new abul(abxq, this.b, this.c));
    }

    public final void a(abxq abxq, abxn abxn) {
        this.i.a(new abux(abxq, this.b, abxn, this.c));
    }

    public final void a(abxq abxq, BootstrapOptions bootstrapOptions, abxn abxn) {
        this.i.a(new abun(abxq, this.b, bootstrapOptions, abxn, this.c));
    }

    public final void a(abxq abxq, BootstrapOptions bootstrapOptions, ParcelFileDescriptor[] parcelFileDescriptorArr, abwu abwu) {
        this.i.a(new abuz(abxq, this.b, bootstrapOptions, parcelFileDescriptorArr, abwu, this.c));
    }
}
