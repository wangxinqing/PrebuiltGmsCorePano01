package defpackage;

import android.content.Context;
import com.google.android.gms.security.recaptcha.RecaptchaChimeraActivity;

/* renamed from: aaoj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaoj implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ boolean c;
    final /* synthetic */ RecaptchaChimeraActivity d;

    public aaoj(RecaptchaChimeraActivity recaptchaChimeraActivity, String str, String str2, boolean z) {
        this.d = recaptchaChimeraActivity;
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final void run() {
        Context applicationContext = this.d.getApplicationContext();
        String str = this.a;
        String a2 = lxz.a(applicationContext, str.length() == 0 ? new String("recaptcha-android-") : "recaptcha-android-".concat(str), aann.a(this.b.getBytes()));
        RecaptchaChimeraActivity recaptchaChimeraActivity = this.d;
        recaptchaChimeraActivity.runOnUiThread(new aaok(recaptchaChimeraActivity, this.b, this.c, a2));
    }
}
