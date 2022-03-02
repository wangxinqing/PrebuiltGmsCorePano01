package defpackage;

import com.google.android.gms.R;
import com.google.android.gms.update.SystemUpdateStatus;

/* renamed from: adpn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adpn extends adoq {
    private static final iwd a = adnt.i("SetupVerifyingController");

    /* access modifiers changed from: protected */
    public final void b(int i, ador ador) {
        a.a("Verifying/processing OTA package.", new Object[0]);
        if (!ador.d().a() || !ador.f().a()) {
            a.e("layout() or systemUpdateStatus() is absent", new Object[0]);
            return;
        }
        SystemUpdateStatus systemUpdateStatus = (SystemUpdateStatus) ador.f().b();
        adpo adpo = (adpo) ador.d().b();
        if (i == 3) {
            int i2 = systemUpdateStatus.c;
            if (i2 == 3) {
                adpo.a(systemUpdateStatus.x.a);
                adpo.b(systemUpdateStatus.x.b);
                adpo.c((int) R.string.system_update_verifying_status_text);
                adpo.d(systemUpdateStatus.x.c);
            } else if (i2 == 15) {
                adpo.a(systemUpdateStatus.x.a);
                adpo.b(systemUpdateStatus.x.b);
                adpo.c((int) R.string.system_update_processing_status_text);
                adpo.d(systemUpdateStatus.x.c);
            } else if (i2 == 23) {
                adpo.a((int) R.string.system_update_preparing_update_title);
                adpo.c().setVisibility(4);
                adpo.d(4);
                adpo.f().setVisibility(4);
            }
            adpo.e(-1);
            adpo.b(false);
            adpo.c(false);
        }
    }
}
