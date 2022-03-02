package defpackage;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import java.util.List;

/* renamed from: abss  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abss {
    public static final iwd a = acqa.a("D2D", "SourceDirectTransferServiceController");
    public absq b;
    private final abpo c;

    public abss(abpo abpo) {
        this.c = abpo;
    }

    public final void a() {
        a.a("cleanup()", new Object[0]);
        absq absq = this.b;
        if (absq != null) {
            absq.a();
            this.b = null;
        }
    }

    public final synchronized void a(absr absr) {
        absq absq = this.b;
        if (absq == null) {
            a.e("Bootstrap cannot be aborted -- no bootstrap in progress.", new Object[0]);
            absr.b(new Status(10565));
            return;
        }
        absq.g();
        a();
        absr.b(new Status(0));
    }

    public final synchronized void a(absr absr, BootstrapConfigurations bootstrapConfigurations, ParcelFileDescriptor[] parcelFileDescriptorArr, abwu abwu) {
        acpt acpt = new acpt(parcelFileDescriptorArr[0]);
        acpv acpv = new acpv(parcelFileDescriptorArr[1]);
        ((acah) this.c.c).f(3);
        if (this.b != null) {
            a.e("Bootstrap cannot be started -- bootstrap already in progress.", new Object[0]);
            absr.a(new Status(10561));
            return;
        }
        absq absq = new absq(this.c, bootstrapConfigurations, acpt, acpv, abwu);
        this.b = absq;
        absq.f();
        absr.a(new Status(0));
    }

    public final synchronized void a(abxe abxe) {
        List a2 = absq.a(this.c.a);
        iwd iwd = a;
        int size = a2.size();
        StringBuilder sb = new StringBuilder(59);
        sb.append("getBootstrappableAccounts returning ");
        sb.append(size);
        sb.append(" account(s).");
        iwd.a(sb.toString(), new Object[0]);
        try {
            abxe.a(new Status(0), a2);
        } catch (RemoteException e) {
            a.e("Error calling ISourceDevice.onBootstrappableAccountsResult(callbacks, Status, List<BootstrapAccount>)", e, new Object[0]);
        }
    }
}
