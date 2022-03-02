package defpackage;

import com.google.android.chimera.ActivityBase;
import com.google.android.gms.R;
import com.google.android.gms.update.DownloadOptions;
import com.google.android.gms.update.SystemUpdateStatus;

/* renamed from: adoz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adoz extends adoq {
    private static final iwd a = adnt.i("SettingsResolveDownloadController");

    /* access modifiers changed from: protected */
    public final void b(int i, ador ador) {
        if (!ador.f().a() || !ador.d().a()) {
            a.d("systemUpdateStatus() or layout() is absent", new Object[0]);
            return;
        }
        SystemUpdateStatus systemUpdateStatus = (SystemUpdateStatus) ador.f().b();
        adpo adpo = (adpo) ador.d().b();
        adjg c = ador.c();
        if (i == 3) {
            int i2 = systemUpdateStatus.c;
            if (i2 == 262) {
                adpo.a((int) R.string.system_update_download_error_notification_title);
                adpo.b(systemUpdateStatus.x.b);
                adpo.e().setIndeterminate(false);
                adpo.c((int) R.string.system_update_download_failed_title_text);
                adpo.d(systemUpdateStatus.x.c);
                adpo.d().setText(R.string.system_update_problem_downloading_action_text);
                adpo.b(true);
                adpo.f(R.string.system_update_download_retry_button_text);
            } else if (i2 == 518) {
                adpo.a((int) R.string.system_update_download_error_notification_title);
                adpo.b(systemUpdateStatus.x.b);
                adpo.e(Integer.MIN_VALUE);
                adpo.c((int) R.string.system_update_download_failed_title_text);
                adpo.d(systemUpdateStatus.x.c);
                adpo.d().setText(R.string.system_update_download_failed_no_space_status_text);
                adpo.b(true);
                adpo.f(R.string.system_update_download_manage_storage_button_text);
            } else if (i2 == 774) {
                adpo.a((int) R.string.system_update_download_error_notification_title);
                adpo.b((int) R.string.system_update_activity_attempt_download_later_text);
                adpo.e(Integer.MIN_VALUE);
                adpo.c((int) R.string.system_update_download_failed_title_text);
                adpo.f().setVisibility(4);
                adpo.b(false);
                adpo.f(R.string.system_update_download_retry_button_text);
            } else if (i2 == 267 || i2 == 2059) {
                adpo.a((int) R.string.system_update_download_error_notification_title);
                adpo.b((int) R.string.system_update_tv_settings_data_warning_text);
                adpo.e(Integer.MIN_VALUE);
                adpo.c((int) R.string.system_update_download_paused_title_text);
                adpo.d(systemUpdateStatus.x.c);
                adpo.d().setVisibility(4);
                adpo.f(R.string.system_update_tv_use_cellular_action_button_text);
            } else if (i2 == 1547) {
                adpo.a(systemUpdateStatus.x.a);
                adpo.b(systemUpdateStatus.x.b);
                adpo.e().setIndeterminate(false);
                adpo.c((int) R.string.system_update_download_paused_title_text);
                adpo.d(systemUpdateStatus.x.c);
                adpo.b(false);
                adpo.f(R.string.system_update_resume_button_text);
            } else if (i2 == 1803) {
                adpo.a(systemUpdateStatus.x.a);
                adpo.b(systemUpdateStatus.x.b);
                adpo.e(Integer.MIN_VALUE);
                adpo.c((int) R.string.system_update_download_waiting_status_text);
                adpo.d(systemUpdateStatus.x.c);
                adpo.b(false);
                adpo.f(R.string.common_download);
            }
        } else if (i == 8) {
            int i3 = systemUpdateStatus.c;
            if (i3 == 262 || i3 == 1547) {
                adpo.e(-1);
                c.b(new DownloadOptions(true, true));
                adpo.h().setEnabled(false);
            } else if (i3 == 518) {
                if (!((ActivityBase) ador).isFinishing()) {
                    ador.m();
                }
            } else if (i3 == 774) {
                adpo.e(-1);
                adpo.h().setEnabled(false);
                c.r();
                ador.k();
            } else if (i3 == 1803 || i3 == 267 || i3 == 2059) {
                c.a(new DownloadOptions(true, true));
                adpo.h().setEnabled(false);
            }
        }
    }
}
