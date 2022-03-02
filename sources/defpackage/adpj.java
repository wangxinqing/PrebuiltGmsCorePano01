package defpackage;

import android.os.CountDownTimer;
import com.google.android.gms.R;
import java.util.concurrent.TimeUnit;

/* renamed from: adpj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adpj extends adoq {
    private static final iwd a = adnt.i("SetupNoUpdateController");
    private static final long b = TimeUnit.SECONDS.toMillis(30);
    private CountDownTimer c;

    /* access modifiers changed from: protected */
    public final void b(int i, ador ador) {
        CountDownTimer countDownTimer;
        a.d("NO_UPDATE or INSTALLED", new Object[0]);
        if (!ador.d().a() || !ador.f().a()) {
            a.e("layout() or systemUpdateStatus() is absent", new Object[0]);
            return;
        }
        adpo adpo = (adpo) ador.d().b();
        if (((String) adke.d.a()).isEmpty()) {
            a.e("Entered Setup OTA with empty update_url.", new Object[0]);
            ador.p();
        }
        if (i == 3) {
            adpo.a((int) R.string.checking_for_update_status_text);
            adpo.c().setVisibility(4);
            adpo.d(4);
            adpo.f().setVisibility(4);
            adpo.e(-1);
            adpo.b(false);
            adpo.c(false);
            adpi adpi = new adpi(b, TimeUnit.SECONDS.toMillis(5), ador);
            this.c = adpi;
            adpi.start();
        } else if ((i == -3 || i == 2) && (countDownTimer = this.c) != null) {
            countDownTimer.cancel();
        }
    }
}
