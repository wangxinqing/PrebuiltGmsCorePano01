package defpackage;

import android.text.TextUtils;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.gms.update.SystemUpdateStatus;

/* renamed from: adpc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adpc extends adoq {
    private static final iwd a = adnt.i("SetupABInstallController");

    /* access modifiers changed from: protected */
    public final void b(int i, ador ador) {
        if (!ador.f().a() || !ador.d().a()) {
            a.d("systemUpdateStatus() or layout() is absent", new Object[0]);
            return;
        }
        SystemUpdateStatus systemUpdateStatus = (SystemUpdateStatus) ador.f().b();
        adpo adpo = (adpo) ador.d().b();
        if (i == 3) {
            adpo.a((int) R.string.system_update_installing_title_text);
            adpo.b(systemUpdateStatus.x.b);
            int i2 = systemUpdateStatus.c;
            if (i2 == 273) {
                adpo.c(TextUtils.expandTemplate(((Activity) ador).getText(R.string.system_update_install_steps_text), new CharSequence[]{"1"}).toString());
            } else if (i2 == 529) {
                adpo.c(TextUtils.expandTemplate(((Activity) ador).getText(R.string.system_update_install_steps_text), new CharSequence[]{"2"}).toString());
            }
            adpo.e((int) (systemUpdateStatus.f * 100.0d));
            adpo.d(systemUpdateStatus.x.c);
            adpo.b(false);
            adpo.c(false);
        } else if (i == 4) {
            adpo.e((int) (systemUpdateStatus.f * 100.0d));
        }
    }
}
