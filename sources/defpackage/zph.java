package defpackage;

import com.google.android.gms.recaptcha.RecaptchaChimeraActivity;
import java.util.Locale;

/* renamed from: zph  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zph implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ boolean c;
    final /* synthetic */ RecaptchaChimeraActivity d;

    public zph(RecaptchaChimeraActivity recaptchaChimeraActivity, int i, int i2, boolean z) {
        this.d = recaptchaChimeraActivity;
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final void run() {
        this.d.f.loadUrl(String.format(Locale.US, "javascript: %s.shown(%d, %d, %b);", new Object[]{"RecaptchaMFrame", Integer.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.c)}));
    }
}
