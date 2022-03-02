package defpackage;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.util.Log;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.auth.login.BrowserChimeraActivity;

/* renamed from: ggw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ggw extends WebViewClient {
    private final ggv a;
    private final fzq b;

    public ggw(ggv ggv, fzq fzq) {
        this.a = ggv;
        this.b = fzq;
    }

    public final void onPageFinished(WebView webView, String str) {
        String b2 = BrowserChimeraActivity.b(str);
        StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 19);
        sb.append("onPageFinished( ");
        sb.append(b2);
        sb.append(" ).");
        sb.toString();
        this.a.c(str);
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        String b2 = BrowserChimeraActivity.b(str);
        StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 18);
        sb.append("onPageStarted( ");
        sb.append(b2);
        sb.append(" ).");
        sb.toString();
        if (BrowserChimeraActivity.a(str, this.b)) {
            this.a.a();
        } else {
            this.a.b();
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        Log.w("GLSActivity", String.format("onReceivedError: errorCode %d, description: %s, url: %s", new Object[]{Integer.valueOf(i), str, str2}));
        this.a.a(gei.SERVER_ERROR);
        super.onReceivedError(webView, i, str, str2);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        Log.w("GLSActivity", String.format("onReceivedSslError: sslError: %s", new Object[]{sslError.toString()}));
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Deprecated
    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        Log.e("GLSActivity", "onTooManyRedirects");
        this.a.a(gei.SERVER_ERROR);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return false;
    }
}
