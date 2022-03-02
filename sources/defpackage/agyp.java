package defpackage;

import android.net.Uri;
import android.os.Build;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.InputStream;
import java.util.Map;

/* renamed from: agyp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class agyp extends WebViewClient {
    private final agyr a;
    public boolean b = false;
    private final agyr c;

    static {
        anil.a("SaferWebViewClient");
    }

    public agyp(agyr agyr, agyr agyr2) {
        amrl.a((Object) agyr);
        this.a = agyr;
        amrl.a((Object) agyr2);
        this.c = agyr2;
    }

    private static WebResourceResponse a(boolean z) {
        if (z) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        return new WebResourceResponse("text/plain", "UTF-8", 403, "Resource not whitelisted", (Map) null, (InputStream) null);
    }

    @Deprecated
    public boolean b(String str) {
        return false;
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        boolean z = true;
        if (!this.b && !a(webResourceRequest.getUrl())) {
            z = false;
        }
        return a(z);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        boolean z;
        boolean a2 = this.a.a(webResourceRequest.getUrl());
        if (!a2) {
            z = a(webResourceRequest);
        } else {
            webResourceRequest.getUrl().toString();
            z = false;
        }
        return a(webView, a2, z);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        boolean z = true;
        if (!this.b && !a(Uri.parse(str))) {
            z = false;
        }
        return a(z);
    }

    private final boolean a(Uri uri) {
        boolean z = true;
        if (!agyq.a.matcher(uri.toString()).find() && !this.c.a(uri)) {
            z = false;
        }
        if (!z) {
            agyq.a(uri);
        }
        return z;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        boolean a2 = this.a.a(Uri.parse(str));
        return a(webView, a2, !a2 ? a(str) : false);
    }

    private static boolean a(WebView webView, boolean z, boolean z2) {
        if (z2) {
            return true;
        }
        if (z) {
            return false;
        }
        webView.loadUrl("about:invalid#zSaferWebViewz");
        return true;
    }

    public boolean a(WebResourceRequest webResourceRequest) {
        return b(webResourceRequest.getUrl().toString());
    }

    @Deprecated
    public boolean a(String str) {
        return b(str);
    }
}
