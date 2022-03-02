package defpackage;

import android.os.SystemClock;
import com.google.android.gms.recaptcha.RecaptchaChimeraActivity;
import java.util.concurrent.TimeUnit;

/* renamed from: zpq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zpq implements Runnable {
    final /* synthetic */ RecaptchaChimeraActivity a;

    public zpq(RecaptchaChimeraActivity recaptchaChimeraActivity) {
        this.a = recaptchaChimeraActivity;
    }

    public final void run() {
        long elapsedRealtime = (this.a.h + RecaptchaChimeraActivity.k) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.a.b();
        } else {
            this.a.a((Runnable) this, elapsedRealtime, TimeUnit.MILLISECONDS);
        }
    }
}
