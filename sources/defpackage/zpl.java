package defpackage;

import com.google.android.gms.recaptcha.RecaptchaChimeraActivity;

/* renamed from: zpl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zpl implements Runnable {
    final /* synthetic */ RecaptchaChimeraActivity a;

    public zpl(RecaptchaChimeraActivity recaptchaChimeraActivity) {
        this.a = recaptchaChimeraActivity;
    }

    public final void run() {
        RecaptchaChimeraActivity recaptchaChimeraActivity = this.a;
        if (!recaptchaChimeraActivity.i) {
            recaptchaChimeraActivity.b();
        }
    }
}
