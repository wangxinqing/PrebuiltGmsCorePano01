package defpackage;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: abvn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abvn {
    public static final iwd a = acqa.a("D2D", "TargetDirectTransferServiceController");
    public abvi b;
    private final abpo c;

    public abvn(abpo abpo) {
        this.c = abpo;
    }

    static void a(yey yey) {
        acwa a2 = yey.a("com.google.android.gms.smartdevice", 201216073, new String[]{"SMART_DEVICE"}, (byte[]) null, "");
        a2.a((acvs) new abvl());
        a2.a((acvv) new abvk());
        try {
            acws.a(a2, azlf.j(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException e) {
            a.d("Failed to sync Phenotype flags.", e, new Object[0]);
        } catch (TimeoutException e2) {
            a.d("Syncing Phenotype flags times out.", e2, new Object[0]);
        }
        a2.b();
    }

    public final synchronized void a(abvm abvm) {
        abvi abvi = this.b;
        if (abvi == null) {
            a.e("Bootstrap cannot be aborted -- no bootstrap in progress.", new Object[0]);
            abvm.b(new Status(10565));
            return;
        }
        abvi.f();
        this.b = null;
        abvm.b(new Status(0));
    }

    public final synchronized void a(abvm abvm, BootstrapOptions bootstrapOptions, ParcelFileDescriptor[] parcelFileDescriptorArr, abwu abwu) {
        acpt acpt = new acpt(parcelFileDescriptorArr[0]);
        acpv acpv = new acpv(parcelFileDescriptorArr[1]);
        ((acan) this.c.c).d(3);
        if (this.b != null) {
            a.e("Bootstrap cannot be started -- bootstrap already in progress.", new Object[0]);
            abvm.a(new Status(10561));
            return;
        }
        if (azlf.j() > 0) {
            a(yef.a(this.c.a));
        }
        abvi abvi = new abvi(this.c, bootstrapOptions, acpt, acpv, new abvj(this, abwu));
        this.b = abvi;
        abvi.a(new abwj(false, abvi, 9), azlf.a.a().v());
        abvi.l.a(abvi);
        abvi.h.a("startEncryptionNegotiation", new Object[0]);
        abvm.a(new Status(0));
    }
}
