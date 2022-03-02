package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.google.android.gms.R;
import com.google.android.gms.security.recaptcha.RecaptchaChimeraActivity;
import java.util.concurrent.TimeUnit;

/* renamed from: aaop  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aaop extends WebViewClient {
    final /* synthetic */ RecaptchaChimeraActivity b;

    public aaop(RecaptchaChimeraActivity recaptchaChimeraActivity) {
        this.b = recaptchaChimeraActivity;
    }

    public final void onLoadResource(WebView webView, String str) {
        String str2 = RecaptchaChimeraActivity.j;
        this.b.a();
        super.onLoadResource(webView, str);
    }

    public final void onPageFinished(WebView webView, String str) {
        String str2 = RecaptchaChimeraActivity.j;
        super.onPageFinished(webView, str);
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        String str2 = RecaptchaChimeraActivity.j;
        RecaptchaChimeraActivity recaptchaChimeraActivity = this.b;
        recaptchaChimeraActivity.i = false;
        recaptchaChimeraActivity.a((Runnable) new aaol(recaptchaChimeraActivity), 10, TimeUnit.SECONDS);
        super.onPageStarted(webView, str, bitmap);
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        String str3 = RecaptchaChimeraActivity.j;
        Toast.makeText(this.b, R.string.recaptcha_service_inactive_text, 1).show();
        super.onReceivedError(webView, i, str, str2);
        RecaptchaChimeraActivity recaptchaChimeraActivity = this.b;
        recaptchaChimeraActivity.a("Internet Connection Unavailable", 7);
        recaptchaChimeraActivity.finish();
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith("https://support.google.com/recaptcha")) {
            this.b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            this.b.finish();
            return true;
        }
        RecaptchaChimeraActivity recaptchaChimeraActivity = this.b;
        String str2 = RecaptchaChimeraActivity.j;
        if (!recaptchaChimeraActivity.c().a(Uri.parse(str))) {
            return true;
        }
        return false;
    }
}
