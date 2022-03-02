package defpackage;

import com.google.android.gms.recaptcha.RecaptchaChimeraActivity;

/* renamed from: zpf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zpf implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ boolean c;
    final /* synthetic */ RecaptchaChimeraActivity d;

    public zpf(RecaptchaChimeraActivity recaptchaChimeraActivity, int i, int i2, boolean z) {
        this.d = recaptchaChimeraActivity;
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final void run() {
        this.d.f.getLayoutParams().width = this.a;
        this.d.f.getLayoutParams().height = this.b;
        this.d.f.requestLayout();
        RecaptchaChimeraActivity recaptchaChimeraActivity = this.d;
        int i = this.a;
        float f = recaptchaChimeraActivity.d;
        recaptchaChimeraActivity.b((int) (((float) i) / f), (int) (((float) this.b) / f), this.c);
    }
}
