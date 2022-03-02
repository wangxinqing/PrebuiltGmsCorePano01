package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.apiservice.LifecycleSynchronizer;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import com.google.android.gms.smartdevice.d2d.internal.ConnectParams;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;

/* renamed from: absd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class absd extends abxg implements niz, abvo {
    private final abpn a;
    private final acab b;
    private final Context c;
    private final Handler d;
    private final String e;
    private final boolean f = true;
    private final boolean g;
    private absf h;
    private acah i;
    private long j;
    private final nix k;

    public absd(LifecycleSynchronizer lifecycleSynchronizer, abpn abpn, acab acab, Context context, Handler handler, String str, boolean z) {
        this.k = nix.a(context, lifecycleSynchronizer, acdx.a());
        this.a = abpn;
        this.b = acab;
        this.c = context;
        this.d = handler;
        this.e = str;
        this.g = z;
        d();
    }

    private static void a(acah acah, long j2) {
        acah.b(System.currentTimeMillis() - j2);
        if (!jhg.a()) {
            acah.a();
        }
    }

    private final absf d() {
        absf absf = this.h;
        if (absf != null) {
            return absf;
        }
        acah b2 = this.b.b(this.c);
        b2.a(this.e, this.f, this.g);
        this.j = System.currentTimeMillis();
        absf b3 = this.a.b(new abpo(this.c, this.d, b2, this, this.e));
        this.h = b3;
        this.i = b2;
        return b3;
    }

    public final void a(acgz acgz) {
    }

    public final void a(acgz acgz, HandshakeData handshakeData) {
    }

    public final synchronized void b() {
        this.i = null;
        absf absf = this.h;
        if (absf != null) {
            this.d.post(new abrc(absf));
        }
        this.h = null;
    }

    public final void b(acgz acgz, HandshakeData handshakeData) {
    }

    public final void c() {
        acah acah = this.i;
        if (acah != null) {
            a(acah, this.j);
        }
        b();
    }

    public final void a() {
        int i2 = jhg.a;
        acah acah = this.i;
        if (acah != null) {
            acah.b(true);
            a(acah, this.j);
            long k2 = azlf.k();
            if (k2 < 0) {
                b();
            } else {
                this.d.postDelayed(new abrb(this), k2);
            }
        }
    }

    public final void b(abxe abxe) {
        this.k.a(new abro(abxe, d(), this.d));
    }

    public final void b(abxe abxe, Bundle bundle) {
        this.k.a(new abrs(abxe, bundle, d(), this.d));
    }

    public final void c(abxe abxe) {
        this.k.a(new abrq(abxe, d(), this.d));
    }

    public final void d(abxe abxe) {
        this.k.a(new abre(abxe, d(), this.d));
    }

    public final void a(int i2) {
        int i3 = jhg.a;
        acah acah = this.i;
        if (acah != null) {
            acah.b(false);
            acah.b(i2);
            a(acah, this.j);
            b();
        }
    }

    public final void a(abxe abxe) {
        this.k.a(new absa(abxe, d(), this.d));
    }

    public final void a(abxe abxe, abxk abxk) {
        this.k.a(new abry(abxe, abxk, d(), this.d));
    }

    public final void a(abxe abxe, Bundle bundle) {
        this.k.a(new abru(abxe, bundle, d(), this.d));
    }

    public final void a(abxe abxe, BootstrapConfigurations bootstrapConfigurations) {
        this.k.a(new absc(abxe, bootstrapConfigurations, d(), this.d));
    }

    public final void a(abxe abxe, BootstrapConfigurations bootstrapConfigurations, ParcelFileDescriptor[] parcelFileDescriptorArr, abwu abwu) {
        abxe abxe2 = abxe;
        BootstrapConfigurations bootstrapConfigurations2 = bootstrapConfigurations;
        ParcelFileDescriptor[] parcelFileDescriptorArr2 = parcelFileDescriptorArr;
        abwu abwu2 = abwu;
        this.k.a(new abrw(abxe2, bootstrapConfigurations2, parcelFileDescriptorArr2, abwu2, d(), this.d));
    }

    public final void a(abxe abxe, D2DDevice d2DDevice, BootstrapConfigurations bootstrapConfigurations, abwy abwy) {
        abxe abxe2 = abxe;
        D2DDevice d2DDevice2 = d2DDevice;
        BootstrapConfigurations bootstrapConfigurations2 = bootstrapConfigurations;
        abwy abwy2 = abwy;
        this.k.a(new abrg(abxe2, d2DDevice2, bootstrapConfigurations2, abwy2, d(), this.d));
    }

    public final void a(abxe abxe, D2DDevice d2DDevice, String str, abxb abxb) {
        abxe abxe2 = abxe;
        D2DDevice d2DDevice2 = d2DDevice;
        String str2 = str;
        abxb abxb2 = abxb;
        this.k.a(new abrk(abxe2, d2DDevice2, str2, abxb2, d(), this.d));
    }

    public final void a(abxe abxe, String str) {
        this.k.a(new abrm(abxe, str, d(), this.d));
    }

    public final void a(ConnectParams connectParams) {
        this.k.a(new abri(connectParams, d(), this.d));
    }
}
