package defpackage;

import android.os.Build;
import android.webkit.ValueCallback;
import com.google.android.gms.security.recaptcha.RecaptchaChimeraActivity;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Locale;

/* renamed from: aaok  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaok implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ boolean b;
    final /* synthetic */ String c;
    final /* synthetic */ RecaptchaChimeraActivity d;

    public aaok(RecaptchaChimeraActivity recaptchaChimeraActivity, String str, boolean z, String str2) {
        this.d = recaptchaChimeraActivity;
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    public final void run() {
        String str = RecaptchaChimeraActivity.j;
        this.d.a();
        try {
            if (this.b) {
                this.d.f.postUrl(RecaptchaChimeraActivity.j, String.format(Locale.US, "%s=%s&%s=%s&%s=%s", new Object[]{"mav", 1, "dg", URLEncoder.encode(this.c, "UTF-8"), "mp", URLEncoder.encode(this.a, "UTF-8")}).getBytes(Charset.forName("UTF-8")));
                return;
            }
            String format = String.format(Locale.US, "%s.token('%s', '%s');", new Object[]{"RecaptchaMFrame", URLEncoder.encode(this.c, "UTF-8"), this.a});
            int i = Build.VERSION.SDK_INT;
            this.d.f.evaluateJavascript(format, (ValueCallback) null);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException("UTF-8 should be always supported", e);
        }
    }
}
