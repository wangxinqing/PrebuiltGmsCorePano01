package defpackage;

import android.net.http.SslError;
import android.os.Message;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: jjn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jjn extends WebViewClient {
    final /* synthetic */ jjo a;

    public jjn(jjo jjo) {
        this.a = jjo;
    }

    public final void onPageFinished(WebView webView, String str) {
        this.a.a(true);
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.a.a(false);
    }

    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.a.a(false);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.a.a(false);
    }

    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        this.a.a(false);
    }
}
