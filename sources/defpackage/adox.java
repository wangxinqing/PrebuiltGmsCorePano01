package defpackage;

import com.google.android.gms.R;
import com.google.android.gms.update.SystemUpdateStatus;

/* renamed from: adox  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adox extends adoq {
    private static final iwd a = adnt.i("SettingsNonActionableErrorController");
    private final anax b = anax.a((Object) 1040, (Object) 275);

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
            if (this.b.contains(Integer.valueOf(systemUpdateStatus.c))) {
                adpo.a((int) R.string.system_update_installation_error_notification_title);
                adpo.c((int) R.string.system_update_installation_failed_title_text);
            } else {
                adpo.a((int) R.string.system_update_download_error_notification_title);
                adpo.c((int) R.string.system_update_download_failed_title_text);
            }
            int i2 = systemUpdateStatus.c;
            int i3 = R.string.system_update_tv_setup_low_battery_text;
            if (i2 == 779) {
                i3 = R.string.system_update_download_waiting_operator_mismatch_text;
            } else if (i2 == 1035) {
                i3 = R.string.system_update_download_waiting_charger_only_text;
            } else if (i2 == 1291) {
                i3 = R.string.system_update_activity_attempt_download_later_text;
            } else if (i2 != 2315) {
                if (i2 == 2571) {
                    i3 = R.string.system_update_activity_roaming_text;
                } else if (!this.b.contains(Integer.valueOf(i2))) {
                    i3 = -1;
                }
            }
            adpo.b(i3);
            adpo.e(Integer.MIN_VALUE);
            adpo.d(systemUpdateStatus.x.c);
            adpo.d().setText(R.string.system_update_tv_general_fix_issue_hint_text);
            adpo.b(true);
            adpo.f(R.string.close_button_label);
        } else if (i == 8) {
            a.d("User bailed out.", new Object[0]);
            ador.p();
        }
    }
}
