package defpackage;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: oot  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oot extends oos {
    private final oow c;

    public oot(HelpChimeraActivity helpChimeraActivity, nzv nzv) {
        super(helpChimeraActivity, nzv);
        this.c = new oow(helpChimeraActivity, nzv);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return this.c.a(webResourceRequest.getUrl());
    }
}
