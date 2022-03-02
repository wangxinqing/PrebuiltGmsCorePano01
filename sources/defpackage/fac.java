package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.SystemProperties;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.regex.Pattern;

/* renamed from: fac  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class fac extends WebViewClient {
    final /* synthetic */ fae a;

    public fac(fae fae) {
        this.a = fae;
    }

    public final void onPageFinished(WebView webView, String str) {
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        fae.a.b("Overriding URL: [%s].", str);
        if (Pattern.compile(String.format(awny.a.a().a(), new Object[]{SystemProperties.get("gms.auth.sw_domain", "google.com").replace(".", "\\.")})).matcher(str).find()) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (intent.resolveActivity(this.a.getContext().getPackageManager()) != null) {
            this.a.startActivity(intent);
        } else {
            fae.a.e("Unable to find the browser.", new Object[0]);
        }
        return true;
    }
}
