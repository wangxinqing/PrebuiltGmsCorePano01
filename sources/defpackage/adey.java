package defpackage;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.google.android.gms.udc.ui.AuthenticatingWebViewChimeraActivity;

/* renamed from: adey  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adey extends WebChromeClient {
    final /* synthetic */ AuthenticatingWebViewChimeraActivity a;

    public adey(AuthenticatingWebViewChimeraActivity authenticatingWebViewChimeraActivity) {
        this.a = authenticatingWebViewChimeraActivity;
    }

    public final void onProgressChanged(WebView webView, int i) {
        AuthenticatingWebViewChimeraActivity authenticatingWebViewChimeraActivity = this.a;
        jjg jjg = AuthenticatingWebViewChimeraActivity.a;
        if (authenticatingWebViewChimeraActivity.c) {
            authenticatingWebViewChimeraActivity.d.setProgress(i);
            if (i == 100) {
                this.a.d.setVisibility(8);
            }
        }
    }
}
