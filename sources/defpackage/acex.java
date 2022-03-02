package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.apiservice.LifecycleSynchronizer;
import com.google.android.gms.smartdevice.directtransfer.DirectTransferConfigurations;

/* renamed from: acex  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acex extends acfi implements niz, abvo {
    public acah a;
    public long b;
    private final abpn c;
    private final acab d;
    private final Context e;
    private final Handler f;
    private final String g;
    private final boolean h;
    private final boolean i;
    private absf j;
    private final nix k;

    public acex(LifecycleSynchronizer lifecycleSynchronizer, abpn abpn, acab acab, Context context, Handler handler, String str, boolean z, boolean z2) {
        this.k = nix.a(context, lifecycleSynchronizer, acdx.a());
        this.c = abpn;
        this.d = acab;
        this.e = context;
        this.f = handler;
        this.g = str;
        this.h = z;
        this.i = z2;
        c();
    }

    public static void a(acah acah, long j2) {
        acah.b(System.currentTimeMillis() - j2);
        if (!jhg.a()) {
            acah.a();
        }
    }

    private final absf c() {
        absf absf = this.j;
        if (absf != null) {
            return absf;
        }
        acah b2 = this.d.b(this.e);
        b2.a(this.g, this.h, this.i);
        this.b = System.currentTimeMillis();
        absf b3 = this.c.b(new abpo(this.e, this.f, b2, this, this.g));
        this.j = b3;
        this.a = b2;
        return b3;
    }

    public final synchronized void b() {
        this.a = null;
        absf absf = this.j;
        if (absf != null) {
            this.f.post(new aceq(absf));
        }
        this.j = null;
    }

    public final void a() {
        int i2 = jhg.a;
        acah acah = this.a;
        if (acah != null) {
            acah.b(true);
            a(acah, this.b);
            long k2 = azlf.k();
            if (k2 < 0) {
                b();
            } else {
                this.f.postDelayed(new acep(this), k2);
            }
        }
    }

    public final void a(int i2) {
        int i3 = jhg.a;
        acah acah = this.a;
        if (acah != null) {
            acah.b(false);
            acah.b(i2);
            a(acah, this.b);
            b();
        }
    }

    public final void a(acfg acfg) {
        this.k.a(new aces(acfg, c(), this.f));
    }

    public final void a(acfg acfg, Bundle bundle) {
        this.k.a(new aceu(acfg, bundle, c(), this.f));
    }

    public final void a(acfg acfg, DirectTransferConfigurations directTransferConfigurations, ParcelFileDescriptor[] parcelFileDescriptorArr, abwu abwu) {
        acfg acfg2 = acfg;
        DirectTransferConfigurations directTransferConfigurations2 = directTransferConfigurations;
        ParcelFileDescriptor[] parcelFileDescriptorArr2 = parcelFileDescriptorArr;
        abwu abwu2 = abwu;
        this.k.a(new acew(acfg2, directTransferConfigurations2, parcelFileDescriptorArr2, abwu2, c(), this.f));
    }
}
