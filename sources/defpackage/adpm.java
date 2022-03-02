package defpackage;

import android.os.CountDownTimer;
import com.google.android.gms.R;
import java.util.concurrent.TimeUnit;

/* renamed from: adpm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adpm extends adoq {
    public static final iwd a = adnt.i("SetupRetryUpdateController");
    private static final long b = TimeUnit.SECONDS.toMillis(3);
    private CountDownTimer c;

    /* access modifiers changed from: protected */
    public final void b(int i, ador ador) {
        CountDownTimer countDownTimer;
        if (!ador.f().a() || !ador.d().a()) {
            a.e("systemUpdateStatus() or layout() is absent", new Object[0]);
            return;
        }
        adpo adpo = (adpo) ador.d().b();
        adjg c2 = ador.c();
        if (i == 3) {
            adpo.a((int) R.string.system_update_installation_error_notification_title);
            adpo.c().setVisibility(4);
            adpo.c((int) R.string.system_update_tv_verification_failed_retrying_status_text);
            adpo.f().setVisibility(4);
            adpo.e(-1);
            adpo.b(false);
            adpo.c(false);
            adpl adpl = new adpl(b, TimeUnit.SECONDS.toMillis(1), c2, ador);
            this.c = adpl;
            adpl.start();
        } else if ((i == -3 || i == 2) && (countDownTimer = this.c) != null) {
            countDownTimer.cancel();
        }
    }
}
