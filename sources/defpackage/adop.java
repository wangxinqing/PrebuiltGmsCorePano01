package defpackage;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.gms.update.DownloadOptions;
import com.google.android.gms.update.InstallationOptions;
import com.google.android.gms.update.SystemUpdateStatus;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: adop  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adop extends adim implements niz {
    private static final iwd a = adnt.i("SystemUpdateTvApiStub");
    private final adjg b;
    private final SparseArray c = new SparseArray();

    public adop(Context context) {
        this.b = adiq.a(context);
    }

    public final SystemUpdateStatus a() {
        a.a("getSystemUpdateStatus()", new Object[0]);
        try {
            return (SystemUpdateStatus) acws.a(this.b.a(), 2000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            iwd iwd = a;
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
            sb.append("getSystemUpdateStatus() failed. ");
            sb.append(valueOf);
            iwd.e(sb.toString(), new Object[0]);
            return null;
        }
    }

    public final void b() {
        a.a("pauseDownload()", new Object[0]);
        this.b.q();
    }

    public final void b(DownloadOptions downloadOptions) {
        a.a("resumeDownload(%s)", downloadOptions);
        this.b.b(downloadOptions);
    }

    public final boolean b(adil adil) {
        boolean z = false;
        a.a("unregisterStatusCallback()", new Object[0]);
        adil adil2 = (adil) this.c.get(adil.asBinder().hashCode());
        if (adil2 != null) {
            try {
                z = ((Boolean) acws.a(this.b.a(adil2), 1000, TimeUnit.MILLISECONDS)).booleanValue();
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                iwd iwd = a;
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
                sb.append("getSystemUpdateStatus() failed. ");
                sb.append(valueOf);
                iwd.e(sb.toString(), new Object[0]);
            }
            if (z) {
                this.c.remove(adil.asBinder().hashCode());
                return true;
            }
        }
        return z;
    }

    public final void a(adil adil) {
        a.a("registerStatusCallback()", new Object[0]);
        this.c.put(adil.asBinder().hashCode(), adil);
        this.b.b(adil);
    }

    public final void a(DownloadOptions downloadOptions) {
        a.a("approveDownload(%s)", downloadOptions);
        this.b.a(downloadOptions);
    }

    public final void a(InstallationOptions installationOptions) {
        a.a("approveReboot(%s)", installationOptions);
        this.b.a(installationOptions);
    }
}
