package defpackage;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: xrs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xrs extends WebViewClient {
    final /* synthetic */ xry a;

    public xrs(xry xry) {
        this.a = xry;
    }

    public final void onPageFinished(WebView webView, String str) {
        xry xry = this.a;
        int i = xry.e;
        xry.c.postDelayed(xry.d, 200);
    }
}
