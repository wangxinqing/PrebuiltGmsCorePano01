package defpackage;

import com.google.android.gms.R;
import com.google.android.gms.update.SystemUpdateStatus;

/* renamed from: adou  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adou extends adoq {
    private static final iwd a = adnt.i("SettingsDownloadController");

    private static final void a(adpo adpo, SystemUpdateStatus systemUpdateStatus) {
        adpo.a(systemUpdateStatus.x.a);
        adpo.b(systemUpdateStatus.x.b);
        adpo.e((int) (systemUpdateStatus.f * 100.0d));
        adpo.c((int) R.string.system_update_downloading_status_text);
        adpo.d(systemUpdateStatus.x.c);
        adpo.b(false);
        adpo.f(R.string.common_pause);
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
            if (systemUpdateStatus.c == 2) {
                if (ador.e().a()) {
                    SystemUpdateStatus systemUpdateStatus2 = (SystemUpdateStatus) ador.e().b();
                    if (systemUpdateStatus2.c == 262 && systemUpdateStatus2.f == systemUpdateStatus.f) {
                        a.d("Fake DOWNLOADING status. Ignored.", new Object[0]);
                        return;
                    }
                }
                a(adpo, systemUpdateStatus);
            }
        } else if (i == 4) {
            a(adpo, systemUpdateStatus);
        } else if (i == 8) {
            a(adpo, systemUpdateStatus);
            ador.c().q();
            adpo.h().setEnabled(false);
        }
    }
}
