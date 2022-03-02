package defpackage;

import com.google.android.gms.recaptcha.RecaptchaChimeraActivity;

/* renamed from: zpi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zpi implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ RecaptchaChimeraActivity b;

    public zpi(RecaptchaChimeraActivity recaptchaChimeraActivity, boolean z) {
        this.b = recaptchaChimeraActivity;
        this.a = z;
    }

    public final void run() {
        if (this.a) {
            this.b.e.setVisibility(8);
            this.b.f.setVisibility(0);
        } else {
            this.b.e.setVisibility(0);
            this.b.f.setVisibility(8);
        }
        this.b.a();
    }
}
