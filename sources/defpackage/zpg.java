package defpackage;

import com.google.android.gms.recaptcha.RecaptchaChimeraActivity;
import java.util.Locale;

/* renamed from: zpg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zpg implements Runnable {
    final /* synthetic */ RecaptchaChimeraActivity a;

    public zpg(RecaptchaChimeraActivity recaptchaChimeraActivity) {
        this.a = recaptchaChimeraActivity;
    }

    public final void run() {
        RecaptchaChimeraActivity recaptchaChimeraActivity = this.a;
        float min = Math.min(400.0f, ((float) recaptchaChimeraActivity.b) / recaptchaChimeraActivity.d);
        RecaptchaChimeraActivity recaptchaChimeraActivity2 = this.a;
        float min2 = Math.min(600.0f, ((float) recaptchaChimeraActivity2.c) / recaptchaChimeraActivity2.d);
        this.a.f.loadUrl(String.format(Locale.US, "javascript: %s.show(%d, %d);", new Object[]{"RecaptchaMFrame", Integer.valueOf((int) min), Integer.valueOf((int) min2)}));
    }
}
