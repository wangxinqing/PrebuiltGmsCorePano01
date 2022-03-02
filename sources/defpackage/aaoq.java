package defpackage;

import android.os.SystemClock;
import com.google.android.gms.security.recaptcha.RecaptchaChimeraActivity;
import java.util.concurrent.TimeUnit;

/* renamed from: aaoq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaoq implements Runnable {
    final /* synthetic */ RecaptchaChimeraActivity a;

    public aaoq(RecaptchaChimeraActivity recaptchaChimeraActivity) {
        this.a = recaptchaChimeraActivity;
    }

    public final void run() {
        String str = RecaptchaChimeraActivity.j;
        long elapsedRealtime = (this.a.h + RecaptchaChimeraActivity.k) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.a.b();
        } else {
            this.a.a((Runnable) this, elapsedRealtime, TimeUnit.MILLISECONDS);
        }
    }
}
