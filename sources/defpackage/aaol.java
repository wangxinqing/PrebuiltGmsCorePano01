package defpackage;

import com.google.android.gms.security.recaptcha.RecaptchaChimeraActivity;

/* renamed from: aaol  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaol implements Runnable {
    final /* synthetic */ RecaptchaChimeraActivity a;

    public aaol(RecaptchaChimeraActivity recaptchaChimeraActivity) {
        this.a = recaptchaChimeraActivity;
    }

    public final void run() {
        RecaptchaChimeraActivity recaptchaChimeraActivity = this.a;
        if (!recaptchaChimeraActivity.i) {
            recaptchaChimeraActivity.b();
        }
    }
}
