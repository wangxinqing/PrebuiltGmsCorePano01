package defpackage;

import com.google.android.gms.update.DownloadOptions;
import com.google.android.gms.update.SystemUpdateStatus;

/* renamed from: adph  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adph extends adoq {
    private static final iwd a = adnt.i("SetupForceDownloadController");

    /* access modifiers changed from: protected */
    public final void b(int i, ador ador) {
        if (!ador.f().a() || !ador.d().a()) {
            a.d("systemUpdateStatus() or layout() is absent", new Object[0]);
            return;
        }
        SystemUpdateStatus systemUpdateStatus = (SystemUpdateStatus) ador.f().b();
        if (i == 3) {
            a.a("Forcing downloading OTA as we are in TV Setup.", new Object[0]);
            int i2 = systemUpdateStatus.c;
            if (i2 == 1291 || i2 == 1803) {
                ador.c().a(new DownloadOptions(true, true));
            } else {
                ador.c().b(new DownloadOptions(true, true));
            }
        }
    }
}
