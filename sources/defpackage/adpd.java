package defpackage;

import com.google.android.gms.R;
import com.google.android.gms.update.DownloadOptions;
import com.google.android.gms.update.SystemUpdateStatus;

/* renamed from: adpd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adpd extends adoq {
    private static final iwd a = adnt.i("SetupDownloadController");

    private static final void a(adpo adpo, SystemUpdateStatus systemUpdateStatus) {
        adpo.a(systemUpdateStatus.x.a);
        adpo.b(systemUpdateStatus.x.b);
        adpo.c((int) R.string.system_update_downloading_status_text);
        adpo.d(systemUpdateStatus.x.c);
        adpo.e((int) (systemUpdateStatus.f * 100.0d));
        adpo.b(false);
        adpo.c(false);
    }

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
            if (i2 != 2) {
                if (i2 == 262) {
                    a.d("Network error during OTA downloading", new Object[0]);
                    adpo.a((int) R.string.system_update_download_error_notification_title);
                    adpo.d().setText(R.string.system_update_tv_setup_network_error_action_text);
                    adpo.b(true);
                    adpo.c(true);
                    adpo.f(R.string.common_try_again);
                    adpo.g(R.string.system_update_tv_network_settings_action_button_text);
                } else if (i2 == 2059 || i2 == 267) {
                    a.d("Using metered network during OTA downloading", new Object[0]);
                    adpo.a((int) R.string.system_update_download_error_notification_title);
                    adpo.d().setText(R.string.system_update_tv_setup_data_warning_text);
                    adpo.b(true);
                    adpo.c(true);
                    adpo.f(R.string.system_update_tv_network_settings_action_button_text);
                    adpo.g(R.string.system_update_tv_use_cellular_action_button_text);
                }
            } else if (!ador.e().a() || ((SystemUpdateStatus) ador.e().b()).c != 262) {
                a(adpo, systemUpdateStatus);
            } else if (((SystemUpdateStatus) ador.e().b()).f == systemUpdateStatus.f) {
                a.d("Fake downloading status. Ignored.", new Object[0]);
            }
        } else if (i != 4) {
            if (i == 8) {
                int i3 = systemUpdateStatus.c;
                if (i3 == 262) {
                    c.b(new DownloadOptions(true, true));
                    a(adpo, systemUpdateStatus);
                    adpo.e(-1);
                } else if (i3 == 2059 || i3 == 267) {
                    ador.n();
                }
            } else if (i == 14) {
                int i4 = systemUpdateStatus.c;
                if (i4 == 262) {
                    ador.n();
                } else if (i4 == 2059 || i4 == 267) {
                    c.b(new DownloadOptions(true, true));
                    a(adpo, systemUpdateStatus);
                    adpo.e(-1);
                }
            }
        } else if (systemUpdateStatus.c == 2) {
            a(adpo, systemUpdateStatus);
        }
    }
}
