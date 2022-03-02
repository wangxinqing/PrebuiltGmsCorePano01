package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;

/* renamed from: absf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class absf {
    public static final iwd a = acqa.a("D2D", "SourceDeviceServiceImpl");
    public final acah b;
    public final Handler c;
    public final abra d;
    public final abss e;

    public absf(abpo abpo) {
        this.b = (acah) abpo.c;
        this.c = abpo.b;
        this.d = new abra(abpo);
        this.e = new abss(abpo);
        this.c.post(new abse(this));
    }

    public final void a() {
        iva.a(this.c);
        a.a("Destroying source device API service.", new Object[0]);
        abra abra = this.d;
        abra.a.a("cleanup()", new Object[0]);
        abqg abqg = abra.h;
        abpx abpx = (abpx) abqg;
        int i = abpx.c;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1 ? ((abqo) abpx.a).f != null : !(i2 != 2 || abpx.b.g == null)) {
                abqg.a();
            }
            abra.a();
            abpx abpx2 = (abpx) abra.h;
            abpx2.c = 1;
            abpx2.b.g = null;
            this.e.a();
            return;
        }
        throw null;
    }

    public final void a(absr absr) {
        iva.a(this.c);
        this.b.e(3);
        acaj.a(this.b, 16);
        this.e.a(absr);
    }

    public final void a(absr absr, Bundle bundle) {
        iva.a(this.c);
        this.b.e(3);
        absq absq = this.e.b;
        Status status = new Status(10565);
        long j = bundle.getLong("sessionId");
        if (absq != null) {
            status = Status.a;
            long j2 = -1;
            if (j != -1) {
                BootstrapOptions bootstrapOptions = absq.p;
                if (bootstrapOptions != null) {
                    j2 = bootstrapOptions.l;
                }
                if (j != j2) {
                    status = new Status(10581);
                }
            }
        }
        try {
            abxe abxe = absr.a;
            if (abxe == null) {
                acfg acfg = absr.b;
                if (acfg != null) {
                    acfg.a(status);
                    return;
                }
                return;
            }
            abxe.k(status);
        } catch (RemoteException e2) {
            abss.a.e("Error calling onIsTransferInProgressResult.", e2, new Object[0]);
        }
    }

    public final void a(absr absr, BootstrapConfigurations bootstrapConfigurations, ParcelFileDescriptor[] parcelFileDescriptorArr, abwu abwu) {
        iva.a(this.c);
        this.b.e(3);
        acaj.a(this.b, 15);
        this.e.a(absr, bootstrapConfigurations, parcelFileDescriptorArr, abwu);
    }
}
