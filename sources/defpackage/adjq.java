package defpackage;

import android.content.Context;
import com.google.android.gms.update.ActivityStatus;
import com.google.android.gms.update.ConfigUpdateOptions;
import com.google.android.gms.update.DownloadOptions;
import com.google.android.gms.update.InstallationOptions;
import com.google.android.gms.update.SystemUpdateStatus;
import java.io.IOException;

/* renamed from: adjq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adjq extends adie implements niz {
    private static final iwd a = adnt.b("SystemUpdateApiStub");
    private final adla b = ((adla) adla.h.b());
    private final nix c;
    private final adkr d = ((adkr) adkr.b.b());
    private final Context e;

    public adjq(Context context, nix nix) {
        this.e = context;
        this.c = nix;
    }

    public final void a(adil adil) {
        a.a("registerSystemUpdateCallback()", new Object[0]);
        adla adla = this.b;
        synchronized (adla.i) {
            adla.m.put(adil.asBinder(), adil);
        }
    }

    public final SystemUpdateStatus b() {
        a.a("getSystemUpdateStatus()", new Object[0]);
        return this.b.d();
    }

    public final void c() {
        a.a("pauseDownload()", new Object[0]);
        this.b.b();
    }

    public final void d() {
        a.a("resetStatus()", new Object[0]);
        this.b.a();
    }

    public final void e() {
        a.a("pauseAbInstallation()", new Object[0]);
        this.b.c();
    }

    public final void f() {
        a.a("checkForUpdate()", new Object[0]);
        this.b.f();
    }

    public final boolean g() {
        a.a("approveRebootTonight()", new Object[0]);
        try {
            this.b.b(true);
            return true;
        } catch (IOException e2) {
            a.e("approveRebootTonight() failed.", e2, new Object[0]);
            return false;
        }
    }

    public final long h() {
        a.a("getLastConfigUpdateTime()", new Object[0]);
        if (ayor.b()) {
            return ((Long) this.d.d.b(adkr.a)).longValue();
        }
        try {
            return gwc.c(this.e);
        } catch (hxw | hxx | IOException e2) {
            a.e("Error when getting last successful checkin time.", e2, new Object[0]);
            return -1;
        }
    }

    public final void b(adil adil) {
        a.a("unregisterUpdateStatusCallback()", new Object[0]);
        adla adla = this.b;
        synchronized (adla.i) {
            adla.m.remove(adil.asBinder());
        }
    }

    public final void a(ActivityStatus activityStatus) {
        a.a("setActivityStatus(%s)", activityStatus);
        this.b.a(activityStatus);
    }

    public final void a(DownloadOptions downloadOptions) {
        a.a("approveDownload(%s)", downloadOptions);
        this.b.a(downloadOptions);
    }

    public final void b(DownloadOptions downloadOptions) {
        a.a("resumeDownload(%s)", downloadOptions);
        this.b.b(downloadOptions);
    }

    public final void a(InstallationOptions installationOptions) {
        a.a("approveReboot(%s)", installationOptions);
        this.b.a(installationOptions);
    }

    public final void b(InstallationOptions installationOptions) {
        a.a("resumeAbInstallation(%s)", installationOptions);
        this.b.b(installationOptions);
    }

    public final void a(ifu ifu, ConfigUpdateOptions configUpdateOptions) {
        a.a("checkForConfigUpdate(%s)", configUpdateOptions);
        this.c.a(new adjr(ifu, configUpdateOptions));
    }
}
