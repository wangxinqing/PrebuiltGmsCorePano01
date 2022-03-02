package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.gms.update.InstallationOptions;
import com.google.android.gms.update.SystemUpdateStatus;

/* renamed from: adpa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adpa extends adoq {
    private static final iwd a = adnt.i("SettingsResolveRebootController");

    private static final String a(ador ador) {
        amri amri;
        try {
            adkg a2 = adkg.a((String) adka.a.a());
            if (!a2.equals(adkg.a)) {
                amri = amri.b(a2.a((Context) ador, System.currentTimeMillis()));
            } else {
                amri = ampu.a;
            }
        } catch (adju e) {
            a.e("Unable to parse restart time window: %s.", adka.a.a());
            amri = ampu.a;
        }
        if (!amri.a()) {
            return "";
        }
        return TextUtils.expandTemplate(((Activity) ador).getText(R.string.system_update_tv_settings_automatic_reboot_hint_text), new CharSequence[]{(CharSequence) amri.b()}).toString();
    }

    /* access modifiers changed from: protected */
    public final void b(int i, ador ador) {
        if (!ador.f().a() || !ador.d().a()) {
            a.d("systemUpdateStatus() or layout() is absent", new Object[0]);
            return;
        }
        SystemUpdateStatus systemUpdateStatus = (SystemUpdateStatus) ador.f().b();
        adpo adpo = (adpo) ador.d().b();
        if (i == 3) {
            adpo.a((int) R.string.system_update_ready_title_text);
            adpo.e(100);
            adpo.c((int) R.string.system_update_verified_status_text);
            adpo.d(systemUpdateStatus.x.c);
            adpo.f(R.string.system_update_restart_now);
            if (systemUpdateStatus.c != 1296 || amrk.a(a(ador))) {
                adpo.b(systemUpdateStatus.x.b);
                adpo.d().setText(R.string.system_update_tv_settings_reboot_hint_text);
                adpo.b(true);
                return;
            }
            adpo.b(a(ador));
            adpo.b(false);
        } else if (i == 8) {
            adpo.c((int) R.string.system_update_tv_restarting_countdown_complete);
            a.a("Rebooting now", new Object[0]);
            ador.c().a(new InstallationOptions(true, true, true, false));
            adpo.h().setEnabled(false);
        }
    }
}
