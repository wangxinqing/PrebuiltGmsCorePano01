package defpackage;

import com.google.android.gms.R;
import com.google.android.gms.update.SystemUpdateStatus;

/* renamed from: adpb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adpb extends adoq {
    private static final iwd a = adnt.i("SettingsVerifyingController");

    /* access modifiers changed from: protected */
    public final void b(int i, ador ador) {
        if (!ador.f().a() || !ador.d().a()) {
            a.d("systemUpdateStatus() or layout() is absent", new Object[0]);
            return;
        }
        SystemUpdateStatus systemUpdateStatus = (SystemUpdateStatus) ador.f().b();
        adpo adpo = (adpo) ador.d().b();
        if (i == 3) {
            adpo.a(systemUpdateStatus.x.a);
            adpo.b(systemUpdateStatus.x.b);
            adpo.e(-1);
            int i2 = systemUpdateStatus.c;
            if (i2 == 3) {
                adpo.c((int) R.string.system_update_verifying_status_text);
            } else if (i2 == 15) {
                adpo.c((int) R.string.system_update_processing_status_text);
            } else if (i2 == 23) {
                adpo.c((int) R.string.system_update_preparing_update_title);
            }
            adpo.d(systemUpdateStatus.x.c);
            adpo.b(false);
            adpo.f(R.string.common_pause);
            adpo.h().setEnabled(false);
        }
    }
}
