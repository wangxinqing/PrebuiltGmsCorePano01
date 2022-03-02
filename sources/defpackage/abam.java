package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.regex.Pattern;

/* renamed from: abam  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abam extends WebViewClient {
    final /* synthetic */ aban a;

    public abam(aban aban) {
        this.a = aban;
    }

    public final void onPageFinished(WebView webView, String str) {
        if (!((Boolean) abdl.g.c()).booleanValue()) {
            aban aban = this.a;
            iwd iwd = aban.a;
            aban.a();
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        aban.a.b("Overriding URL: [%s].", str);
        if (Pattern.compile((String) abdl.c.c()).matcher(str).find()) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        Context context = this.a.getContext();
        amrl.a((Object) context);
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            this.a.startActivity(intent);
        } else {
            aban.a.e("Unable to find the browser.", new Object[0]);
        }
        return true;
    }
}
