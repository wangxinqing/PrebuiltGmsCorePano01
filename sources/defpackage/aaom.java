package defpackage;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.security.recaptcha.RecaptchaChimeraActivity;
import java.io.ByteArrayInputStream;

/* renamed from: aaom  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaom extends aaop {
    final /* synthetic */ RecaptchaChimeraActivity a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aaom(RecaptchaChimeraActivity recaptchaChimeraActivity) {
        super(recaptchaChimeraActivity);
        this.a = recaptchaChimeraActivity;
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        RecaptchaChimeraActivity recaptchaChimeraActivity = this.a;
        String str = RecaptchaChimeraActivity.j;
        if (!recaptchaChimeraActivity.c().a(webResourceRequest.getUrl())) {
            return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }
}
