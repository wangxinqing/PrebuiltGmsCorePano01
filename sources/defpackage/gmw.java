package defpackage;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.security.KeyChain;
import android.webkit.ClientCertRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.chimera.Activity;
import com.google.android.gms.auth.login.CustomWebView;
import java.util.Locale;

/* renamed from: gmw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gmw extends WebViewClient {
    final /* synthetic */ gmx a;

    public gmw(gmx gmx) {
        this.a = gmx;
    }

    private static final String a(String str) {
        gmx.a.a(3);
        return gmx.b(str);
    }

    public final void onPageFinished(WebView webView, String str) {
        gmx.a.c(String.format(Locale.getDefault(), "onPageFinished: %s", new Object[]{a(str)}), new Object[0]);
        gmx gmx = this.a;
        CustomWebView customWebView = gmx.c;
        this.a.a(gmx.b.a(str));
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        gmx.a.c(String.format(Locale.getDefault(), "onPageStarted: %s", new Object[]{a(str)}), new Object[0]);
        gmx gmx = this.a;
        gmx.a(gmx.c, str);
    }

    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        gmx gmx = this.a;
        CustomWebView customWebView = gmx.c;
        if (!ent.s() || !gmx.isResumed()) {
            clientCertRequest.ignore();
            return;
        }
        Activity activity = gmx.getActivity();
        KeyChain.choosePrivateKeyAlias(activity.getContainerActivity(), new gms(clientCertRequest, activity.getApplicationContext()), clientCertRequest.getKeyTypes(), clientCertRequest.getPrincipals(), clientCertRequest.getHost(), clientCertRequest.getPort(), (String) null);
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        gmx.a.d(String.format(Locale.getDefault(), "onReceivedError - errorCode: %d, description: %s, url: %s", new Object[]{Integer.valueOf(i), str, a(str2)}), new Object[0]);
        gmx gmx = this.a;
        CustomWebView customWebView = gmx.c;
        gmx.c(str);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        gmx.a.d(String.format(Locale.getDefault(), "onReceivedSslError - error: %d, toString: %s", new Object[]{Integer.valueOf(sslError.getPrimaryError()), sslError.toString()}), new Object[0]);
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        gmx gmx = this.a;
        CustomWebView customWebView = gmx.c;
        gmx.a(sslError);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        awkp.a.a();
        return null;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return this.a.a(webResourceRequest);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return this.a.d(str);
    }
}
