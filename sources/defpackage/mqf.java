package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: mqf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mqf extends WebViewClient {
    final /* synthetic */ mql a;

    public mqf(mql mql) {
        this.a = mql;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.a.getActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)).setFlags(268435456));
        return true;
    }
}
