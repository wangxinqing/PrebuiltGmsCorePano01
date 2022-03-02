package defpackage;

import com.google.android.gms.R;
import com.google.android.gms.update.InstallationOptions;
import com.google.android.gms.update.SystemUpdateStatus;

/* renamed from: adoy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adoy extends adoq {
    private static final iwd a = adnt.i("SettingsResolveABInstallController");

    /* access modifiers changed from: protected */
    public final void b(int i, ador ador) {
        if (!ador.f().a() || !ador.d().a()) {
            a.d("systemUpdateStatus() or layout() is absent", new Object[0]);
            return;
        }
        SystemUpdateStatus systemUpdateStatus = (SystemUpdateStatus) ador.f().b();
        adpo adpo = (adpo) ador.d().b();
        if (i == 3) {
            if (systemUpdateStatus.c == 787) {
                adpo.a(systemUpdateStatus.x.a);
                adpo.e().setIndeterminate(false);
                adpo.c((int) R.string.system_update_installation_paused_title_text);
                adpo.f(R.string.system_update_resume_button_text);
            } else {
                adpo.a((int) R.string.system_update_ready_title_text);
                adpo.e(100);
                adpo.c((int) R.string.system_update_verified_status_text);
                adpo.f(R.string.common_install);
            }
            adpo.b(systemUpdateStatus.x.b);
            adpo.d(systemUpdateStatus.x.c);
            adpo.b(false);
        } else if (i == 8) {
            ador.c().b(new InstallationOptions(true, true, false, false));
        }
    }
}
