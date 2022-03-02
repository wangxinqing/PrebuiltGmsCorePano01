package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.DateUtils;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;

/* renamed from: adow  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adow extends adoq {
    private static final iwd a = adnt.i("SettingsNoUpdateController");

    private static final void a(ador ador, boolean z) {
        if (!ador.d().a()) {
            return;
        }
        if (ador.g() == 0) {
            ((adpo) ador.d().b()).d(4);
            if (z) {
                ador.h();
                return;
            }
            return;
        }
        ((adpo) ador.d().b()).c(TextUtils.expandTemplate(((Activity) ador).getString(R.string.system_update_last_checkin), new CharSequence[]{DateUtils.getRelativeTimeSpanString((Context) ador, ador.g(), true)}).toString());
        ((adpo) ador.d().b()).d(0);
    }

    /* access modifiers changed from: protected */
    public final void b(int i, ador ador) {
        if (!ador.f().a() || !ador.d().a()) {
            a.d("systemUpdateStatus() or layout() is absent", new Object[0]);
            return;
        }
        adpo adpo = (adpo) ador.d().b();
        if (i == 3) {
            if (!ador.j()) {
                adpo.a((int) R.string.system_update_no_update_content_text_glif);
                adpo.c().setVisibility(4);
                adpo.e(Integer.MIN_VALUE);
                a(ador, true);
                adpo.f().setVisibility(4);
                adpo.b(false);
                adpo.f(R.string.system_update_check_now_button_text);
            }
        } else if (i == 8) {
            adpo.a((int) R.string.checking_for_update_status_text);
            adpo.c().setVisibility(4);
            adpo.e(-1);
            adpo.f().setVisibility(4);
            adpo.b(false);
            adpo.h().setEnabled(false);
            ador.i();
        } else if (i == 5) {
            a(ador, false);
        } else if (i == 6) {
            adpo.a((int) R.string.system_update_no_update_content_text_glif);
            adpo.c().setVisibility(4);
            adpo.e(Integer.MIN_VALUE);
            a(ador, false);
            adpo.f().setVisibility(4);
            adpo.b(false);
            adpo.f(R.string.system_update_check_now_button_text);
        } else if (i == 19) {
            adpo.a((int) R.string.system_update_cannot_check_update);
            adpo.c().setVisibility(4);
            adpo.e(Integer.MIN_VALUE);
            adpo.c((int) R.string.system_update_check_for_update_failed);
            adpo.f().setVisibility(4);
            adpo.b(false);
            adpo.f(R.string.system_update_check_now_button_text);
        }
    }
}
