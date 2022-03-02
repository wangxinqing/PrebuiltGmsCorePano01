package defpackage;

import com.google.android.gms.R;
import com.google.android.gms.update.SystemUpdateStatus;

/* renamed from: adov  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adov extends adoq {
    private static final iwd a = adnt.i("SettingsInstallErrorController");

    /* access modifiers changed from: protected */
    public final void b(int i, ador ador) {
        if (!ador.f().a() || !ador.d().a()) {
            a.d("systemUpdateStatus() or layout() is absent", new Object[0]);
            return;
        }
        SystemUpdateStatus systemUpdateStatus = (SystemUpdateStatus) ador.f().b();
        adpo adpo = (adpo) ador.d().b();
        if (i == 3) {
            int i2 = systemUpdateStatus.c;
            if (i2 == 22 || i2 == 278) {
                adpo.a((int) R.string.system_update_download_error_notification_title);
            } else {
                adpo.a((int) R.string.system_update_installation_error_notification_title);
            }
            adpo.b((int) R.string.system_update_check_for_update_failed);
            adpo.e(Integer.MIN_VALUE);
            int i3 = systemUpdateStatus.c;
            if (i3 == 263 || i3 == 1031 || i3 == 519 || i3 == 274 || i3 == 530 || i3 == 786) {
                adpo.c((int) R.string.system_update_verification_failed_text);
            } else {
                adpo.d(4);
            }
            adpo.f().setVisibility(4);
            adpo.d().setVisibility(4);
            adpo.f(R.string.common_try_again);
        } else if (i == 8) {
            adpo.h().setEnabled(false);
            ador.c().r();
            adpo.e(-1);
            ador.k();
            ador.o();
        }
    }
}
