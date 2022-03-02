package defpackage;

import com.google.android.gms.R;
import com.google.android.gms.update.SystemUpdateStatus;

/* renamed from: adpk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adpk extends adoq {
    private static final iwd a = adnt.i("SetupNonActionableErrorController");
    private static final anax b = anax.a((Object) 1040, (Object) 275);

    /* access modifiers changed from: protected */
    public final void b(int i, ador ador) {
        a.d("Entered non-actionable state.", new Object[0]);
        if (!ador.f().a() || !ador.d().a()) {
            a.d("systemUpdateStatus() or layout() is absent", new Object[0]);
            return;
        }
        SystemUpdateStatus systemUpdateStatus = (SystemUpdateStatus) ador.f().b();
        adpo adpo = (adpo) ador.d().b();
        if (i == 3) {
            if (b.contains(Integer.valueOf(systemUpdateStatus.c))) {
                adpo.a((int) R.string.system_update_installation_error_notification_title);
                adpo.b((int) R.string.system_update_tv_setup_low_battery_text);
                adpo.c((int) R.string.system_update_installation_failed_title_text);
            } else {
                adpo.a((int) R.string.system_update_download_error_notification_title);
                int i2 = systemUpdateStatus.c;
                if (i2 == 779) {
                    adpo.b((int) R.string.system_update_download_waiting_operator_mismatch_text);
                } else if (i2 == 1035) {
                    adpo.b((int) R.string.system_update_download_waiting_charger_only_text);
                } else if (i2 == 2315) {
                    adpo.b((int) R.string.system_update_tv_setup_low_battery_text);
                } else if (i2 == 2571) {
                    adpo.b((int) R.string.system_update_activity_roaming_text);
                }
                adpo.c((int) R.string.system_update_download_failed_title_text);
            }
            adpo.d(systemUpdateStatus.x.c);
            adpo.e(Integer.MIN_VALUE);
            adpo.b(false);
            adpo.c(false);
        }
    }
}
